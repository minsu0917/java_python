package ex0708;

public class ex02 {
	public static int a= 10;
	ex02() {
		System.out.println("a = "+a);
	}
	
	public static void main(String[] args) {
		ex02 e = new ex02();
		e.a++;
		ex02 e2 = new ex02();
		e2.a++;
		
		System.out.println("e2.a = "+ex02.a);
	}
}
