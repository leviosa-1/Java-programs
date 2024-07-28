import java.awt.*;
import javax.swing.*;
public class prog_82 extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        // draw horizontal line 
        g.drawLine(10, 100, 100, 100);
    }
    public static void main (String args[]){
      JFrame frame = new JFrame("Draw Horizontal line ");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(new prog_82());
      frame.setSize(300, 200);
      frame.setVisible(true);
    }
}
