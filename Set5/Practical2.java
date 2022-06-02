import javax.swing.*;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.*;
class Practical2  extends JPanel implements KeyListener
{
    static int x=0,y=0;
    static JFrame frame = new JFrame();
    Practical2()
    {
        frame.addKeyListener(this);
    }
      public void paint(Graphics g){
        super.paintComponent(g);
         g.drawOval(x, y, 50, 50);  
     }
    
      public void keyTyped(KeyEvent e) {
        
      
      }
      public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
                    System.out.println(e.getKeyCode());
            switch( keyCode ) { 
                 case KeyEvent.VK_UP:
                    //for up
                    y--;
                    this.repaint(); 
                  break;
                case KeyEvent.VK_DOWN:
                    // for down 
                    y++;
                    this.repaint(); 
                  break;
                case KeyEvent.VK_LEFT:
                    // for left
                    x--;
                    this.repaint(); 
                  break;
                case KeyEvent.VK_RIGHT :
                     // for right
                     x++;
                    this.repaint(); 
                  break;
                 }   
      }
      public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();
                    System.out.println(e.getKeyCode());
            switch( keyCode ) { 
                 case KeyEvent.VK_UP:
                    //for up
                    y--;
                    this.repaint(); 
                  break;
                case KeyEvent.VK_DOWN:
                    // for down 
                    y++;
                    this.repaint(); 
                  break;
                case KeyEvent.VK_LEFT:
                    // for left
                    x--;
                    this.repaint(); 
                  break;
                case KeyEvent.VK_RIGHT :
                     // for right
                     x++;
                    this.repaint(); 
                  break;
                 }   
      }
  public static void main(String args[])
    {
    
    frame.setSize(500, 500);
    frame.getContentPane().add(new Practical2());
    frame.setVisible(true);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}