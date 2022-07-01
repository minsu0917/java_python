package ex0701;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 수 입력: ");
		int num1 = scan.nextInt();
		System.out.println("num1 = "+num1);
		System.out.print("두번째 수 입력: ");
		int num2 = scan.nextInt();
		System.out.println("num2 = "+num2);
		division(num1,num2);
	}
	
	public static void division(int num1, int num2) {
		if(num2 ==0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}
		System.out.println("num1/num2 = "+num1/num2);
	}
}
