package Arrays;

import java.util.*;

public class ReturnArraySum {
	
	public static int sum(int[] arr){
	    int sum=0;int n=arr.length;
			for(int i=0;i<n;i++){
	            sum=sum+arr[i];
	        }
			return sum;

		}
	
	    public static void main(String[] args)
	    {
	    	 Scanner s = new Scanner(System.in);
		        int n = s.nextInt();
		        int[] arr = new int[n];
		        for(int i=0; i<n; i++) {
		        	 arr[i]=s.nextInt();
		        }
		        
	            int Sum=sum(arr);
	            System.out.println(Sum);
	    }
}  
	    

