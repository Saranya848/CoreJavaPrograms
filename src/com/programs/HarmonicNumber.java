package com.programs;
//importing BufferedReader class
import java.io.BufferedReader;
//Importing inputStreamReader class
import java.io.InputStreamReader;
public class HarmonicNumber {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		double i;
		double sum=1;
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);
		System.out.println("Enter a number");
		int n = Integer.parseInt(br.readLine());
		for( i=2;i<=n;i++)
		{
			sum=sum+1/i;
		}
		System.out.println("Harmonic value = "+sum);
	}
}
