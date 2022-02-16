package com.programs;
//importing BufferedReader class
import java.io.BufferedReader;
//Importing inputStreamReader class
import java.io.InputStreamReader;
public class Factors {
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			InputStreamReader input = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(input);
			int n = Integer.parseInt(br.readLine());
			System.out.print("Factors of " + n + " are: ");
		    for (int i = 1; i <= n; ++i) {

		        // if number is divided by i
		        if (n % i == 0) {
		          System.out.print(i + " ");
		        }
		    }
		  }
}
