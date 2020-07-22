package com.rvr.construction;

public class Estimate {
	public static int estimate(int option, int area, int automation) {
		if(option == 3 && automation == 1)
			return Calculate.cost(2500, area);
		else if(option == 3)
			return Calculate.cost(1800, area);
		else if(option == 2)
			return Calculate.cost(1500, area);
		else if(option == 1)
			return Calculate.cost(1200, area);
		return 0;
	}
}
