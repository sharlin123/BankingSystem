package dbms;

import java.awt.*;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class U4_seeall extends Frame 
{
	Button B1;
	Label L1,L2,L3,L4,L5,L6,L7,L8;
	String s1,s2,s3,s4,s5,s6,s7;
	
	
	U4_seeall()
	{
		super("CLIENT INFORMATION WINDOW");
try
{      
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sharlin?autoReconnect=true&useSSL=false","root","root");   

		Statement stmt=con.createStatement();  
		 ResultSet rs=stmt.executeQuery("select * from client");  
		 

		while(rs.next())
		{
			s1=rs.getString(1);
		s2=rs.getString(2);
		s3=rs.getString(3);
		s4=rs.getString(4);
		s5=rs.getString(5);
		s6=rs.getString(6);
		s7=rs.getString(7);
		
		L1=new Label("client id  :    " + s1);
		L2=new Label("client name  :   "+ s2);
		L3=new Label(" client address  :  " + s3);
		L4=new Label(" manager id  :    "+ s4);
		L5=new Label(" account id  :    " + s5);
		L6=new Label(" client phone  :   "+ s6 );
		L7=new Label(" pin  :   " + s7);
		L8=new Label(" \r\n");
		add(L8);
		add(L1);
		add(L2);
		add(L3);
		add(L4);
		add(L5);
		add(L6);
		add(L7);
		
		add(L8);
		
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
	    	 new U4();
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
