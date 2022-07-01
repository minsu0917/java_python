package ex0701;

public class ex01 {
	public static void doA() {
		
	}
	
	public static void doA(int a) {
		System.out.println("doA 매소드 시작");
		System.out.println("a = "+a);
		System.out.println("doA 매소드 끝");
		
		
	}

	public static void main(String[] args) {
		System.out.println("시작");
		doA(1);
		doA(1);
		System.out.println("끝");
	}
}
