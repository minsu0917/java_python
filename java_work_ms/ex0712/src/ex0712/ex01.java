package ex0712;

// 다음 주민번호 중간에 삽입된 - 지우고 공백으로 채워서 출력하는 프로그램 작성
// 990925-1012999

public class ex01 {
	public static void main(String[] args) {
		String jumin = "990917-1234567";
		String a[] = jumin.split("-");
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		System.out.println(a[0] + "-1******");
		
	}
}
