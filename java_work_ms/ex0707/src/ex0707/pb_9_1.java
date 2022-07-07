package ex0707;

class Circle {
	int xPos, yPos, rad;

	public Circle(int xPos, int yPos, int rad) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.rad = rad;
	}

	public void showCircleInfo() {
		System.out.println("[" + xPos + "," + yPos + "," + rad + "]");
	}
}

public class pb_9_1 {
	public static void main(String[] args) {
		Circle c1 = new Circle(2, 2, 4);
		c1.showCircleInfo();
	}
}
