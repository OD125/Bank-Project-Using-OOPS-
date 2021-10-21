package com.oops;

 class Customer_Details implements Customer {
	
	 String Cust_name;
		int  Cust_Age;
		int Cust_Cont_No;
		String Cust_ID;
		int Cust_Sal;
		
		public Customer_Details(String name,int  age,int no,String id,	int sal)
		{
			this.Cust_Age=age;
			this.Cust_name=name;
			this.Cust_Cont_No=no;
			this.Cust_ID=id;
			this.Cust_Sal=sal;
		}
	 
	 
	public void Cust_display() {
		
		System.out.println("Customer Name :-"+Cust_name);
		System.out.println("Customer Age :-"+ Cust_Age);
		System.out.println("Customer Contact No :-"+Cust_Cont_No);
		System.out.println("Customer ID :-"+Cust_ID);
		System.out.println("Customer Salary :-"+Cust_Sal);
		
	
	}

}
