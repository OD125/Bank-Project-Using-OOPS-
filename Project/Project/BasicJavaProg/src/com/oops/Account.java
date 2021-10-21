package com.oops;

public class Account implements Account_No
{

	int ANumber;
	
	public Account(int number)
	{
		this.ANumber=number;
	}
	
	
	public  void generateAccountNo()
	{
	
	ANumber = (int)((Math.random() * 90000000)+10000000);

	System.out.print("New Account No  :- "+(ANumber));
	}

 
	
	
}