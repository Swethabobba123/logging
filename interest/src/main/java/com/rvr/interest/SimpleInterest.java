package com.rvr.interest;

public class SimpleInterest {
	public static double calculate(int p, int t, int r) {
		double ans = 0;
		ans = (float) (p * t * r) / 100.0;
		ans += p;
		return ans;
	}
}
