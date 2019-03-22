package dbms;

import java.awt.*;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BranchInfo extends Frame 
{
	Button B1;
	Label L1,L2,L3,L4;
	String s1,s2,s3,s4;
	
	
	BranchInfo(String ss1,String ss2)
	{
		super("BRANCH INFORMATION WINDOW");
try
{
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sharlin?autoReconnect=true&useSSL=false","root","root");   
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select branch.branch_id,bank_id,branch_name,branch_address from branch natural join account where account_id='"+ss2+"';");  

		rs.next();
		s1=rs.getString(1);
		s2=rs.getString(2);
		s3=rs.getString(3);
		s4=rs.getString(4);
}
catch(Exception e)
{
	System.out.print(e);
}
		
		L1=new Label("Branch Id         :   "+s1);
		L2=new Label("Bank  Id         :   "+s2);
		L3=new Label("Branch  Name      :   "+s3);
		L4=new Label("Branch Address    :   "+s4);	
 
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
		add(L4);
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
