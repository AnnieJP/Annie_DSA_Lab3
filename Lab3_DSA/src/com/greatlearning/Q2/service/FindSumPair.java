package com.greatlearning.Q2.service;

import java.util.HashSet;

public class FindSumPair {
	public Node root;
	
	public Node insert(Node root, int element) {
		
		if(root==null)
			return new Node(element);
		else if(element > root.data)
			root.right = insert(root.right,element);
		else
			root.left = insert(root.left,element);
		
		return root;
	}
	
	public boolean findPairUtil(Node root, int sum, HashSet<Integer> set) {
		if(root==null)
			return false;
		
		if(findPairUtil(root.left, sum, set))
			return true;
		
		if(set.contains(sum - root.data)) {
			System.out.println("Pair is found ("+(sum - root.data)+", "+ root.data + ")");
			return true;
		}
		else
			set.add(root.data);
		
		return findPairUtil(root.right, sum, set);
	}
	
	
	public void findPairWithGivenSum(Node root, int sum) {
		HashSet<Integer> set = new HashSet<Integer>();
		if(!findPairUtil(root,sum,set))
			System.out.println("Pairs do not exist" + "\n");
	}
	
}
