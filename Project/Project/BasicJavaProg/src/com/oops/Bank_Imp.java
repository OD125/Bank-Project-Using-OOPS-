package com.oops;

public class Bank_Imp implements Bank
{
	
	String BankID;
	String Bname;
	String Bbranch;
	String Bcity;
	
	
	Customer_Details cust;
	
	Account a;
	
	
	
	public void show_BDetail(String BankID,String Bname,String Bbranch,String Bcity,Customer_Details cust,Account a)
	{
		System.out.println("Bank Id :- "+ BankID);
		System.out.println("Bank Name :- "+ Bname);
		System.out.println("Bank Branch :- "+ Bbranch);
		System.out.println("Bank City :- "+ Bcity);
		System.out.println("OLD Account No :- "+ a.ANumber);
		System.out.println();
		System.out.println("Customer Name :- "+cust.Cust_name);
		System.out.println("Customer Age :- "+cust.Cust_Age);
		System.out.println("Customer Contact No :- "+cust.Cust_Cont_No);
		System.out.println("Customer ID :- "+cust.Cust_ID);
		System.out.println("Customer Salary :- "+cust.Cust_Sal);
		System.out.println();
		
		
		
		
	}
	
	
}
