package com.greatlearning.Q1.main;

import com.greatlearning.Q1.service.BalancingBrackets;

public class Driver {
	
	public static void main(String args[]) {
		
		String bracketExpression = "([[{}]])}";
		BalancingBrackets balancingBrackets = new BalancingBrackets();
		
		boolean result;
		result = balancingBrackets.checkBalancedBrackets(bracketExpression);
		
		if(result) {
			System.out.println("Given String has balanced brackets");
		}
		else {
			System.out.println("Given String does not have balanced brackets");
		}
	}
}
