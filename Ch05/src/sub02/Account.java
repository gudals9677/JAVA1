package sub02;

public class Account {

	//속성
	private String bank;
	private String id;
	private String name;
	private int balance;
	
	public Account(String bank,String id, String name,int balance) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	//기능
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) {       // int money라서 balance랑 구분가능
		balance -= money;					// 구분이 가능해서 this 생략가능
	}
	public void show() {
		System.out.println("은행명 : " + this.bank);
		System.out.println("계좌번호 : " + this.id);
		System.out.println("입금주 : " + this.name);
		System.out.println("현재잔액 : " + this.balance);		
	}
	
}


