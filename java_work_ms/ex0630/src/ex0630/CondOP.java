package ex0630;

public class CondOP {
	public static void main(String[] args) {
		
		int num1 = 50, num2 = 100, result;
		
//		System.out.println("num1: "+num1);
//		System.out.println("num2: "+num2);
//		
//		int result = num1>num2 ? num1:num2;
//		System.out.println("result: "+result);
//		
//		result = num1>num2 ? num1-num2:num2-num1;
//		System.out.println("result: "+result);
		
		if (num1>num2)
			result=num1;
		else
			result=num2;
		
		System.out.println("result: "+result);
		
		if (num1>num2)
			result=num1-num2;
		else
			result=num2-num1;
		
		System.out.println("result: "+result);
	}

}
