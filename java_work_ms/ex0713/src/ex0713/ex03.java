package ex0713;

public class ex03 {
	public static void main(String[] args) {
		int a[][] = new int[3][4];
		
		int num = 1;
		
		for(int i=0; i<a.length; i++) {					//3
			for (int j=0; j<a[i].length; j++) {			//4
				a[i][j] = num;
				num++;
			}
		}
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
