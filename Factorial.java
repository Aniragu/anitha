package Guviprg;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
         Scanner ss=new Scanner(System.in);
         int fact=ss.nextInt();
         int num=ss.nextInt();
         int i;
         for(i=1;i<=num;i++){
        	 fact=fact*i;
         }
         System.out.println("Factorial of "+num+" is:"+fact);
	}

}
