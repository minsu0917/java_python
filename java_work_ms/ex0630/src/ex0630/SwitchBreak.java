package ex0630;

public class SwitchBreak {
	public static void main(String[] args) {
		int n =3;
		
		switch (n) {
		case 1:
			System.out.println("simple java");
			break;

		case 2:
			System.out.println("funny java");
			break;
		
		case 3:
			System.out.println("fantastic java");
			break;
		
		default:
			System.out.println("the best programming language");
			break;
		}
		System.out.println("do u like java?");
		
		
		if(n==1)
			System.out.println("Simple Java");
		else if(n==2)
			System.out.println("Funny Java");
		else if(n==3)
			System.out.println("Fantastic Java");
		else
			System.out.println("The best programming language");
		
		System.out.println("Do you like Java?");
		
		
		
	}

}
