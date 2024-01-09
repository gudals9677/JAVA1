package Sub1;
/*
 * 날짜 : 2024/01/09
 * 이름 : 김형민
 * 내용 : Java Object 클래스 실습
 */
public class ObjectTest {
	
	public static void main(String[] args) {
		
		Object a1 = new Apple("한국", 3000);
		Object a2 = new Apple("일본", 2000);
		
		System.out.println(a1);
		System.out.println(a2);
		
		//객체 비교
		if(a1 == a2) {
			System.out.println("a1, a2 주소가 같다.");
		}else {
			System.out.println("a1, a2 주소가 다르다.");
		}
		//********a1.equals 중요함*******
		//a1 == a2는 참조변수끼리 비교
		//a1.equals(a2)는 a1 a2가 가르키는 객체를 비교함
		if(a1.equals(a2)) {
			System.out.println("a1, a2 객체가 같다.");
		}else {
			System.out.println("a1, a2 객체가 다르다.");
		}
	}
}
