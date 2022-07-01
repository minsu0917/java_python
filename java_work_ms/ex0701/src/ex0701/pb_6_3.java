package ex0701;

public class pb_6_3 {
	//p.1
	public static int calc(int n) {
		if(n==0)
			return 1;
		else
			return 2*calc(n-1);
	}
	
	//p.2  2진수 변환없어? 재귀함수로 해야될듯
	public static String binary(int n) {
		if(n/2==0)
			return Integer.toString(n%2);
		else {
			return (binary(n/2)+(n%2));
		}
	}
	
	public static void main(String[] args) {
		System.out.println(calc(5));
		System.out.println(binary(7));
	}
}
