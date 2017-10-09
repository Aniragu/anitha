import java.util.Scanner;

public class Zero {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		  int n=ss.nextInt();int sum=0;
		  int arr[]=new int[n];
		  for(int i=0;i<n;i++) {
			  arr[i]=ss.nextInt();
		  }
		  for(int i=0;i<n;i++) {
			  for(int j=0;j<n;j++) {
				  sum=arr[i]+arr[j];
			  
		  
		  if(sum==0) {
			  System.out.print(arr[i]+" ");
		  }
		  }
		  }
	}
	}