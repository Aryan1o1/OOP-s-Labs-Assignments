package com.rt.q1;

public class ToTestInt
{
	
	int num;
	
	public ToTestInt(int num) {
		super();
		this.num = num;
		arithmetic ar = new arithmetic(this.num);
		System.out.println(ar.square());
	}

	
}
