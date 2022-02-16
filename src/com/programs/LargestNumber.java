package com.programs;
//importing BufferedReader and InputStreamReader class
import java.io.*;
public class LargestNumber {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);
		int N1 = Integer.parseInt(br.readLine());
		int N2 = Integer.parseInt(br.readLine());
		int N3 = Integer.parseInt(br.readLine());
		int result =  Math.max(Math.max(N1,N2),N3);
		System.out.println("The Largest number is "+ result);
  	}
}