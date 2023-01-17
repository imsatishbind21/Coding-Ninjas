package Strings;

public class SubstringCode {
	
	public static void printSubstrings(String str) {
		//Your code goes here

		for(int i=0; i<str.length(); i++){
			for(int j=i; j<str.length(); j++){
				System.out.println(str.substring(i,j+1));
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="pqrs";
		printSubstrings(str);

	}

}
