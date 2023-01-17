package Strings;

public class CheckPalindrome {
	
	public static boolean isPalindrome(String str) {
		//Your code goes here
		int n=str.length();
		for(int i=0; i<str.length()/2; i++){
			if(str.charAt(i)!=str.charAt(n-1-i)){

				//Not a palindrome
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="noon";
//		String str="my , Name is Satish kUmar";
		System.out.println(isPalindrome(str));

	}

}
