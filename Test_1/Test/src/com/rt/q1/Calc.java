package com.rt.q1;

public class Calc implements Mathematics
{

	@Override
	public void division(int num1, int num2) {
		System.out.println("The divison of the number is "+(num1/num2));
		
	}

	@Override
	public void modulos(int num1, int num2) {
		System.out.println("The remainder of the divison of number is "+(num1%num2));
		
	}

}
