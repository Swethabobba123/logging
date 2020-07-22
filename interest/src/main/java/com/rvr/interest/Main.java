package com.rvr.interest;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	final static Logger LOGGER = LogManager.getLogger(Main.class);
	
	public static void driver() {
		
		Scanner input = new Scanner(System.in);
		int p, t, r, n;
		String v;
		double i;
		
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		try {
			out.write("enter the p value : ");
			out.flush();
			p=input.nextInt();
			
			out.write("enter the t value : ");
			out.flush();
			t=input.nextInt();
			
			out.write("enter the r value : ");
			out.flush();
			r=input.nextInt();
			
			out.write("enter the n value : ");
			out.flush();
			n=input.nextInt();
			
		    i = SimpleInterest.calculate(p, t, r);		    
			v = Double.toString(i);
			out.write("Simple Interest : " + v + "\n\n");
			out.flush();
			
			LOGGER.info("Finished calculating the simple interest");
			
			i = CompoundInterest.calculate(p, t, r, n);
			v = Double.toString(i);
			out.write("Compound Interest : " + v + "\n\n");
			out.flush();
			
			LOGGER.info("Finished calculating the compound interest");
		}
		catch(IOException e) {
			System.out.println(e);
			LOGGER.error("IOException in the driver method.");
		}		
		
		input.close();
	}
}
