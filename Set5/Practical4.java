import javax.swing.*;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
class Practical4 implements KeyListener
{

    static JFrame frame = new JFrame();
    static JLabel label = new JLabel("Hello");
    static JRadioButton r1;    
    static JRadioButton r2; 
    static JRadioButton r3; 
    Practical4()
    {
        frame.addKeyListener(this);
    }
    
      public void keyTyped(KeyEvent e) {
      }
      public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            System.out.println(e.getKeyCode());
            switch( keyCode ) { 
                 case KeyEvent.VK_UP:
                    //for up

                  break;
                case KeyEvent.VK_DOWN:
                    // for down 
                   
                  break;
                case KeyEvent.VK_LEFT:
                    // for left
                    label.setLocation(label.getX()-1,label.getY());
                  break;
                case KeyEvent.VK_RIGHT :
                     // for right
                     label.setLocation(label.getX()+1,label.getY());
                  break;
                 }   
      }
      public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();
                    System.out.println(e.getKeyCode());
            switch( keyCode ) { 
                 case KeyEvent.VK_UP:
                    //for up
                     
                  break;
                case KeyEvent.VK_DOWN:
                    // for down 
                     
                  break;
                case KeyEvent.VK_LEFT:
                    // for left
                   label.setLocation(label.getX()-1,label.getY());
                  break;
                case KeyEvent.VK_RIGHT :
                     // for right
                     label.setLocation(label.getX()+1,label.getY());
                  break;
                 }   
      }
     
  public static void main(String args[])
    {
    label.setFont(new Font("Serif", Font.PLAIN, 40));
    frame.setSize(500, 500);
    new Practical4();
    frame.setVisible(true);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(label);
     label.setForeground(Color.RED);
     r3=new JRadioButton("Blue");
     r2=new JRadioButton("Green");
     r1=new JRadioButton("Red");
    r1.setBounds(0,50,100,30);    
    r2.setBounds(0,100,100,30);  
    r3.setBounds(0,150,100,30);
    ButtonGroup bg=new ButtonGroup();    
    bg.add(r1);
    bg.add(r2);   
    bg.add(r3);   
    
    frame.add(r1);
    frame.add(r2);
    frame.add(r3);
      ActionListener listener = new ActionListener() {
       public void actionPerformed(ActionEvent e){   
           
    if(r1.isSelected()){    
        label.setForeground(Color.RED);
    }    
    if(r2.isSelected()){    
        label.setForeground(Color.GREEN);

    }  
    if(r3.isSelected()){    
        label.setForeground(Color.BLUE);

    }   
        frame.requestFocus();
}};
     r1.addActionListener(listener);  
     r2.addActionListener(listener);  
     r3.addActionListener(listener);  
    }
}