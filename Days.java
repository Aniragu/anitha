package Guviprg;
import java.util.Scanner;
public class Days {
     public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		String days=ss.next(); 
		switch(days){
		case "Monday":
			System.out.println("True");
			break;
		case "Tuesday":
			System.out.println("True");
			break;
		case "Wednesday":
			System.out.println("True");
			break;
		case "Thursday":
			System.out.println("True");
			break;
		case "Friday":
			System.out.println("True");
			break;
		case "Saturday":
			System.out.println("True");
			break;
		default:
			System.out.println("False");
			}
		}
     }
