package fitness;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import static fitness.details.sqlc;
public class displayct 
{
   static void display(String s1,String s2,String s3,String s4,String s5,String s6)
   {
        JFrame jf2=new JFrame("Slam Fitness");
        Font f=new Font("TimesRoman",Font.BOLD,15);
        JLabel j11=new JLabel("Customer name:");
        j11.setBounds(50,50,200,30);
        j11.setFont(f);
        JLabel j12=new JLabel("Trainer name:");
        j12.setBounds(50,100,200,30);
        j12.setFont(f);
        JLabel j13=new JLabel("Food_name:");
        j13.setBounds(50,150,200,30);
        j13.setFont(f);
        JLabel j14=new JLabel("Food dosage:");
        j14.setBounds(50,200,200,30);
        j14.setFont(f);
        JLabel j15=new JLabel("Equitment name:");
        j15.setBounds(50,250,200,30);
        j15.setFont(f);
        JLabel j16=new JLabel("Equipment weight:");
        j16.setBounds(50,300,200,30);
        j16.setFont(f);
        JLabel j1=new JLabel(s1);
        j1.setBounds(200,50,90,30);
        j1.setFont(f);
        JLabel j2=new JLabel(s2);
        j2.setBounds(200,100,90,30);
        j2.setFont(f);
        JLabel j3=new JLabel(s3);
        j3.setBounds(200,150,90,30);
        j3.setFont(f);
        JLabel j4=new JLabel(s4);
        j4.setBounds(200,200,90,30);
        j4.setFont(f);
        JLabel j5=new JLabel(s5);
        j5.setBounds(200,250,90,30);
        j5.setFont(f);
        JLabel j6=new JLabel(s6);
        j6.setBounds(200,300,90,30);
        j6.setFont(f);
        JButton jb=new JButton("Return");
        jb.setBounds(350,400,80,40);
        jb.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                jf2.setVisible(false);
                details.jf1.setVisible(true);
            }
            
        });
        jf2.add(jb);
        jf2.add(j1);jf2.add(j2);jf2.add(j3);jf2.add(j15);jf2.add(j16);jf2.add(j6);
        jf2.add(j11);jf2.add(j12);jf2.add(j13);jf2.add(j14);jf2.add(j4);jf2.add(j5);
        jf2.setSize(600,600);
        jf2.setLayout(null);
        jf2.setVisible(true);
        jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
   }
   static void display1(String s1,String s2)
   {
       JFrame jf5=new JFrame("Slam Fitness");
       Font f=new Font("TimesRoman",Font.BOLD,15);
       JLabel j11=new JLabel("Customer name: ");
       j11.setBounds(50,50,200,30);
       j11.setFont(f);
       JLabel j12=new JLabel("Customer Phoneno: ");
       j12.setBounds(50,100,200,30);
       j12.setFont(f);
       JLabel j1=new JLabel(s1);
       j1.setBounds(200,50,90,30);
       j1.setFont(f);
       JLabel j2=new JLabel(s2);
       j2.setBounds(200,100,90,30);
       j2.setFont(f);
       JButton jb=new JButton("Return");
        jb.setBounds(350,400,80,40);
        jb.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                jf5.setVisible(false);
                details.jf1.setVisible(true);
            }
            
        });
        jf5.add(jb);
        jf5.add(j1);jf5.add(j2);
        jf5.add(j11);jf5.add(j12);
        jf5.setSize(600,600);
        jf5.setLayout(null);
        jf5.setVisible(true);
        jf5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
   }
}
