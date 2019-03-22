package dbms;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Transfer extends Frame 
{
	Button B1,B2;
	Label L1,L2;
	TextField T1,T2;
	String s1,s2;
	Transfer(String ss1,String ss2)
	{
		super("TRANSFER WINDOW");

		L1=new Label("Amount to transfer : ");
	    T1=new TextField(100);
		
	    L2=new Label("Account NO         : ");
	    T2=new TextField(100);
	    
		B1=new Button("ok");
		B1.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {
	    	 try
	    	 {
	    	 s1=T1.getText();
	    	 
	    	 s2=T2.getText();
	         Class.forName("com.mysql.jdbc.Driver");  
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sharlin?autoReconnect=true&useSSL=false","root","root");   
			 Statement stmt=con.createStatement();  
	    	 
			 ResultSet rs=stmt.executeQuery("select amount from account where account_id='"+ss2+"';");
					 rs.next();
			 Long x=rs.getLong(1);
			 
			 
	 
			 if(x<Long.parseLong(s1))
			 {
				 setVisible(false);
				 new Error2(ss1,ss2);
			 }
			 else
			 {
				 stmt.executeUpdate("Update account set amount=amount-"+Long.parseLong(s1)+" where account_id='"+ss2+"';");
				 stmt.executeUpdate("Update account set amount=amount+"+Long.parseLong(s1)+" where account_id='"+s2+"';");
				 
				 ResultSet rs1=stmt.executeQuery("select amount from account where account_id='"+ss2+"';");
				 rs1.next();
		 Long y1=rs1.getLong(1);
		 
				 ResultSet rs2=stmt.executeQuery("select amount from account where account_id='"+s2+"';");
				 rs2.next();
		 Long y2=rs2.getLong(1);
			 setVisible(false);
	    	 new S1(ss1,ss2,String.valueOf(y1),String.valueOf(y2));
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
		
		add(L2);
		add(T2);
		
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

