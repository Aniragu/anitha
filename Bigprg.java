import java.util.*;
public class Bigprg{
public static void main(String[] args){
	Scanner ss=new Scanner(System.in);
   int n=ss.nextInt();
   int arr[]=new int[n];
   for(int i=0;i<n;i++){
      arr[i]=ss.nextInt();
      }
      Arrays.sort(arr);
      System.out.println(arr[arr.length-2]);
      }
      }