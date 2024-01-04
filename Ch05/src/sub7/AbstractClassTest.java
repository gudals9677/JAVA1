package sub7;
/*
 * 날짜 : 2024/01/04
 * 이름 : 김형민
 * 내용 : JAVA 추상클래스 실습하기
 */
public class AbstractClassTest {
	
	public static void main(String[] args) {
		
		// 추상클래스는 객체 생성안됨
		//Car car = new Car("소나타","흰색",0);
		
		Car sonata = new Sedan("소나타","흰색",0,0);
		Car bongo  = new Truck("봉고","남색",0,0);
		
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		bongo.speedUp(40);
		bongo.speedDown(10);
		bongo.show();
	}
}
