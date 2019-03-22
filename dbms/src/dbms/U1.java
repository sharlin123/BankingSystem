package dbms;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class U1 extends Frame 
{
	Button B1,B2,B3;
	
	U1()
	{
		super("U1 WINDOW");
		Scanner scan=new Scanner(System.in);
		B1=new Button("See All");
		B1.setBackground(Color.YELLOW);
		B1.setBounds(50,70,200,100);
		B1.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {
	    	
	    	 
	    	 setVisible(false);
	    	 new U1_seeall(); 

	     }
		});	
		
		 
		B2=new Button("Add");
	    B2.setBackground(Color.YELLOW);
		B2.setBounds(300,70,200,100);
		B2.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {   
	    	 setVisible(false);
	    	 new U1_Add();
	    	
	     }
		});
		
		B3=new Button("Back");
		B3.setBackground(Color.YELLOW);
		B3.setBounds(550,240,200,100);
		B3.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {
	    	 setVisible(false);
	    	 new Update();
	     }
		});
		
		
	    add(B1); 
	    add(B2);
	    add(B3);
	    
		addWindowListener(new WindowAdapter()
		{
	        public void windowClosing(WindowEvent x)
	        {
	          dispose();
	        }
		});
		
		setBackground(Color.CYAN);
		setLayout(null);
		setSize(800,600);
		setVisible(true);

    }
}
