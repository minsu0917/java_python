package ex0630;

public class pb_5_6 {
	public static void main(String[] args) {
		//1번
		int cnt=0;
		for (int i=1; i<101; i++) {
			if ((i%5 != 0) || (i%7 != 0))
				continue;
			System.out.println(i);
			cnt+=1;
		}
		System.out.println(cnt);
		
		//2번
		int sum=0;
		for(int i=1;;i+=2) {
			sum+=i;
			if(sum>1000) {
				System.out.println("cnt = "+i+"sum = "+sum);
				break;
			}
		}
		
	}

}
