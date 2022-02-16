package com.programs;
//importing BufferedReader and InputStreamReader class
import java.io.*;
public class Division {
	public static void main(String[] args) throws Exception {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);
		int divisor = Integer.parseInt(br.readLine());
		int dividend = Integer.parseInt(br.readLine());
    int quotient = dividend / divisor;
    int remainder = dividend % divisor;
    System.out.println("The Quotient is: " + quotient);
    System.out.println("The Remainder is: " + remainder);
  }
}