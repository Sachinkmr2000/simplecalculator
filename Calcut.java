import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.*;

public class Calcut extends JFrame {
    JButton t,s,d,m;
    JLabel l1;
    JTextField a1,a2,a3;
    Calcut(String s1)
    {
        super(s1);
    }
    Calcut()
    {

    }
    void setComponent()
    {
        l1=new JLabel("Calculator");
        a1=new JTextField();
       a2=new JTextField();
       a3=new JTextField();
        
        t=new JButton("add");
        s=new JButton("subtract");
        d=new JButton("divide");
        m=new JButton("multiply");
        setLayout(null);
        add(l1);
        add(a1);
        add(a2);
        add(a3);
        add(t);
        add(s);
        add(d);
        add(m);
        l1.setBounds(100,200,300,30);
        a1.setBounds(50,300,250,50);
        t.setBounds(50,350,100,30);
        s.setBounds(200,350,100,30);
        d.setBounds(50,400,100,30);
        m.setBounds(200,400,100,30);
         a2.setBounds(50,450,100,30);
          a3.setBounds(200,450,100,30);
        t.addActionListener(new Add());
        s.addActionListener(new Sub());
        d.addActionListener(new Divide());
        m.addActionListener(new Mult());
    }
    public static void main(String[] args) {
        Calcut s1=new Calcut("calculator");
        s1.setVisible(true);
        s1.setSize(800,800);
        s1.setComponent();
        s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    class Add implements ActionListener{
        public void actionPerformed(ActionEvent e1)
        { 
            try{
           int a= Integer.parseInt(a2.getText());
           int b= Integer.parseInt(a3.getText());
           int c=a+b;
           a1.setText(""+c);
            }
            catch(Exception e2)
            {
                a1.setText("please enter number");
            }
        }


    }
     class Sub implements ActionListener{
        public void actionPerformed(ActionEvent e1)
        {  try{
           int a= Integer.parseInt(a2.getText());
           int b= Integer.parseInt(a3.getText());
           int c=a-b;
           a1.setText(""+c);
            }
            catch(Exception e2)
            {
                a1.setText("please enter number");
            }
            
        }


    }
     class Divide implements ActionListener{
        public void actionPerformed(ActionEvent e1)
        {  try{
           int a= Integer.parseInt(a2.getText());
           int b= Integer.parseInt(a3.getText());
           int c=a/b;
           a1.setText(""+c);
            }
            catch(Exception e2)
            {
                a1.setText("please enter number");
            }
            
        }


    }
     class Mult implements ActionListener{
        public void actionPerformed(ActionEvent e1)
        {  try{
           int a= Integer.parseInt(a2.getText());
           int b= Integer.parseInt(a3.getText());
           int c=a*b;
           a1.setText(""+c);
            }
            catch(Exception e2)
            {
                a1.setText("please enter number");
            }
            
        }


    }
}

    

