package ex0704;

public class ex03 {
	
	public static void main(String[] args) {
		int result = doA(3);
		System.out.println("result: "+result);
		result = doA(5);
		System.out.println("result: "+result);
	}
	
	public static int doA(int num) {
		if (num==0) {
			return 1;
		}
		else {
			return 2*doA(num-1);
		}
	}
	
}
