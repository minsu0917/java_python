package ex0712;

public class ex04 {
	public static void main(String[] args) {
		AA[] ar = new AA[5];
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		
		System.out.println(ar.length);
		
		ar[0] = new AA("dkdkk");
		System.out.println(ar[0]);
	}
}
