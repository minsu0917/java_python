package ex0701;

public class pb_6_1 {
	//p.1
	public static void aa(double a,double b) {
		System.out.println("a+b = "+(a+b));
		System.out.println("a-b = "+(a-b));
		System.out.println("a*b = "+(a*b));
		System.out.println("a/b = "+(a/b));
	}
	
	//p.2
	public static void bb(double a, double b) {
		if(a>b)
			System.out.println(a-b);
		else
			System.out.println(b-a);
	}
	
	public static void main(String[] args) {
		aa(4,2);
		bb(2,4);
	}
}
