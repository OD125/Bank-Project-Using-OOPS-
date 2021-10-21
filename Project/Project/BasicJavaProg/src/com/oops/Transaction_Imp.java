package com.oops;

 class Transacion_Imp implements Transaction 
 
 {
		int Balance=20000;

	
	 public int Transaction_Display() {
	
		 System.out.println("Transaction Details :-");
		 
		 System.out.println();
		 
		 
		 
		 
	System.out.println("Account Balance :-"+Balance);
	
	
	
    System.out.println("Withdrwal Amount :-"+WithAmount);

    if(Balance >= WithAmount)  
    { 
    	Balance   = Balance - WithAmount;  
        System.out.println("Please collect your Money");  
    }
    else {
    	System.out.println("Insufficient Balance");
    }
 
    System.out.println("Updated Balance :- "+Balance);  

	 
    
	System.out.println();

    
    System.out.println("Amount to be deposited :- "+DepositAmount);  
    
                  
    
    Balance = Balance + DepositAmount;  
    System.out.println("Your Money has been successfully Deposited");  
    System.out.println("Updated Account Balance is :-"+Balance);  
	 return 0;
 }
 }
