package sub3;


import java.io.FileOutputStream;

import java.io.ObjectOutputStream;

/* 날짜 : 2024/01/11
 * 이름 : 김형민
 * 내용 : Java 직렬화 실습
 * 직렬화할때 Apple 클래스를 implements 해줘야함.
 */ 
public class SerializeTest {
	public static void main(String[] args) {
		
		Apple apple = new Apple("한국",3000);	
		
		String target = "C:\\Users\\java\\Desktop\\Apple.txt";
		

		try {
			FileOutputStream fos = new FileOutputStream(target);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			//객체 직렬화(파일 내보내기)
			oos.writeObject(apple);
			
			//스트림 해제
			oos.close();
			fos.close();
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("프로그램 종료...");
			
	}
}
