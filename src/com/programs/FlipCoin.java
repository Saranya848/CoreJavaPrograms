package bridgelabz;
import java.util.*;
public class FlipCoin {
	public static void main(String[] args) {
		int n, hcount = 0, tcount = 0;
		double heads, tails;
		Scanner fc = new Scanner(System.in);
		System.out.print("enter no. of times you want to flip the coin: ");
		n = fc.nextInt();
		// COMPUTATION
		for (int j = 0; j < n; j++) {
			double random = Math.random();
			if (random < 0.5)
				hcount++;
			else
				tcount++;
		}
		tails = tcount / (double) n * 100;
		heads = hcount / (double) n * 100;
		if(tails > heads){
		  		System.out.println("Percentage of tails: " + tails + "%");
		}
		else{
		  		System.out.println("Percentage of heads: " + heads + "%");
		}
	}
}