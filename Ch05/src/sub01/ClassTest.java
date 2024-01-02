package sub01;
/* 
 * 날짜 : 2024/01/02
 * 이름 : 김형민
 * 내용 : JAVA 클래스 실습하기
 */
public class ClassTest {
	
	public static void main(String[] args) {
		
		// 객체 생성
		Car sonata = new Car();
		
		// 객체 초기화
		sonata.name  = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		// 객체 상호작용(프로그래밍)
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
		
		// 객체 선언, 생성, 초기화, 상호작용
		
		Car avante = new Car();
		avante.name = "아반테";
		avante.color = "검은색";
		avante.speed = 0;
		
		avante.speedUp(80);
		avante.speedDown(20);
		avante.show();
		
		// Account 객체선언 //객체 생성/초기화/상호작용
		
		Account kb = new Account();
		kb.bank    = "국민은행";
		kb.id      = "101-01212-31";
		kb.name    = "김형민";
		kb.balance = 10000;
		
		kb.deposit(40000);
		kb.withdraw(30000);
		kb.show();
				
	}
}
