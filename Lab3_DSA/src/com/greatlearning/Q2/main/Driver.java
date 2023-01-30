package com.greatlearning.Q2.main;

import com.greatlearning.Q2.service.FindSumPair;
import com.greatlearning.Q2.service.Node;


public class Driver {
	public static void main(String args[]) {
		
		FindSumPair findSP = new FindSumPair();
		Node root = null;
		
		root = findSP.insert(root, 40);
		root = findSP.insert(root, 20);
		root = findSP.insert(root, 60);
		root = findSP.insert(root, 10);
		root = findSP.insert(root, 30);
		root = findSP.insert(root, 50);
		root = findSP.insert(root, 70);
		
		
		int sum = 130;
		findSP.findPairWithGivenSum(root,sum);	
	}
}
