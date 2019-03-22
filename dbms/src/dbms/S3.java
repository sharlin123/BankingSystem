package dbms;

import java.awt.*;
import java.awt.event.*;

public class S3 extends Frame 
{
	Button B1;
	Label L1,L2,L3;
	S3(String ss1,String ss2,String ss3,String ss4)
	{
		super("STATUS WINDOW 1");

		L1=new Label("Amount deposited            ");
		L2=new Label("current Balance in your account :        "+ ss3);
		L3=new Label("current Balance in deposited account :        "+ ss4);
		
		
		B1=new Button("back");
		B1.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {
	    	 setVisible(false);
	    	 new Deposit(ss1,ss2);
	     }
		});
 
		add(L1);
		add(L2);
		add(L3);
		
		
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

