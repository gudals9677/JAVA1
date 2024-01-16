package sub1;

interface A{
	public void hello();
}

class B implements A{

	@Override
	public void hello() {
		System.out.println("Hello Wolrd...");
	}
}

public class FunctionalTest {
	public static void main(String[] args) {
		
		// 객체지향 프로그래밍
		A a1 = new B();
		a1.hello();
		
		// 익명 객체(인터페이스를 바로 객체 생성)
		A a2 = new A() {
			
			@Override
			public void hello() {
				System.out.println("Hello Wolrd...");
			}
		};
		
		a2.hello();
		
		// 함수형 프로그래밍
		A a3 = () -> {System.out.println("Hello Wolrd...");};
		
		a3.hello();
		
	}
	
}
