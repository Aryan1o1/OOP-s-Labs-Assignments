package com.Calculation;
import com.manipulation.*;
public class Calc
{
	public static void main(String args[])
	{
		int a = 3;
		int b = 2;
		Add obj1 = new Add();
		Sub obj2 = new Sub();
		obj1.addition(a,b);
		obj2.subtract(a,b);
	}
}