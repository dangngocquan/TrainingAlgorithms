package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A1348 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1348/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 2:45:08 PM -  Mar 18, 2022
 */
public class A1348 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int sum1  = (int)(Math.pow(2, n)) + 2*((int)(Math.pow(2, n/2-1)) -1);
			int sum2 = 2*((int)(Math.pow(2, n)-1)) - sum1;
			res[i] = Math.abs(sum2 - sum1);
		}
		scanner.close();
		//Output
		for (int i : res) {
			System.out.println(i);
		}
	}
}
