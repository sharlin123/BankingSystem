package dbms;

import java.awt.*;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class U5_seeall extends Frame 
{
	Button B1;
	Label L1,L2,L3,L4,L5,L6;
	
	String s1,s2,s3,s4,s5;
	
	
	U5_seeall()
	{
		super("ACCOUNT INFORMATION WINDOW");
try
{      
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sharlin?autoReconnect=true&useSSL=false","root","root");   

		Statement stmt=con.createStatement();  
		 ResultSet rs=stmt.executeQuery("select * from account");  
		 

		while(rs.next())
		{
			s1=rs.getString(1);
		s2=rs.getString(2);
		s3=rs.getString(3);
		s4=rs.getString(4);
		s5=rs.getString(5);
		
		L1=new Label("account id  :   "+s1);
		L2=new Label("account date  :   "+s2);
		L3=new Label(" account type  :  "+s3);
		L4=new Label("branch id  :   "+s4);
		L5=new Label("amount     :   "+s5);
		L6=new Label("\r\n");
		add(L6);
		add(L1);
		add(L2);
		add(L3);
		add(L4);
		add(L5);
		
		add(L6);
		
		}
}
catch(Exception e)
{
	System.out.print(e);
}
		
		B1=new Button("back");
		B1.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {
	    	 setVisible(false);
	    	 new U5();
	     }
		});
 
		add(B1);
	
	
		
		addWindowListener(new WindowAdapter()
		{
	        public void windowClosing(WindowEvent x)
	        {
	          dispose();
	        }
		});
		
		setBackground(Color.CYAN);
		setLayout(new FlowLayout());
		setSize(800,600);
		setVisible(true);

    }
}
