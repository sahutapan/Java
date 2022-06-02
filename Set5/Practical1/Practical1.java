import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.net.URL;  
import java.util.*;
class Practical1
{
   static JLabel label = new JLabel("Your Turn");
   static JButton button1=new JButton(); 
   static JButton button2=new JButton(); 
   static JButton button3=new JButton(); 
   static JButton button4=new JButton(); 
   static JButton button5=new JButton(); 
   static JButton button6=new JButton(); 
   static JButton button7=new JButton(); 
   static JButton button8=new JButton(); 
   static JButton button9=new JButton();
    static String flag="X";    
    static int [][]arr = new int[3][3];
    static ArrayList<Integer> list=new ArrayList<Integer>();

    public static void onClick(JButton btn,String s)
    {
      File file = new File(s+".gif");
             URL url=null;
           try{
             url = file.toURI().toURL();
           }
           catch(Exception ex)
           {}
           ImageIcon image = new ImageIcon(new ImageIcon(url).getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
            btn.setIcon(image);
            
    }
    public static void disable()
    {
        arr[0][0]=3;
        arr[0][1]=3;
        arr[0][2]=3;
        arr[1][0]=3;
        arr[1][1]=3;
        arr[1][2]=3;
        arr[2][0]=3;
        arr[2][1]=3;
        arr[2][2]=3;
    }
    public static boolean isWin(int x)
    {
      if(arr[0][0]==x && arr[0][1]==x && arr[0][2]==x)
       {
         disable();
         return true;
       } 
      if(arr[1][0]==x && arr[1][1]==x && arr[1][2]==x)
         {
         disable();
         return true;
       } 
      if(arr[2][0]==x && arr[2][1]==x && arr[2][2]==x)
         {
         disable();
         return true;
       } 
      if(arr[0][0]==x && arr[1][0]==x && arr[2][0]==x)
        {
         disable();
         return true;
       } 
      if(arr[0][1]==x && arr[1][1]==x && arr[2][1]==x)
        {
         disable();
         return true;
       } 
     if(arr[0][2]==x && arr[1][2]==x && arr[2][2]==x)
        {
         disable();
         return true;
       } 
     if(arr[0][0]==x && arr[1][1]==x && arr[2][2]==x)
        {
         disable();
         return true;
       } 
    if(arr[0][2]==x && arr[1][1]==x && arr[2][0]==x)
         {
         disable();
         return true;
       } 
      return false;
    }
    public static void rob()
    { 
      if(arr[0][0]!=3)
      {

      Random random=new Random();
      int x=random.nextInt((list.size()-1));
        
      if(list.get(x)==1)
        {
          arr[0][0]=-1;
          onClick(button1,flag);
          list.remove(list.indexOf(1));
        }
        else if(list.get(x)==2)
        {
          arr[0][1]=-1;
          onClick(button2,flag);
          list.remove(list.indexOf(2));
        }
         else if(list.get(x)==3)
        {
          arr[0][2]=-1;
          onClick(button3,flag);
          list.remove(list.indexOf(3));
        }
         else if(list.get(x)==4)
        {
          arr[1][0]=-1;
          onClick(button4,flag);
     list.remove(list.indexOf(4));
        }
         else if(list.get(x)==5)
        {
          arr[1][1]=-1;
          onClick(button5,flag);
          list.remove(list.indexOf(5));
        }
        else if(list.get(x)==6)
        {
          arr[1][2]=-1;
          onClick(button6,flag);
          list.remove(list.indexOf(6));
        }
        else if(list.get(x)==7)
        {
          arr[2][0]=-1;
          onClick(button7,flag);
         list.remove(list.indexOf(7));
        }
        else if(list.get(x)==8)
        {
          arr[2][1]=-1;
          onClick(button8,flag);
          list.remove(list.indexOf(8));
        }
        else if(list.get(x)==9)
        {
          arr[2][2]=-1;
          onClick(button9,flag);
          list.remove(list.indexOf(9));
        }
        label.setText("Your Turn");
        if(isWin(-1))
          label.setText("You lose!!");
        flag="X";}
    }
    public static void main(String args[]) throws Exception
    {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        
        JFrame frame= new JFrame("Tic Tac Toe");
        frame.setVisible(true);
        frame.setLayout(new BorderLayout(3,3));
        frame.setSize(600,700);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setBounds(0,0,600,200);
      
        panel.add(label);
        frame.add(panel,BorderLayout.NORTH);
        JPanel grid = new JPanel();
        grid.setBounds(200,200,600,600);
        grid.setLayout(new GridLayout(3,3));
        frame.add(grid);
        grid.add(button1);
        grid.add(button2);
        grid.add(button3);
        grid.add(button4);
        grid.add(button5);
        grid.add(button6);
        grid.add(button7);
        grid.add(button8);
        grid.add(button9);
        button1.doClick();
       
        
        button1.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
           if(arr[0][0]==0 )
           {
            onClick(button1,flag);
            if(flag=="X")
             {
                flag="O";
                arr[0][0]=1;
                label.setText("Computer Turn");

                if(isWin(1))
                  label.setText("You Win!!");
                list.remove(list.indexOf(1));
                rob();
             }
           }
        }  
        }); 
        button2.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
            if(arr[0][1]==0)
           {
            onClick(button2,flag);
            if(flag=="X")
             {
                flag="O";
                arr[0][1]=1;
                label.setText("Computer Turn");
                if(isWin(1))
                  label.setText("You Win!!");
                  list.remove(list.indexOf(2));
                rob();
             }
           }
        }  
        });  

        button3.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
            if(arr[0][2]==0)
           {
            onClick(button3,flag);
            if(flag=="X")
             {
                flag="O";
                arr[0][2]=1;
                label.setText("Computer Turn");
                 if(isWin(1))
                  label.setText("You Win!!");
                  list.remove(list.indexOf(3));
                rob();
             }
           }
        }  
        });
        button4.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
           if(arr[1][0]==0)
           {
            onClick(button4,flag);
            if(flag=="X")
             {
                flag="O";
                arr[1][0]=1;
                label.setText("Computer Turn");
                 if(isWin(1))
                  label.setText("You Win!!");
                  list.remove(list.indexOf(4));
                rob();
             }
           }
        }  
        });  

        button5.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
           if(arr[1][1]==0)
           {
            onClick(button5,flag);
            if(flag=="X")
             {
                flag="O";
                arr[1][1]=1;
                label.setText("Computer Turn");
                 if(isWin(1))
                  label.setText("You Win!!");
                  list.remove(list.indexOf(5));
                rob();
             }
           }
        }  
        }); 
        button6.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
           if(arr[1][2]==0)
           {
            onClick(button6,flag);
            if(flag=="X")
             {
                flag="O";
                arr[1][2]=1;
                label.setText("Computer Turn");
                 if(isWin(1))
                  label.setText("You Win!!");
                  list.remove(list.indexOf(6));
                rob();
             }
           }
        }  
        }); 
        button7.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
           if(arr[2][0]==0)
           {
            onClick(button7,flag);
            if(flag=="X")
             {
                flag="O";
                arr[2][0]=1;
                label.setText("Computer Turn");
                 if(isWin(1))
                  label.setText("You Win!!");
                  list.remove(list.indexOf(7));
                rob();
             }
           }
        }  
        }); 
        button8.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
            if(arr[2][1]==0)
           {
            onClick(button8,flag);
            if(flag=="X")
             {
                flag="O";
                arr[2][1]=1;
                label.setText("Computer Turn");
                 if(isWin(1))
                  label.setText("You Win!!");
                  list.remove(list.indexOf(8));
                rob();
             }
           }
        }  
        }); 
        button9.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
           if(arr[2][2]==0)
           {
            onClick(button9,flag);
            if(flag=="X")
             {
                flag="O";
                arr[2][2]=1;
                label.setText("Computer Turn");
                 if(isWin(1))
                  label.setText("You Win!!");
                  list.remove(list.indexOf(9));
                rob();
             }
           }
        }  
        }); 
    }
}