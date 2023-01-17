package Arrays;

import java.util.*;

public class AssiTripletSum {
	
	 public static int findTriplet(int[] arr, int x) {
	    	//Your code goes here
	        int n=arr.length;
	        int count=0;
	        for(int i=0; i<n; i++){
	            for(int j=i+1; j<n; j++){
	                for(int k=j+1; k<n; k++){
	                    if((arr[i]+arr[j]+arr[k]==x)){
	                        count++;
	                    }
	                }
	            }
	        }
	        return count;
	    }
	    public static int[] TakeInput(){
	        Scanner s=new Scanner(System.in);
	        int n=s.nextInt();
	        int arr[]=new int[n];
	        for(int i=0; i<n; i++){
	            arr[i]=s.nextInt();
	        }
	        return arr;
	        }
	          public static void main (String[] args){
	            Scanner s=new Scanner(System.in);
	            int n=s.nextInt();
	            while(n!=0){
	                int arr[]=TakeInput();
	                int x=s.nextInt();
	                System.out.println(findTriplet(arr,x));
	                n--;
	            }
	        }   
	    }



