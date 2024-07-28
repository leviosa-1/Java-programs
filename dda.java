import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class dda extends JPanel {

    private int x1, y1, x2, y2;
    private JTextField x1Field ;
    private JTextField y1Field ;
    private JTextField x2Field ;
    private JTextField y2Field ;
    private JButton drawButton ;

    public dda() {
        setLayout(new BorderLayout());
        
        x1Field = new JTextField(5);
        y1Field = new JTextField(5);
        x2Field = new JTextField(5);
        y2Field = new JTextField(5);
        drawButton = new JButton("Draw Line using dda");
    
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Point 1 (x, y): "));
        inputPanel.add(x1Field);
        inputPanel.add(y1Field);
        inputPanel.add(new JLabel("Point 2 (x, y): "));
        inputPanel.add(x2Field);
        inputPanel.add(y2Field);
        inputPanel.add(drawButton);

        add(inputPanel, BorderLayout.NORTH);

        drawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                x1 = Integer.parseInt(x1Field.getText());
                y1 = Integer.parseInt(y1Field.getText());
                x2 = Integer.parseInt(x2Field.getText());
                y2 = Integer.parseInt(y2Field.getText());
                repaint();
            }
        });
    }

    private void drawDDALine(Graphics g) throws InterruptedException  {
        int dx = x2 - x1;
        int dy = y2 - y1;

        int steps = Math.max(Math.abs(dx), Math.abs(dy));

        float xIncrement = (float) dx / steps;
        float yIncrement = (float) dy / steps;

        float x = x1;
        float y = y1;
        g.setColor(Color.RED);
        for (int i = 0; i <= steps; i++) {
            g.drawLine(Math.round(x), Math.round(y), Math.round(x), Math.round(y));
            x += xIncrement;
            y += yIncrement;
            //Thread.sleep(50);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            drawDDALine(g);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("DDA Line Drawing with Input");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        dda lineDrawing = new dda();
        frame.add(lineDrawing);

        frame.setVisible(true);
    }
}
