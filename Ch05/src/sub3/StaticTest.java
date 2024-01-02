package sub3;
/* 
 * 날짜 : 2024/01/02
 * 이름 : 김형민
 * 내용 : 클래스 변수, 클래스 메서드 실습하기
 * 
 * 클래스 변수, 클래스 메서드(정적변수,정적메서드)
 *  - static을 선언한 변수,메서드로 Method Area에 생성되는 특징
 *  - 별도의 객체 생성(new) 없이 클래스 타입으로 바로 참조, 호출
 *  - 객체간의 데이터 공유를 목적으로 클래스(정적) 변수, 클래스(정적) 메서드 사용
 *  
 *  싱글톤(Singleton)
 *  - static을 활용한 싱글톤 객체는 오직 하나의 인스턴스 메모리(Method Area)에 존재
 *  - 싱글톤 객체를 사용해서 메모리 절약과 성능 향상을 기대
 */

class Increment {
	
	private int num1;
	public static int num2; // public static 정보를 공유 하기때문에 num2++; 적용
	
	public Increment() {
		
		num1++;
		num2++;
		
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
	}
}


public class StaticTest {

	public static void main(String[] args) {
		
		// Car 객체 생성
		Car k5 = new Car("K5","네이비",100);
		Car granzer = new Car("그랜져","검정",150);
		Car bmw5 = new Car("bmw5","흰색",200);
		
		k5.show();
		granzer.show();
		bmw5.show();
		
		// 전체 차량수
		System.out.println("전체 차량수 : " + Car.count);
		
		// Increment 실습
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
		
		//static을 활용한 싱글톤 예제
		Calc cal1 = Calc.getIntstance();
		Calc cal2 = Calc.getIntstance();
		Calc cal3 = Calc.getIntstance();
		Calc cal4 = Calc.getIntstance();
		
		int rs1 = cal1.plus(1, 2);
		int rs2 = cal2.minus(1, 2);
		int rs3 = cal3.multi(2, 3);
		int rs4 = cal4.div(4, 2);
		
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		System.out.println("rs3 : " + rs3);
		System.out.println("rs4 : " + rs4);
		
	}
}
