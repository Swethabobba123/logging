package com.rvr.interest;

public class CompoundInterest {
	public static double calculate(int i, int j, int k, int l) {
		
		return i * Math.pow(((float) (k / 100.0) / l) + 1, l * k);
		
	}
}
