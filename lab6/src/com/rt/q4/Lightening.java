package com.rt.q4;
public class Lightening implements Call 
{
	float duration,amt;
	//let amount is per hour and we assume that 
	//duration is also in hour
	public Lightening(float duration,float amount)
	{
		this.duration = duration;
		amt = amount;
	}
	@Override
	public void bill() {
		float b = duration*amt;
		System.out.println("The bill of lightening"
				+ " type call  "+ b);
		
	}	
}
