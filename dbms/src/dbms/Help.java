package dbms;

import java.awt.*;
import java.awt.event.*;

public class Help extends Frame 
{
	Button B1;
	Label L1,L2;
	
	Help()
	{
		super("STATUS WINDOW 1");

		L1=new Label("No help will be given ");
		L2=new Label("   good bye ");

		
		
		B1=new Button("back");
		B1.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {
	    	 setVisible(false);
	    	 new Access();
	     }
		});
 
		add(L1);
		add(L2);
		
		
		
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

