package fitness;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class adminpower 
{
    static JFrame jf2;
    static void adminframe()
    {
      jf2=new JFrame("Owner");
      JButton jb=new JButton("Delete");
      jb.setBounds(150,250,80,40);
      JButton jb1=new JButton("Update");
      jb1.setBounds(250,250,80,40);
      JButton jb2=new JButton("Logout");
      jb2.setBounds(350,250,80,40);
      jb.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
               jf2.setVisible(false);
               JFrame jf4=new JFrame("Delete");
               JLabel jl3=new JLabel("User Name");
               jl3.setBounds(150,200,90,30);
               JTextField jtf=new JTextField(16);
               jtf.setBounds(250,200,90,30);
               JButton jb2=new JButton("Confirm");
               jb2.setBounds(200,250,80,40);
               jb2.addActionListener(new ActionListener()
               {
                  @Override
                  public void actionPerformed(ActionEvent ae) 
                  {
                       String str=jtf.getText();
                       sqldel(str);
                       jf4.setVisible(false);
                       jf2.setVisible(true);
                  }
            
               });
               jf4.setSize(500,500);jf4.add(jl3);jf4.add(jtf);
               jf4.setLayout(null);jf4.add(jb2);
               jf4.setVisible(true);
               jf4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              
            }
            
        });
       jb1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                
                jf2.setVisible(false);
                JFrame jfr=new JFrame("Update");
                JLabel jl2=new JLabel("Enter Password :");
                jl2.setBounds(10, 100, 150, 50);
                JLabel jl3=new JLabel("Enter UserName :");
                jl3.setBounds(10, 50, 150, 30);        
                 JTextField jt1 = new JTextField(15);
                  jt1.setBounds(150,50,95,30);  
                  JPasswordField jpt1 = new JPasswordField(15);
                  jpt1.setBounds(150,100,95,30);
                  JButton bb1=new JButton("Confirm");  
                  bb1.setBounds(100,200,90,40);
                  bb1.addActionListener(new ActionListener()
                  {
                   @Override
                   public void actionPerformed(ActionEvent ae)
                   {
                       String str=jt1.getText();
                       String str2=jpt1.getText();
                       sqlreg(str,str2);
                       jfr.setVisible(false);
                       jf2.setVisible(true); 
                   }                  
                  });
                  jfr.add(jl2);jfr.add(jl3);jfr.add(jt1);jfr.add(jpt1);jfr.add(bb1);
                jfr.setSize(600,600);
                jfr.setLayout(null);
                jfr.setVisible(true);
                jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
         }); 
       jb2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                jf2.setVisible(false);
                login.jf.setVisible(true);
            }
            
        });
         jf2.add(jb);jf2.add(jb1);jf2.add(jb2);
         jf2.setSize(500,500);
         jf2.setLayout(null);
         jf2.setVisible(true);
         jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    static void sqldel(String str)
    {
     try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","fitness","root");
           
            String str4="Delete from login where Username='"+str+"'";
             PreparedStatement  st=cn.prepareStatement(str4);
             st.executeUpdate();
            
            
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    static void sqlreg(String str1,String str2)
    {
     try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","fitness","root");
           
            String str4="update login set password='"+str2+"' where Username='"+str1+"'";
             PreparedStatement  st=cn.prepareStatement(str4);
             st.executeUpdate();
            
            
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
