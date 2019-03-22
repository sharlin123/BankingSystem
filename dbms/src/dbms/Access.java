package dbms;

import java.awt.*;
import java.awt.event.*;

public class Access extends Frame 
{
	Button B1,B2,B3;
	Access()
	{
		super("ACCESS WINDOW");

		B1=new Button("Sign In");
		B1.setBackground(Color.YELLOW);
		B1.setBounds(50,70,200,100);
		B1.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {
	    	 setVisible(false);
	    	 new Signin();
	     }
		});	
		
		 
		
		B2=new Button("Help");
		B2.setBackground(Color.YELLOW);
		B2.setBounds(300,240,200,100);
		B2.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {
	    	 setVisible(false);
	    	 new Help();
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
	    	 new Main();
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
