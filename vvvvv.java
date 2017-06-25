import java.util.Scanner;


public class vvvvv {

	/**
	 * @param args
	 * @return 
	 */
	public static String main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("ENETR YOUR STRING=\n");
        
        str=sc.nextLine();
     if (str.length() <= 1) 
     {
         return str;
     }
  String mid = str.substring(1, str.length()-1);
  //System.out.println(" YOUR STRING= " +String mid);
 
  return str.charAt(str.length()-1) + mid + str.charAt(0);
       
}
    

	}

}
