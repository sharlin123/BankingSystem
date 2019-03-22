package dbms;

import java.awt.*;
import java.awt.event.*;

public class Update extends Frame 
{
	Button B1,B2,B3,B4,B5,B6;
	Update()
	{
		super("UPDATE WINDOW");

		B1=new Button("Bank");
		B1.setBackground(Color.YELLOW);
		B1.setBounds(50,70,200,100);
		B1.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {
	    	 setVisible(false);
	    	 new U1();
	     }
		});	
		
		 
		B2=new Button("Branch");
	    B2.setBackground(Color.YELLOW);
		B2.setBounds(300,70,200,100);
		B2.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {
	    	 setVisible(false);
	    	 new U2();
	     }
		});
		
		B3=new Button("Client Manager");
		B3.setBackground(Color.YELLOW);
		B3.setBounds(550,70,200,100);
		B3.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {
	    	 setVisible(false);
	    	 new U3();
	     }
		});
		
		
		
		B4=new Button("Client");
		B4.setBackground(Color.YELLOW);
		B4.setBounds(50,240,200,100);
		B4.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {
	    	 setVisible(false);
	    	 new U4();
	     }
		});
		
		
		B5=new Button("Accounts");
		B5.setBackground(Color.YELLOW);
		B5.setBounds(300,240,200,100);
		B5.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {
	    	 setVisible(false);
	    	 new U5();
	     }
		});
		
		B6=new Button("Back");
		B6.setBackground(Color.YELLOW);
		B6.setBounds(550,240,200,100);
		B6.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {
	    	 setVisible(false);
	    	 new Main();
	     }
		});
		
		
	    add(B1); 
	    add(B2);
	    add(B3);
		add(B4);
		add(B5);
		add(B6);
		
		
		
	  
		
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
