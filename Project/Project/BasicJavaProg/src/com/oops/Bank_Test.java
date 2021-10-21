package com.oops;


public class Bank_Test {

	public static void main(String args[]) {
		
		Bank_Imp b=new Bank_Imp();
		
		Account a=new Account(45263178);
		
		Customer_Details cust=new Customer_Details("Onkar Dake",23,56324152,"FD24T006",20000);
		
		b.show_BDetail("GK225","Bank of India","Andheri","Mumbai",cust,a);
		System.out.println();
		a.generateAccountNo();
		System.out.println();
		Transacion_Imp  wi=new Transacion_Imp();
		System.out.println();
		 wi.Transaction_Display();
		
	}
}
