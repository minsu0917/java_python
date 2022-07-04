package ex0704;

import java.util.Scanner;

public class ex01 {
	
	public static void ABS(int a, int b) {
		if (a>=b)
			System.out.println("abs: "+(a-b));
		else
			System.out.println("abs: "+(b-a));
	}

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		
		System.out.print("첫 번째 수 입력: ");
		int fi = scan.nextInt();
		System.out.println("fi = "+fi);
		
		System.out.print("두 번째 수 입력: ");
		int se = scan.nextInt();
		System.out.println("se = "+se);
		
		ABS(fi,se);
	}
}
