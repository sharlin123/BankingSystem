package dbms;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Signin extends Frame 
{
	Button B1,B2;
	Label L1,L2,L3;
	TextField T1,T2,T3;
	String s1,s2,s3;
	Signin()
	{
		super("SIGNIN WINDOW");

		L1=new Label("Client Id : ");
		
		L2=new Label("Account Id :      ");
		L3=new Label("Pin :              ");
		
		
		

		T1=new TextField(100);
		T2=new TextField(104);
		T3=new TextField(100);
		
	    		
	

	    
		B1=new Button("sign in");
		B1.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {
	    	 s1=T1.getText();
	 	    s2=T2.getText();
	 	    s3=T3.getText();
	    	 try
	    	 {
	    		 Class.forName("com.mysql.jdbc.Driver");  
	    			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sharlin?autoReconnect=true&useSSL=false","root","root");   
	    			Statement stmt=con.createStatement();  
	    		
	    			ResultSet rs=stmt.executeQuery("select * from client  where client_id='"+s1+"'and account_id='"+s2+"' and pin='"+s3+"';");
	    			
	    			if(rs.next())
	    			{
	    				 setVisible(false);
	    				 con.close();
	    		    	 new Client(s1,s2);
	    			}
	    			else
	    			{
	    				setVisible(false);
	    				new Error1();

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
	    	 new Access();
         }
		});
 
		
		add(L1);
		add(T1);
		
		add(L2);
		add(T2);
		
		add(L3);
		add(T3);
		

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
