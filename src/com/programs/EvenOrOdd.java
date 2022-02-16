package problems;
import java.util.*;
public class LeapYear {
       public static void main(String[] args) {
	    Scanner n=new Scanner(System.in);
	    System.out.println("Enter a Number");
	    int num = n.nextInt();
	        if(num%2==0)
	        {
	            System.out.println(num + " is Even Number");
	        }
	        else
	        {
	            System.out.println(num + " is Odd Number");
	        }
	    n.close();
	}
}