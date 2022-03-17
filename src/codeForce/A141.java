package codeForce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * This class is used to solve A141 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/141/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 10:28:40 PM -  Mar 17, 2022
 */
public class A141 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String a1 = scanner.next();
		String a2 = scanner.next();
		String b = scanner.next();
		scanner.close();
		//Solve
		String res = "YES";
		if (a1.length() + a2.length() == b.length()) {
			List<Character> list1 = new ArrayList<Character>();
			List<Character> list2 = new ArrayList<Character>();
			for (int i = 0; i < a1.length(); i++) {
				list1.add(a1.charAt(i));
			}
			for (int i = 0; i < a2.length(); i++) {
				list1.add(a2.charAt(i));
			}
			for (int i = 0; i < b.length(); i++) {
				list2.add(b.charAt(i));
			}
			Collections.sort(list1);
			Collections.sort(list2);
			for (int i = 0; i < list1.size(); i++) {
				if (list1.get(i) != list2.get(i)) {
					res = "NO";
					break;
				}
			}
			
		}else {
			res = "NO";
		}
		//Output
		System.out.println(res);
	}
}
