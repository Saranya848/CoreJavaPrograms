package com.programs;
//importing BufferedReader and InputStreamReader class
import java.io.*;
public class Swapping {
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			InputStreamReader input = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(input);
			int N1 = Integer.parseInt(br.readLine());
			int N2 = Integer.parseInt(br.readLine());
			int swap;
       System.out.println("before swapping numbers: "+N1 +"  "+ N2);  
       /*swapping */  
       swap = N1;  
       N1 = N2;  
       N2 = swap;  
       System.out.println("After swapping: "+N1 +"   " + N2);
  }
}