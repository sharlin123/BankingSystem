package dbms;

import java.awt.*;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ManagerSup extends Frame 
{
	Button B1;
	Label L1,L2,L3;
	String s1,s2,s3;
	long s6;
	
	ManagerSup(String ss1,String ss2)
	{
		super("CLIENT INFORMATION WINDOW");
try
{
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sharlin?autoReconnect=true&useSSL=false","root","root");   
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select manager_id,bank_id,cm_name from clientmanager natural join client  where client_id='"+ss1+"';");  
        
		rs.next();
		s1=rs.getString(1);
		s2=rs.getString(2);
		s3=rs.getString(3);
}
catch(Exception e)
{
	System.out.print(e);
}
		
		L1=new Label("Manager id     :   "+s1);
		L2=new Label("Bank name      :   "+s2);
		L3=new Label("Name           :   "+ s3);
		
		
 
		B1=new Button("back");
		B1.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {
	    	 setVisible(false);
	    	 new Client(ss1,ss2);
	     }
		});
 
		
		add(L1);
		add(L2);
		add(L3);
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
