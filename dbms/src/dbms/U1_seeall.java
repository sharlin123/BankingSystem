package dbms;

import java.awt.*;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class U1_seeall extends Frame 
{
	Button B1;
	Label L1,L2,L3,L4;
	String s1,s2,s3;
	
	
	U1_seeall()
	{
		super("BANK INFORMATION WINDOW");
try
{      
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sharlin?autoReconnect=true&useSSL=false","root","root");   

		Statement stmt=con.createStatement();  
		 ResultSet rs=stmt.executeQuery("select * from bank");  
		 

		while(rs.next())
		{
			s1=rs.getString(1);
		s2=rs.getString(2);
		s3=rs.getString(3);
		String ss="\r\n";
		final String NL = System.getProperty("line.separator");
		L1=new Label("Bank id     :   "+s1);
		L2=new Label("Bank name   :   "+s2);
		L3=new Label("Bank address:   "+s3 +NL );
		L4=new Label(NL);
		
	
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
	    	 new U1();
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
