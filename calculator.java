/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

public class Calculator
{
    public static void main(String args[])
    {
        JFrame f=new JFrame("calculator");
        
        JTextField jt1=new JTextField();
        JTextField jt2=new JTextField();
        JButton b1=new JButton("add");
        JButton b2=new JButton("subtract");
        JButton b3=new JButton("multiply");
        JButton b4=new JButton("divison");
        JLabel l=new JLabel();
        
        jt1.setBounds(100,100,140,40);
        jt2.setBounds(300,100,140,40);
        
        b1.setBounds(100,220,160,50);
        b2.setBounds(300,220,160,50);
        b3.setBounds(100,300,160,50);
        b4.setBounds(300,300,160,50);
        
        l.setBounds(190,160,180,50);
        
        f.add(jt1);f.add(jt2);
        f.add(b4);f.add(b3);f.add(b2);f.add(b1);f.add(l);
        
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                int a = Integer.parseInt(jt1.getText());
                int b= Integer.parseInt(jt2.getText());
                int add=a+b;
                String s3=String.valueOf(add);
                l.setText("Answer is : "+ s3);     

            }
            
        });
        
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                int a = Integer.parseInt(jt1.getText());
                int b= Integer.parseInt(jt2.getText());
                int sub=a-b;
                String s3=String.valueOf(sub);
                l.setText("Answer is : "+ s3); 
                
            }
            
        });
        
        b3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                int a = Integer.parseInt(jt1.getText());
                int b= Integer.parseInt(jt2.getText());
                int mul=a*b;
                String s3=String.valueOf(mul);
                l.setText("Answer is : "+ s3); 
                
            }
            
        });
        
        b4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                float a = Integer.parseInt(jt1.getText());
                float b= Integer.parseInt(jt2.getText());
                float divide=a/b;
                String s3=String.valueOf(divide);
                l.setText("Answer is : "+ s3); 
                
            }
            
        });
        
        f.setSize(600,700);
        f.setLayout(null);
        f.setVisible(true);
        
    }
}
