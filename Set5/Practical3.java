import javax.swing.*;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.*;
import java.awt.*;
class Practical3  extends JPanel implements MouseListener
{
     static JFrame frame = new JFrame();
     static Color color = Color.blue;
     Practical3()
     {
          frame.addMouseListener(this);  
     }
      public void paint(Graphics g){
        super.paintComponent(g);
         g.setColor(color);
         g.fillOval(100, 100, 250, 250);  
     }
     public void mouseClicked(MouseEvent e) {   
    }  
    public void mouseEntered(MouseEvent e) {  
    }  
    public void mouseExited(MouseEvent e) {  
    }  
    public void mousePressed(MouseEvent e) {  
          color = Color.red; 
          this.repaint();
    }  
    public void mouseReleased(MouseEvent e) {  
       color = Color.blue; 
          this.repaint();
    }  
     public static void main(String args[])
    {
    frame.setSize(500, 500);
    frame.getContentPane().add(new Practical3());
    frame.setVisible(true);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}