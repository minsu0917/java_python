package ex0707;
import zoo.AAA;

//ctrl + shift + o -> 자동 import
public class ZZZ extends AAA{
	ZZZ() {
		num = 20;
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		new ZZZ();
	}
}
