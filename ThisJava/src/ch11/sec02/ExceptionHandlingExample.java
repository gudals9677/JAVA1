package ch11.sec02;

public class ExceptionHandlingExample {
	public static void printLength(String data) {
		
		try {
			int result = data.length();
			System.out.println("문자 수  :" + result);
		} catch(NullPointerException e) {
			e.printStackTrace();
		}finally {
			System.out.println("마무리 실행");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		printLength("ThisISJava");
		printLength(null);
		System.out.println("프로그램 종료");
	}
}
