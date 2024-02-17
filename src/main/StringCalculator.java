package main;

public class StringCalculator {

	public int add(String numbers) {
		// TODO Auto-generated method stub
		int sum=0;
	    if(numbers.isEmpty()) {
	    	return 0;
	    }
	    
	    String nums[]=numbers.split(",");
	    for(String num : nums) {
	    	sum+=Integer.parseInt(num);
	    }
	    
	    return sum;
	}

}
