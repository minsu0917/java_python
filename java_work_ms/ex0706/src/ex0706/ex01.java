package ex0706;

class Triangle {
	int width;
	int height;
	public Triangle() {}
	public Triangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void printarea() {
		double area = this.width*this.height*0.5d;
		System.out.println("넓이는 = "+area);
	}
}

public class ex01 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.printarea();
		t1.setHeight(50);
		t1.setWidth(50);
		t1.printarea();
		
		Triangle t2 = new Triangle(30,50);
		t2.printarea();
		
	}
}
