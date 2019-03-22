package dbms;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class U5_Add extends Frame 
{
	Button B1,B2;
	Label L1,L2,L3,L4,L5;
	TextField T1,T2,T3,T4,T5;
	String s1,s2,s3,s4,s5;
	U5_Add()
	{
		super("U5_ADD WINDOW");

		L1=new Label("account id  :   ");
		L2=new Label("account date  :   ");
		L3=new Label(" account type  :  ");
		L4=new Label("branch id  :   ");
		L5=new Label("amount     :   ");
		
		
		
		

		T1=new TextField(100);
		T2=new TextField(104);
		T3=new TextField(100);
		T4=new TextField(100);
		T5=new TextField(100);
	    		
	

	    
		B1=new Button("add");
		B1.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {
	    	 s1=T1.getText();
	 	    s2=T2.getText();
	 	    s3=T3.getText();
	 	   s4=T4.getText();
	 	   s5=T5.getText();
	 	   try
	    	 { 
	    	 Class.forName("com.mysql.jdbc.Driver");  
	    	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sharlin","root","root");   
	    	 Statement stmt=con.createStatement();  
	    	 int status=stmt.executeUpdate("insert into account values ('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"');");  
	    	 if(status==1)
	    		 System.out.println("Inserted successfully");
	    	 else
	    		 System.out.println("Insertion error");
	    	 con.close();  
	    	 }
	    	 catch(Exception e){ System.out.println(e);}  

	     
	    	
         }
		});
		
		B2=new Button("back");
		
		B2.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {
	    	 setVisible(false);
	    	 new U5();
         }
		});
 
		
		add(L1);
		add(T1);
		
		add(L2);
		add(T2);
		
		add(L3);
		add(T3);
		
		add(L4);
		add(T4);
		
		add(L5);
		add(T5);
		
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
