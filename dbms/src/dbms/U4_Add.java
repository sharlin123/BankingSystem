package dbms;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class U4_Add extends Frame 
{
	Button B1,B2;
	Label L1,L2,L3,L4,L5,L6,L7;
	TextField T1,T2,T3,T4,T5,T6,T7;
	String s1,s2,s3,s4,s5,s6,s7;
	U4_Add()
	{
		super("U4_ADD WINDOW");

		L1=new Label("client id  :    ");
		L2=new Label("client name  :   ");
		L3=new Label(" client address  :  ");
		L4=new Label(" manager id  :    ");
		L5=new Label(" account id  :    ");
		L6=new Label(" client phone  :   ");
		L7=new Label(" pin  :   ");
		T1=new TextField(100);
		T2=new TextField(104);
		T3=new TextField(100);
		T4=new TextField(100);
		T5=new TextField(100);
		T6=new TextField(100);
		T7=new TextField(100);
	    		
	

	    
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
	 	 s6=T6.getText();
	 	s7=T7.getText();
	 	
 	    
	 	   try
	    	 { 
	    	 Class.forName("com.mysql.jdbc.Driver");  
	    	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sharlin","root","root");   
	    	 Statement stmt=con.createStatement();  
	    	 int status=stmt.executeUpdate("insert into client values ('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"');");  
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
	    	 new U4();
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
		
		add(L6);
		add(T6);
		
		add(L7);
		add(T7);
		
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
