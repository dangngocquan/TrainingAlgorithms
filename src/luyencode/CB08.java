package luyencode;

import java.util.Scanner;

public class CB08 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		//Output
		System.out.println(a + " + " + b + " = " + (a+b) );
	}
}
