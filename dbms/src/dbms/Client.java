package dbms;

import java.awt.*;
import java.awt.event.*;

public class Client extends Frame 
{
	Button B1,B2,B3,B4,B5,B6,B7,B8,B9;
	Client(String s1,String s2)
	{
		super("CLIENT WINDOW");

		B1=new Button("Client info");
		B1.setBackground(Color.YELLOW);
		B1.setBounds(50,70,200,100);
		B1.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {
	    	 setVisible(false);
	    	 new ClientInfo(s1,s2);
	     }
		});	
		
		 
		B2=new Button("account info");
	    B2.setBackground(Color.YELLOW);
		B2.setBounds(300,70,200,100);
		B2.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {
	    	 setVisible(false);
	    	 new AccountInfo(s1,s2);
	     }
		});
		
		B3=new Button("transfer");
		B3.setBackground(Color.YELLOW);
		B3.setBounds(550,70,200,100);
		B3.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {
	    	 setVisible(false);
	    	 new Transfer(s1,s2);
	     }
		});
		
		
		
		B4=new Button("withdraw");
		B4.setBackground(Color.YELLOW);
		B4.setBounds(50,240,200,100);
		B4.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {
	    	 setVisible(false);
	    	 new Withdraw(s1,s2);
	     }
		});
		
		
		B5=new Button("branch info");
		B5.setBackground(Color.YELLOW);
		B5.setBounds(300,240,200,100);
		B5.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {
	    	 setVisible(false);
	    	 new BranchInfo(s1,s2);
	     }
		});
		
		
		B6=new Button("Deposit");
		B6.setBackground(Color.YELLOW);
		B6.setBounds(550,240,200,100);
		B6.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {
	    	 setVisible(false);
	    	 new Deposit(s1,s2);
	     }
		});
		
		B7=new Button("Manager_support");
		B7.setBackground(Color.YELLOW);
		B7.setBounds(50,410,200,100);
		B7.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {
	    	 setVisible(false);
	    	 new ManagerSup(s1,s2);
	     }
		});
		
		B8=new Button("Bank Info");
		B8.setBackground(Color.YELLOW);
		B8.setBounds(300,410,200,100);
		B8.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {
	    	 setVisible(false);
	    	 new BankInfo(s1,s2);
	     }
		});
		
		B9=new Button("Sign out");
		B9.setBackground(Color.YELLOW);
		B9.setBounds(550,410,200,100);
		B9.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
	     {
	    	 setVisible(false);
	    	 new Signin();
	     }
		});
		
		
	    add(B1); 
	    add(B2);
	    add(B3);
		add(B4);
		add(B5);
		add(B6);
		add(B7);
		add(B8);
		add(B9);
		
		
	  
		
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
