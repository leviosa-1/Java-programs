import javax.swing.*;
import java.awt.*;

public class CircleWithinRectangle extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Draw the rectangle
        g.drawRect(50, 50, 200, 100);
       
        // Draw the circle inside the rectangle
        g.drawOval(75, 75, 150, 50);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Circle Within Rectangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new CircleWithinRectangle());
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

