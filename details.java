package fitness;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.scene.layout.Pane;
import javax.swing.*;
import static fitness.adminpower.sqlreg;
import static fitness.details.addUser;
import static fitness.login.jf;

public class details 
{
    static JFrame jf1;
    static String sc;
    static String sfn,sfd,sen,sew,stn,scn;
    static int nc=0;
    static int nt=0;
    static void sample(String st)
    {
        if(st!=null)
        { 
           sc=st;
        }
    }
    static void sample1(String st)
    {
       if(st!=null)
        { 
           sc=st;
        }
    }
    static void customer(String cust[],String train[])
    {
        jf1=new JFrame("Slam Fitness");
        JComboBox jcb=new JComboBox();
        for(int i=0;i<nc;i++)
        {
            jcb.addItem(cust[i]);
        }
        jcb.setBounds(150,50,90,30);
        JComboBox jcb1=new JComboBox();
        for(int i=0;i<nt;i++)
        {
            jcb1.addItem(train[i]);
        }
        jcb1.setBounds(150,100,90,30);
        jcb.setSelectedIndex(-1);
        jcb1.setSelectedIndex(-1);
        JLabel jl3=new JLabel("OR");
        jl3.setBounds(50,75,90,30);
        JLabel jl2=new JLabel("Trainer name:");
        jl2.setBounds(50,100,90,30);
        JLabel jl1=new JLabel("Customer name:");
        jl1.setBounds(50,50,120,30);
        JButton jb=new JButton("Logout");
        jb.setBounds(450,450,90,30);
        JButton jb1=new JButton("NEXT");
        jb1.setBounds(350,450,90,30);
        JButton jb2=new JButton("Add Entity");
        jb2.setBounds(200,450,120,30);
        JButton jb3=new JButton("View Queries");
        jb3.setBounds(75,450,120,30);
        JButton jb4=new JButton("Delete Queries");
        jb4.setBounds(75,350,120,30);
        jf1.add(jb4);
        jb1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                sqlc(sc);
                jf1.setVisible(false);
            }
            
        });
        jb4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
               jf.setVisible(false);
               JFrame jf4=new JFrame("Delete Query");
               JLabel jl1=new JLabel("Customer Name");
               jl1.setBounds(150,200,120,30);
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
                       jf.setVisible(true);
                  }
            
               });
               jf4.setSize(500,500);jf4.add(jl1);jf4.add(jtf);
               jf4.setLayout(null);jf4.add(jb2);
               jf4.setVisible(true);
               jf4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
        jb3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                jf1.setVisible(false);
                showq();
            }
            
        });
        jb.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                jf1.setVisible(false);
                login.jf.setVisible(true);
            }
            
        });
        jb2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                jf1.setVisible(false);
                JFrame jfr=new JFrame("Add Entity");
                JLabel j101=new JLabel("Customer name:");
                j101.setBounds(100,100,100,50);
                JTextField CustName=new JTextField();
                CustName.setBounds(100,150,100,50);
                JLabel j102=new JLabel("Customer ID:");
                j102.setBounds(100,200,100,50);
                JTextField Cust_id=new JTextField();
                Cust_id.setBounds(100,250,100,50);
                JLabel j103=new JLabel("Customer Addr:");
                j103.setBounds(100,300,100,50);
                JTextField Cust_addr=new JTextField();
                Cust_addr.setBounds(100,350,100,50);
                JLabel j104=new JLabel("Customer Phno:");
                j104.setBounds(100,400,100,50);
                JTextField Cust_phno=new JTextField();
                Cust_phno.setBounds(100,450,100,50);
                JLabel j105=new JLabel("Customer Age:");
                j105.setBounds(100,500,100,50);
                JTextField Cust_age=new JTextField();
                Cust_age.setBounds(100,550,100,50);
                JLabel j106=new JLabel("Customer Sex:");
                j106.setBounds(100,600,100,50);
                JTextField Cust_sex=new JTextField();
                Cust_sex.setBounds(100,650,100,50);
                JLabel j107=new JLabel("Trainer name:");
                j107.setBounds(250,100,100,50);
                JTextField TName=new JTextField();
                TName.setBounds(250,150,100,50);
                JLabel j108=new JLabel("Trainer ID:");
                j108.setBounds(250,200,100,50);
                JTextField T_id=new JTextField();
                T_id.setBounds(250,250,100,50);
                JLabel j109=new JLabel("Trainer Phno:");
                j109.setBounds(250,300,100,50);
                JTextField T_phno=new JTextField();
                T_phno.setBounds(250,350,100,50);
                JLabel j110=new JLabel("Trainer Age:");
                j110.setBounds(250,400,100,50);
                JTextField T_age=new JTextField();
                T_age.setBounds(250,450,100,50);
                JLabel j111=new JLabel("Trainer Sex:");
                j111.setBounds(250,500,100,50);
                JTextField T_sex=new JTextField();
                T_sex.setBounds(250,550,100,50);
                JLabel j112=new JLabel("Customer ID:");
                j112.setBounds(250,600,100,50);
                JTextField T_custid=new JTextField();
                T_custid.setBounds(250,650,100,50);
                JLabel j113=new JLabel("Equipment ID:");
                j113.setBounds(400,200,100,50);
                JTextField E_id=new JTextField();
                E_id.setBounds(400,250,100,50);
                JLabel j114=new JLabel("Equipment Name:");
                j114.setBounds(400,300,100,50);
                JTextField E_name=new JTextField();
                E_name.setBounds(400,350,100,50);
                JLabel j115=new JLabel("Equipment Weight:");
                j115.setBounds(400,400,100,50);
                JTextField E_weight=new JTextField();
                E_weight.setBounds(400,450,100,50);
                JLabel j116=new JLabel("Trainer ID:");
                j116.setBounds(400,500,100,50);
                JTextField E_tid=new JTextField();
                E_tid.setBounds(400,550,100,50);
                JLabel j117=new JLabel("Food ID:");
                j117.setBounds(550,200,100,50);
                JTextField F_id=new JTextField();
                F_id.setBounds(550,250,100,50);
                JLabel j118=new JLabel("Food Name:");
                j118.setBounds(550,300,100,50);
                JTextField F_name=new JTextField();
                F_name.setBounds(550,350,100,50);
                JLabel j119=new JLabel("Food Dosage:");
                j119.setBounds(550,400,100,50);
                JTextField F_dos=new JTextField();
                F_dos.setBounds(550,450,100,50);
                JLabel j120=new JLabel("Customer ID:");
                j120.setBounds(550,500,100,50);
                JTextField F_cid=new JTextField();
                F_cid.setBounds(550,550,100,50);
                JButton bb2=new JButton("Add Entity");
                bb2.setBounds(700,300,100,50);
                bb2.addActionListener(new ActionListener()
                  {
                   @Override
                   public void actionPerformed(ActionEvent ae)
                   {
                       String str1=CustName.getText();
                       String str2=Cust_id.getText();
                       String str3=Cust_addr.getText();
                       String str4=Cust_phno.getText();
                       String str5=Cust_age.getText();
                       String str6=Cust_sex.getText();
                       addUser(str1,str2,str3,str4,str5,str6);
                       String str7=TName.getText();
                       String str8=T_id.getText();
                       String str9=T_phno.getText();
                       String str10=T_age.getText();
                       String str11=T_sex.getText();
                       String str12=T_custid.getText();
                       addT(str7,str8,str9,str10,str11,str12);
                       String str13=E_id.getText();
                       String str14=E_name.getText();
                       String str15=E_weight.getText();
                       String str16=E_tid.getText();
                       addE(str13,str14,str15,str16);
                       String str17=F_id.getText();
                       String str18=F_name.getText();
                       String str19=F_dos.getText();
                       String str20=F_cid.getText();
                       addF(str17,str18,str19,str20);
                       jfr.setVisible(false);
                       jf1.setVisible(true); 
                   }                  
                  });
                JButton jb=new JButton("Return");
                jb.setBounds(700,400,80,40);
                jb.addActionListener(new ActionListener()
                {
                   @Override
                 public void actionPerformed(ActionEvent ae) 
                 {
                       jfr.setVisible(false);
                        details.jf1.setVisible(true);
                 }   
            
                });
                jfr.add(CustName);
                jfr.add(Cust_id);
                jfr.add(Cust_addr);
                jfr.add(Cust_phno);
                jfr.add(Cust_age);
                jfr.add(Cust_sex);
                jfr.add(j101);jfr.add(j102);jfr.add(j103);jfr.add(j104);jfr.add(j105);jfr.add(j106);
                jfr.add(bb2);
                jfr.add(TName);
                jfr.add(T_id);
                jfr.add(T_custid);
                jfr.add(T_phno);
                jfr.add(T_age);
                jfr.add(T_sex);
                jfr.add(j107);jfr.add(j108);jfr.add(j109);jfr.add(j110);jfr.add(j111);jfr.add(j112);
                jfr.add(jb);
                jfr.add(E_id);
                jfr.add(E_name);
                jfr.add(E_weight);
                jfr.add(E_tid);
                jfr.add(j113);jfr.add(j114);jfr.add(j115);jfr.add(j116);
                jfr.add(F_id);
                jfr.add(F_name);
                jfr.add(F_dos);
                jfr.add(F_cid);
                jfr.add(j117);jfr.add(j118);jfr.add(j119);jfr.add(j120);
                jfr.setSize(800,800);
                jfr.setLayout(null);
                jfr.setVisible(true);
                jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             }
            
        });
        jcb.addItemListener(new ItemListener()
        {
             @Override
             public void itemStateChanged(ItemEvent ie) 
             {
                 String str=(String) ie.getItem();
                 sample(str);           
             }
        });
        jcb1.addItemListener(new ItemListener()
        {
             @Override
             public void itemStateChanged(ItemEvent ie) 
             {
                 String str=(String) ie.getItem();
                 sample1(str);           
             }
        });
        
        jf1.add(jb);jf1.add(jl3);jf1.add(jcb1);
        jf1.add(jb2);
        jf1.add(jb3);
        jf1.add(jb1);
        jf1.add(jcb);jf1.add(jl1);jf1.add(jl2);
        jf1.setSize(600,600);
        jf1.setLayout(null);
        jf1.setVisible(true);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    static void sqlc(String str)
    {
     
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","fitness","root");
            Statement  st=cn.createStatement();
            String str4="select food_name,food_dosage,equip_name,cust_name,equip_weight,trainer_name from trainer t,customer c,equipment e,food_chart f where c.cust_name='"+str+"' and c.cust_id=f.cust_id and f.cust_id=t.cust_id and t.trainer_id=e.trainer_id";
            String str5="select cust_name,trainer_name,food_name,food_dosage,equip_name,equip_weight from food_chart f,equipment e,customer c,trainer t  where trainer_name='"+str+"' and t.cust_id=c.cust_id and t.trainer_id=e.trainer_id and c.cust_id=f.cust_id";
            ResultSet rs=st.executeQuery(str4);
            
            if(rs.next()==true)
            {
                sfn=rs.getString("food_name");
                sfd=rs.getString("food_dosage");
                sen=rs.getString("equip_name");
                sew=rs.getString("equip_weight");
                stn=rs.getString("trainer_name");       
                scn=rs.getString("cust_name");
            }
            ResultSet rs1=st.executeQuery(str5);
            if(rs1.next()==true)
            {
                sfn=rs1.getString("food_name");
                sfd=rs1.getString("food_dosage");
                sen=rs1.getString("equip_name");
                sew=rs1.getString("equip_weight");
                stn=rs1.getString("trainer_name");       
                scn=rs1.getString("cust_name");
            }
            displayct.display(scn,stn,sfn,sfd,sen,sew);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
    } 

    static void addUser(String str1,String str2,String str3,String str4,String str5,String str6)
    {
     
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","fitness","root");
            String q="insert into customer(cust_name,cust_id,city,phone_no,age,sex) values('"+str1+"',"+str2+",'"+str3+"',"+str4+","+str5+",'"+str6+"')";
            PreparedStatement  st=cn.prepareStatement(q);
             st.executeUpdate();
          System.out.println("hello");
          
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println(e);
        }
    }
    static void addT(String str1,String str2,String str3,String str4,String str5,String str6)
    {
     
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","fitness","root");
            String q="insert into trainer(trainer_name,trainer_id,phone_no,age,sex,cust_id) values('"+str1+"',"+str2+","+str3+","+str4+",'"+str5+"',"+str6+")";
            PreparedStatement  st=cn.prepareStatement(q);
             st.executeUpdate();
          System.out.println("hi");
          
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println(e);
        }
    }
    static void addE(String str1,String str2,String str3,String str4)
    {
     
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","fitness","root");
            String q="insert into equipment(equip_id,equip_name,equip_weight,trainer_id) values("+str1+",'"+str2+"','"+str3+"',"+str4+")";
            PreparedStatement  st=cn.prepareStatement(q);
             st.executeUpdate();
          System.out.println("bye");
          
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println(e);
        }
    }
    static void addF(String str1,String str2,String str3,String str4)
    {
     
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","fitness","root");
            String q="insert into food_chart(food_id,food_name,food_dosage,cust_id) values('"+str1+"','"+str2+"','"+str3+"',"+str4+")";
            PreparedStatement  st=cn.prepareStatement(q);
             st.executeUpdate();
          System.out.println("working");
          
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println(e);
        }
    }
    static void showq()
    {
     
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","fitness","root");
            Statement  st=cn.createStatement();
            String str4="select cust_name,cust_phno from cust_det";
            ResultSet rs=st.executeQuery(str4);
            
            if(rs.next()==true)
            {
                sfn=rs.getString("cust_name");
                sfd=rs.getString("cust_phno");
            }
            
            displayct.display1(sfn,sfd);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println(e);
        }
    }
    static void sqldel(String str)
    {
     try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","fitness","root");
           
            String str4="Delete from cust_det where cust_name='"+str+"'";
             PreparedStatement  st=cn.prepareStatement(str4);
             st.executeUpdate();
            
            
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}