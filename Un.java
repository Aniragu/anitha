import java.util.Scanner;
public class Un {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("enter the no of elements of array");
		int n=in.nextInt();
		int s[]=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
		{
		s[i]=in.nextInt();	
		}
		for(int i=0;i<s.length;i++)
		{
			if(s[i]==i)
			{
				System.out.println(i);
			}
			else
			{
				continue;
			}
		}

	}

	}

}
