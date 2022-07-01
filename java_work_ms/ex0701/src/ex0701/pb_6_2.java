package ex0701;

public class pb_6_2 {
	//p.1
	public static double Area(double r) {
		return r*r*3.14;
	}
	public static double Leng(double r) {
		return 2*3.14*r;
	}
	
	//p.2
	public static boolean Check(int a) {
		 boolean s=true;
		
		for(int i=2; i<a; i++) {
			if(a%i==0) {
				s=false;
				break;
			}
		}
		if(s==true) {
			//System.out.println(a+"는 소수입니다.");
			return true;
		}
		else
			return false;
	}
	
	
	public static void main(String[] args) {
		System.out.println(Area(3));
		System.out.println(Leng(3));
		
		for(int i=2; i<101; i++) {
			if(Check(i)==true)
				System.out.println(i+"는 소수입니다.");
		}
		
	}
}
