package dbms;

import java.awt.*;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class U3_seeall extends Frame 
{
	Button B1;
	Label L1,L2,L3,L4;
	String s1,s2,s3;
	
	
	U3_seeall()
	{
		super("CLIENT MANAGER INFORMATION WINDOW");
try
{      
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sharlin?autoReconnect=true&useSSL=false","root","root");   

		Statement stmt=con.createStatement();  
		 ResultSet rs=stmt.executeQuery("select * from clientmanager");  
		 

		while(rs.next())
		{
			s1=rs.getString(1);
		s2=rs.getString(2);
		s3=rs.getString(3);
		L1=new Label("manager id     :   "+s1);
		L2=new Label("Bank id   :   "+s2);
		L3=new Label("manager name:   "+s3);
		L4=new Label("\n");
		add(L4);
		add(L1);
		add(L2);
		add(L3);
		add(L4);
		
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
	    	 new U3();
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
