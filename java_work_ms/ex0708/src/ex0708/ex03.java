package ex0708;

public class ex03 {
	
	public static void doA() {
		System.out.println("doA method");
	}
	
	public void doB() {
		System.out.println("doB method");
	}
	
	public static void main(String[] args) {
		ex03.doA();
		ex03 e3 = new ex03();
		e3.doB();
		// static method는 바로 호출 가능 e.g. ex03.doA();
		// static mehotd가 아닌 것은 메모리 영역에 할당한 뒤 호출 가능
		// e.g. ex03.doB();는 에러, new ex03();을 한 뒤 e3.doB();가능
	}

}
