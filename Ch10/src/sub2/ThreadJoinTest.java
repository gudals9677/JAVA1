package sub2;
/*
 * 날짜 : 2024/01/15
 * 이름 : 김형민
 * 내용 : Java Thread Join 실습 
 */
class ChildThread extends Thread {
	 
	 @Override
	public void run() {
	
	 for(int i=1; i<=10; i++) {
		 
		 System.out.println("i : " + i);
		 
		 try {
			 sleep(1000);
		 }catch(Exception e) {
			 e.printStackTrace();		
	 }
		}
	 
	 System.out.println("자식 스레드 종료.");
	 }
		 
}

public class ThreadJoinTest {
	
	public static void main(String[] args) {
		
		ChildThread ct = new ChildThread();
		
		//자식 스레드 실행
		ct.start();
		
		// 메인메서드가 자식 스레드 ct.start가 끝날때 까지 대기.
		try {
			ct.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램(메인 스레드) 종료.");
		
		
	}
}
