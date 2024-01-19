package firstTest1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApplication {
	
	private static List<Account> accounts = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");
	
			int input = Integer.parseInt(scanner.nextLine());
			if(input ==1) {
				createAccount();
			}else if(input ==2) {
				accountList();
			}else if(input ==3) {
				deposit();
			}else if(input ==4) {
				withdraw();
			}else if(input ==5) {
				run=false;
			}
			
		}
		System.out.println("프로그램 종료.");
		}
		public static void createAccount() {
			System.out.println("----------");
			System.out.println("계좌생성");
			System.out.println("----------");
			
			System.out.print("계좌번호:");
			String ano = scanner.nextLine();
			
			System.out.print("계좌주:");
			String owner = scanner.nextLine();
			
			System.out.print("초기입금액:");
			int balance = Integer.parseInt(scanner.nextLine());
			
			Account account = new Account(ano,owner,balance);
			
			accounts.add(account);
			System.out.println("결과 : 계좌가 생성되었습니다.");
			
		}
		public static void accountList() {
			System.out.println("----------");
			System.out.println("계좌목록");
			System.out.println("----------");
			
			if(accounts.isEmpty()) {
				System.out.println("생성된 계좌가 없습니다.");
			}else {
				for(Account account : accounts) {
					System.out.println(account);
				}
			}
		}
		
		
		public static void deposit() {
			System.out.println("----------");
			System.out.println("예금");
			System.out.println("----------");
			
			System.out.println("계좌번호 : ");
			String ano = scanner.nextLine();
			
			System.out.println("예금액:");
			int money = Integer.parseInt(scanner.nextLine());
			
			Account account = findAccount(ano);
			if(account == null) {
				System.out.println("생성된 계좌가 없습니다.");
			}
			account.setBalance(account.getBalance() + money);
			System.out.println("예금이 완료되었습니다.");
			}
		
		public static void withdraw() {
			System.out.println("----------");
			System.out.println("출금");
			System.out.println("----------");
			
			System.out.println("계좌번호 : ");
			String ano = scanner.nextLine();
			
			System.out.println("출금액");
			int money = Integer.parseInt(scanner.nextLine());
			
			Account account = findAccount(ano);
			if(account ==null) {
				System.out.println("생성된 계좌가 없습니다.");
			}
			account.setBalance(account.getBalance() - money);
			System.out.println("출금이 완료되었습니다.");

		}
		public static Account findAccount(String ano) {
			
				for(Account account : accounts) {
					if(account.getAno().equals(ano)) {
						return account;
					}
				}
				return null;
		}
	}



