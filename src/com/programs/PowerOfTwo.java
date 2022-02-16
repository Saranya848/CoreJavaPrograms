package com.programs;
import java.util.*;
public class PowerOfTwo {
	public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
		  // read in one command-line argument
		  int N = sc.nextInt();
		  int i = 0;  // count from 0 to N
		  int powerOfTwo = 1;
          // repeat until i equals n
		  while (i <= N) {
		      if(0 <= N && N < 31){
		            System.out.println(i + " " + powerOfTwo);   // print out the power of two
		            powerOfTwo = 2 * powerOfTwo;                // double to get the next one
		            i = i + 1;
		       }
		  }
         sc.close();
    }
}
