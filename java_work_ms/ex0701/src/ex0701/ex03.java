package ex0701;

public class ex03 {
	public static void main(String[] args) {
		doA();
		int result = doB();
		System.out.println(result);
		double result1 = doC();
		System.out.println(result1);
		String result2 = doD();
		System.out.println(result2);
	}
	
	public static void doA() {
		System.out.println("doA");
		return;
	}
	public static int doB() {
		System.out.println("doB");
		return 10;
	}
	public static double doC() {
		System.out.println("doC");
		return 10.5;
	}
	public static String doD() {
		System.out.println("doD");
		return "doD";
	}
	
}
