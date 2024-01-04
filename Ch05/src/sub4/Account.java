package sub4;

public class Account {
	
	protected String bank;
	protected String id;
	protected String name;
	protected int balance;
	
	public Account(String bank,String id,String name, int balance) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) {
		balance -= money;
	}
	
	public void show() {
		System.out.println("은행명 : " + this.bank);
		System.out.println("계좌번호 : " + this.id);
		System.out.println("이름 : " + this.name);
		System.out.println("계좌잔고 : " + this.balance);
	}
}
