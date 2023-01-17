package Recursion1;

import java.util.Scanner;

public class SumNnaturalNum {
	
	public static int sumNnum(int n) {
		if(n==0) {
			return 0;
		}
		int smallOutput=sumNnum(n-1);
		int output=n+smallOutput;
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner s=new Scanner(System.in);
//		int n=s.nextInt();
		System.out.println(sumNnum(4));
		

	}

}
