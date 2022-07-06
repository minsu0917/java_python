package ex0705;

public class ex07 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(3,5);
		t1.print_all();
		System.out.println("area: "+t1.area());
		
		t1.change(5,5);
		t1.print_all();
		System.out.println("area: "+t1.area());

	}
}
