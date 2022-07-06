package ex0705;

public class A {
	
	public int a = 10;
	public void doA() {
		System.out.println("doA a = "+a);
	}
	public int doB() {
		System.out.println("doB = "+a);
		return 10;
	}
	public double doC(double c) {
		System.out.println("doC = "+a);
		return c*c;
	}
}
