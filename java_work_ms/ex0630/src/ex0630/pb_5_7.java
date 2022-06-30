package ex0630;

public class pb_5_7 {
	public static void main(String[] args) {
		
		//1번
		for (int i=2; i<10 ;i+=2) {
			System.out.println(i+"단 시작");
			for (int j=2; j<=i; j+=2) {
				System.out.println(i+" x "+j+" = "+i*j);
			}
			System.out.println();
		}
		
		//2번
		for (int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				if(i+j+10*i+10*j==99)
					System.out.println("A: "+i+", B: "+j);
			}
		}
	}
}
