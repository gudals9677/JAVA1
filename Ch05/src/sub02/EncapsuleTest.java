package sub02;
/* 
 * 날짜 : 2024/01/02
 * 이름 : 김형민
 * 내용 : JAVA 클래스 실습하기
 */
public class EncapsuleTest {

	public static void main(String[] args) {
		
		Car sonata = new Car("소나타","흰색",100);
		
		// 캡슐화된 속성에 대한 초기화는 생성자에서 수행
		//sonata.name  = "K5";
		//sonata.color = "네이비";
		//sonata.speed = 100;
		
		sonata.speedUp(100);
		sonata.speedDown(5);
		sonata.show();
		
		// 캡슐화된 속성에 대한 수정을 위해 setter 호출
		sonata.setColor("회색");
		sonata.show();
		
		//Account 객체 생성 및 초기화
		Account kb = new Account("국민은행","123-456-123","김형민",10000);
//		kb.bank = "국민은행";
//		kb.id = "123-456-123-2";
//		kb.name = "김형민";
//		kb.balance = 10000;
		
		kb.deposit(80000);
		kb.withdraw(7000);
		kb.show();
		
		
		
	
	}

}


