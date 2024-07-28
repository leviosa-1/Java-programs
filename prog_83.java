import java.awt.*;
import javax.swing.*;
public class prog_83 extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
         // draw horizontal line 
         g.drawLine(10, 100, 100, 100);
         //draw perpendicular line
         g.drawLine(100, 10, 100,100);
         //draw parallel to perpendicular line 
         g.drawLine(105, 10, 105, 105);
         //drae 3-d rectangle
         g.draw3DRect(120, 80, 100, 200, getFocusTraversalKeysEnabled());
    }
    public static void main (String args[]){
     JFrame frame = new JFrame("Draw perpendicular line / parallel line");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.add(new prog_83());
     frame.setSize(300, 200);
     frame.setVisible(true);
    }
}
