package main;

import java.util.ArrayList;

public class StringCalculator {

	public int add(String numbers) {
		// TODO Auto-generated method stub
		int sum=0;
	    if(numbers.isEmpty()) {
	    	return 0;
	    }
	    
	    String nums[]=numbers.split("[,\n]");
	    ArrayList<Integer> negatives=new ArrayList<>();
	    
	    for(String num : nums) {
	    	int n=Integer.parseInt(num);
	    	if(n<0) {
	    		negatives.add(n);
	    	}
	    	//sum+=Integer.parseInt(num);
	    	sum+=n;
	    }
	    if(!negatives.isEmpty()) {
	    	throw new IllegalArgumentException("Negative numbers are not allowed: "+negatives);
	    }
	    
	    return sum;
	}

}
