package ex0627;

public class pb_05_2 {
	public static void main(String[] args) {
		int num1 = 50, num2 = 100, big, diff;

		big = (num1 > num2) ? num1:num2;
		if (num1 > num2)
			big = num1;
		else
			big = num2;
		System.out.println("큰 수: " + big);

		if (num1 > num2)
			diff = num1 - num2;
		else
			diff = num2 - num1;
		System.out.println("절댓값: "+diff);
	}

}
