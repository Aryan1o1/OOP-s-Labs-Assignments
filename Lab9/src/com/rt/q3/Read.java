package com.rt.q3;
import java.io.*;

public class Read {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		String str = args[0];
		StringBuffer bf = new StringBuffer(str);
		
		for (int i=0;i<bf.length();i++)
		{
			char ch = bf.charAt(i);
			if(('a'<=ch) && (ch<='z'))
			{
				char upper_ch=(char)(ch+'A'-'a');
				bf.setCharAt(i,upper_ch);
			}
		}
	
		OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
	    streamWriter.write(""+bf);
	    streamWriter.flush();

	}

}
