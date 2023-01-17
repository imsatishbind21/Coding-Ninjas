package Arrays;

import java.util.*;

public class LinearSearchProgram {
	
	public static int linearSearch(int arr[],int x) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==x) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=s.nextInt();
		}
		int x=s.nextInt();
		System.out.println(x+ "x is found at x " +linearSearch(arr,x));

	}

}
