package ex0713;

class AAA{
	int a;
	public AAA(int a) {
		super();
		this.a = a;
	}
}

class BBB extends AAA {
	private int b;
	private int c;
	public BBB(int a, int b, int c) {
		super(a);
		this.b = b;
		this.c = c;
	}
	@Override
	public String toString() {
		return "BBB [a ="+super.a+", b=" + b + ", c=" + c + "]";
	}
}

public class ex06 {
	public static void main(String[] args) {
		System.out.println(new BBB(1,2,3));
	}
}
