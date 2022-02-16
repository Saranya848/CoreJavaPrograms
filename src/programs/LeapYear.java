package programs;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			    Scanner y=new Scanner(System.in);
			    System.out.println("Enter the Year:");
			    int year=y.nextInt();
			    	if(year>999 && year<10000)
			    	{
			        	if(year%4==0 && year%100==0 && year%400==0)
			                {
			                    System.out.println(year + " is a Leap Year");
			                }
			        	else
			        	{
			        			System.out.println(year + " is Not a Leap Year");
			        	}
			    	}
			    	else
			    	{
			    		System.out.println(year + " is Invalid Year");
			    	}
			    y.close();
	}
}
