package Arrays;



public class ArrangeNumberinArray {
	  public static int[] Arrange(int arr[],int n) {
		  int start=0;
	       int end=n-1;
	       int no=1;
	       while(start<=end){
	           if(no%2==0){
	               arr[end]=no;
	               end--;
	           }
	           else{
	               arr[start]=no;
	               start++;
	           }
	           no++;
	       }
	  }
	    
	    
	    
	}



