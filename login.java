package fitness;

import static fitness.adminpower.jf2;
import static fitness.details.addUser;
import static fitness.details.jf1;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.event.*;
import static fitness.details.nc;
import static fitness.details.nt;

public  class login
{
    static String str5,str1,usr;
    static JFrame jf;
    public static void login1()
    {
        jf=new JFrame("Slam Fitness");
        JLabel jl1=new JLabel("User Name");
        jl1.setBounds(150,175,90,30);
        jl1.setForeground(Color.red);
        JLabel jl3=new JLabel("User Type");
        jl3.setBounds(50,350,90,30);
        jl3.setForeground(Color.red);
        jf.setContentPane(new JLabel(new ImageIcon("gym1.jpg")));
	
        String[] str={"manager","owner"};
        JComboBox jcb=new JComboBox(str);
        jcb.setSelectedIndex(-1);
        jcb.setBounds(150,350,90,40);
        JLabel jl2=new JLabel("Password");
        jl2.setBounds(150,225,90,30);
        jl2.setForeground(Color.red);
        JTextField jtf=new JTextField(16);
        jtf.setBounds(250,175,90,30);
        JPasswordField jpf=new JPasswordField(16);
        jpf.setBounds(250,225,90,30);
        JButton jb3=new JButton("Customer Login");
        jb3.setBounds(400,350,150,30);
        JButton jb=new JButton("Login");
        jb.setBounds(250,450,90,30);
        if(jcb.getSelectedIndex()==-1)
        {
            jb.setEnabled(false);
        }
      
        jb.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                str5=jtf.getText();
                str1=jpf.getText();
                
                check();
                jf.setVisible(false);
            }
            
        });
        
        jcb.addItemListener(new ItemListener()
        {
             @Override
             public void itemStateChanged(ItemEvent ie) 
             {
                 usr=(String) ie.getItem();
                 jb.setEnabled(true);
             }
        });
        JButton jb1=new JButton("Register");
        jb1.setBounds(160,450,90,30);
       
        jb1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                jf.setVisible(false);
                JFrame jfr=new JFrame("Slam Fitness");
                JLabel jl2=new JLabel("Enter Password :");
                jl2.setBounds(10, 100, 150, 50);
                JLabel jl3=new JLabel("Enter UserName :");
                jl3.setBounds(10, 50, 150, 30);        
                 JTextField jt1 = new JTextField(15);
                  jt1.setBounds(150,50,95,30);  
                  JPasswordField jpt1 = new JPasswordField(15);
                  jpt1.setBounds(150,100,95,30);
                  JButton bb1=new JButton("create");  
                  bb1.setBounds(100,200,90,40);
                  bb1.addActionListener(new ActionListener()
                  {
                   @Override
                   public void actionPerformed(ActionEvent ae)
                   {
                       String str=jt1.getText();
                       String str2=jpt1.getText();
                       sqlr(str,str2);
                       jfr.setVisible(false);
                       
                   }                  
                  });
                  jfr.add(jl2);jfr.add(jl3);jfr.add(jt1);jfr.add(jpt1);jfr.add(bb1);
                jfr.setSize(600,600);
                jfr.setLayout(null);
                jfr.setVisible(true);
                jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            
        });
        jb3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                jf.setVisible(false);
                JFrame jfc=new JFrame("Query Page");
                JLabel j101=new JLabel("Customer name:");
                j101.setBounds(100,100,100,50);
                JTextField CustName=new JTextField();
                CustName.setBounds(100,150,100,50);
                JLabel j102=new JLabel("Customer Phno:");
                j102.setBounds(100,200,100,50);
                JTextField Cust_phno=new JTextField();
                Cust_phno.setBounds(100,250,100,50);
                JButton jb4=new JButton("Submit");
                jb4.setBounds(100,300,80,40);
                JLabel j103=new JLabel("Gym Details:");
                j103.setBounds(300,100,100,50);
                JLabel j104=new JLabel("Annual Package: 12000/-");
                j104.setBounds(300,150,300,50);
                JLabel j105=new JLabel("Half-Yearly Package: 7000/-");
                j105.setBounds(300,200,300,50);
                JLabel j106=new JLabel("Monthly Package: 1500/-");
                j106.setBounds(300,250,300,50);
                JLabel j107=new JLabel("For Further Queries please drop your details ");
                j107.setBounds(300,300,400,50);
                jb4.addActionListener(new ActionListener()
                {
                   @Override
                 public void actionPerformed(ActionEvent ae) 
                 {
                       String str1=CustName.getText();
                       String str2=Cust_phno.getText();
                       addCust(str1,str2);
                       jfc.setVisible(false);
                       jf.setVisible(true);
                 }   
            
                });
                JButton jb5=new JButton("Return");
                jb5.setBounds(300,350,80,40);
                jb5.addActionListener(new ActionListener()
                {
                   @Override
                 public void actionPerformed(ActionEvent ae) 
                 {
                       jfc.setVisible(false);
                       jf.setVisible(true);
                 }   
            
                });
                jfc.add(CustName);
                jfc.add(Cust_phno);
                jfc.add(j101);jfc.add(j102);jfc.add(j103);jfc.add(j104);jfc.add(j105);jfc.add(j106);
                jfc.add(j107);
                jfc.add(jb4);
                jfc.add(jb5);
                jfc.setSize(600,700);
                jfc.setLayout(null);
                jfc.setVisible(true);
                jfc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
        
        
        jf.add(jb);jf.add(jb1);jf.add(jcb);jf.add(jl3);jf.add(jb3);
        jf.add(jtf);jf.add(jl1);jf.add(jpf);jf.add(jl2);
        jf.setSize(600,600);
        jf.setLayout(new BorderLayout());
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    static void check()
    {
      
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","fitness","root");
            Statement  st=cn.createStatement();
            String str4="Select 'true' from login where Username='"+str5+"' and password='"+str1+"' and usertype='"+usr+"'";
            ResultSet rs=st.executeQuery(str4);
            int verify=0;
            if(rs.next()==true)
            {
                verify=1;
                
            }
            if(usr.equals("owner")&&verify==1)
            {
                System.out.println("owner");
                adminpower.adminframe();
            }
            else if(usr.equals("manager")&&verify==1)
            {
                System.out.println("manager");
                sqlq();
            }
            else
            {
                System.out.println("notexist");
                jf.setVisible(true);
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println(e);
        }
    } 
    static void sqlq()
     {
        
        
        try
        {
            
            Class.forName("oracle.jdbc.OracleDriver");         
            Connection cn1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","fitness","root");
            Statement st6=cn1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            Statement st7=cn1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            
            String cust="Select cust_name from customer";
            String train="Select trainer_name from trainer ";
            ResultSet rcust=st6.executeQuery(cust);
            ResultSet rtrain=st7.executeQuery(train); 
            if(rcust.last())
            {
                nc=rcust.getRow();
                rcust.beforeFirst();                
            }
            if(rtrain.last())
            {
                nt=rtrain.getRow();
                rtrain.beforeFirst();
            }
            System.out.println(nt+" "+nc);
            String[] cust1=new String[nc];
            String[] train1=new String[nt];
            int i=0;
            while(rcust.next())
            {            
               cust1[i]=rcust.getString("cust_name");
               i++;                
            }
            i=0;
            while(rtrain.next())
            {            
               train1[i]=rtrain.getString("trainer_name");
               i++;                
            }
           details.customer(cust1, train1); 
        }
        catch(Exception se)
        {
            System.out.println(se);
        }
     }
    static void sqlr(String st1,String st2)
     {
        
        
        try
        {
            
            Class.forName("oracle.jdbc.OracleDriver");         
            Connection cn1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","fitness","root");
            PreparedStatement st=cn1.prepareStatement("insert into login values(?,?,?)");
            st.setString(1,st1);
            st.setString(2, st2);
            st.setString(3, "manager"); 
            int i=st.executeUpdate();
            jf.setVisible(true);
        }
        catch(Exception se)
        {
            System.out.println(se);
        }
     }
    static void addCust(String str1,String str2)
    {
     
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","fitness","root");
            String q="insert into cust_det(cust_name,cust_phno) values('"+str1+"',"+str2+")";
            PreparedStatement  st=cn.prepareStatement(q);
             st.executeUpdate();
          System.out.println("working perfectly");
          
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println(e);
        }
    }
    
    public static void main(String arg[])
    {
        login1();
       
    }

   
   
}
