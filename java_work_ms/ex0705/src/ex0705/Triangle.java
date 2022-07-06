package ex0705;

public class Triangle {
	double height;
	double width;
	double area;
	
	public Triangle( ) {}
	public Triangle(double h, double w) {
		height = h;
		width = w;
	}

	public void change(double h,double w) {
		height = h;
		width = w;
	}
	
	public double area() {
		area = height*width/2;
		return area;
	}
	public void print_all() {
		System.out.println("height: "+height);
		System.out.println("width: "+width);
	}
}
