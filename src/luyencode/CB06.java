package luyencode;

import java.util.Scanner;

public class CB06 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int d = scanner.nextInt();
		int r = scanner.nextInt();
		scanner.close();
		//Output
		System.out.println(2*(d+r));
		System.out.println(d*r);
	}
}
