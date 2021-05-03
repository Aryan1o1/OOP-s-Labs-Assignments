package com.rt.q1;

public class arithmetic implements test
{
	int side;
	
	public arithmetic(int side) {
		super();
		this.side = side;
	}


	@Override
	public int square() 
	{
		// TODO Auto-generated method stub
		return side*side;

	}

}
