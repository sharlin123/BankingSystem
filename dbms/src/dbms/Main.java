package dbms;

import java.awt.*;
import java.awt.event.*;

public class Main extends Frame 
{
	Button B1,B2;
	Main()
	{
		super("MAIN WINDOW	");

		B1=new Button("Update");
		B1.setBackground(Color.YELLOW);
		B1.setBounds(50,70,200,100);
		B1.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {
	    	 setVisible(false);
	    	 new Update();
	    
	     }
		});
		
		
		B2=new Button("access");
	    B2.setBackground(Color.YELLOW);
		B2.setBounds(300,70,200,100);
		B2.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {
	    	 setVisible(false);
	         new Access();
	     }
		});
		
		
		
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
		setLayout(null);
		setSize(800,600);
		setVisible(true);

    }
}
