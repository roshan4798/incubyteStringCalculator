package main;

import java.util.ArrayList;

public class StringCalculator {

	public int add(String numbers) {
		// TODO Auto-generated method stub
		int sum=0;
	    if(numbers.isEmpty()) {
	    	return 0;
	    }
	    
	    String delimiter=",";
	    if(numbers.startsWith("//")) {
	    	int delimiterIndex=numbers.indexOf("//")+2;
	    	delimiter=numbers.substring(delimiterIndex,delimiterIndex+1);
	    	numbers=numbers.substring(numbers.indexOf("\n")+1);
	    }
	    
	    String nums[]=numbers.split("["+delimiter+"\n]");
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
