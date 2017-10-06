import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
	       int n=ss.nextInt();
	       int sum=0;
	      int arr[]=new int[n];
	      for(int i=0;i<n;i++) {
	    	  arr[i]=ss.nextInt();
	      }
	      for(int i=0;i<n;i++) {
	      if(arr[i]%2!=0) {
	    	  sum=sum+arr[i];
	      }
	      }
	    //  for(int j=0;j<n;j++) {
	        if(sum%2==0) {
	        	System.out.println("-1");
	        }
	        else {
	        	System.out.println("1");
	       // }

	}
	}
}