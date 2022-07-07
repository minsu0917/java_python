package ex0707;

public class Person {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {      //toString 메소드는 생략 가능
		return "Person name: "+name;
	}
	
	public Person() {}			//다른 생성자를 만들면 기본 생성자 생략 불가
	
	public Person(String name) {
		super();   //생략 가능
		this.name = name;     	//this는 메소드내에 동일한 변수명이
								//없으면 생략 가능
		
//	public Person(String name) {
//		this.name = name;		//위와 같은 코드
//	}
	}
}
