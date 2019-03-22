package dbms;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Withdraw extends Frame 
{
	Button B1,B2;
	Label L1;
	TextField T1;
	String s1;
	Withdraw(String ss1,String ss2)
	{
		super("WITHDRAW WINDOW");

		L1=new Label("Amount to be withdrawn : ");
	    T1=new TextField(100);
		
	    
		B1=new Button("ok");
		B1.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {
	    	 try
	    	 {
	    	 s1=T1.getText();
	    	
	         Class.forName("com.mysql.jdbc.Driver");  
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sharlin?autoReconnect=true&useSSL=false","root","root");   
			 Statement stmt=con.createStatement();  
	    	 
			 ResultSet rs=stmt.executeQuery("select amount from account where account_id='"+ss2+"';");
					 rs.next();
			 Long x=rs.getLong(1);
			 
	 
			 if(x<Long.parseLong(s1))
			 {
				 setVisible(false);
				 new Error3(ss1,ss2);
			 }
			 else
			 {
				 stmt.executeUpdate("Update account set amount=amount-"+Long.parseLong(s1)+" where account_id='"+ss2+"';");
				 setVisible(false);
	    	 new S2(ss1,ss2,String.valueOf(x-Long.parseLong(s1)));
			 }
			 
	    	 }
	    	 catch(Exception e)
	    	 {
	    		 System.out.print(e);
	    	 }
	     }
		});
		
		B2=new Button("back");
		B2.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {
	    	 setVisible(false);
	    	 new Client(ss1,ss2);
	     }
		});
 
		
		add(L1);
		add(T1);
		
		
		add(B1);
		add(B2);
		
		
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

