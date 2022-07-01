package ex0701;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("src\\/aa.txt"));
		System.out.print("첫번째 수 입력: ");
		int num1 = scan.nextInt();
		System.out.print("두번째 수 입력: ");
		int num2 = scan.nextInt();
		division(num1,num2);
	}
	
	public static void division(int num1, int num2) {
		System.out.println("num1/num2 = "+num1/num2);
	}
}
