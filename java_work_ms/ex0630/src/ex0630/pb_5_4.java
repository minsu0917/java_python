package ex0630;

public class pb_5_4 {
	public static void main(String[] args) {
		int i=0, sum=0;
		
		//1번
		while(i<100) {
			i++;
			sum += i;
		}
		System.out.println(sum);
		
		//2번
		i=0;
		while(i<100) {
			i++;
			System.out.print(i+" ");
		}
		System.out.println();
		
		//2-1번
		i=100;
		do {
			System.out.print(i+" ");
			i--;
		} while(i>0);
		System.out.println();
		
		//3번
		i=0; sum=0;
		while(i<1000) {
			i++;
			if((i%2==0) && (i%7==0)) {
				sum += i;
				System.out.println("num: "+i+" sum: "+sum);
			}
		}
	}
}
