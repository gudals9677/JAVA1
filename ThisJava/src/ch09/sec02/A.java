package ch09.sec02;
//인스턴스 멤버 클래스
public class A {
	class B{
	
	int filed1 = 1;
	
	static int filed2 = 2;
	
	B(){
		System.out.println("B-생성자 실행");
	}
	
	void method1() {
		System.out.println("B-method1 실행");
	}
	
	static void method2() {
		System.out.println("B-method2 실행");
	}
}
	void useB() {
	
		B b = new B();
		System.out.println(b.filed1);
		b.method1();
		
		System.out.println(B.filed2);
		B.method2();
	}
}
