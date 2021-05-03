package com.rt.q4;

public class Show implements Calc{

	int num1,num2;
	public Show(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public void divison() 
	{
		System.out.println("The divison is"+num1/num2);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modulus() {
		System.out.println("The modulus is "+num1%num2);	
	}

}
