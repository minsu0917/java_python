package ex0705;

public class ex06 {

	public static void main(String[] args) {
		BankAccount a1 = new BankAccount("990917","1234-4567",1000);
		a1.deposit(2000);
		a1.printbal();
		
		BankAccount a2 = new BankAccount();
	}
}
