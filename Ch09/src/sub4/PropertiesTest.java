package sub4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/* 날짜 : 2024/01/11
 * 이름 : 김형민
 * 내용 : Properties 실습
 * 
 * 프로퍼티(Properties)
 *  - 문자열(String) 데이터만 취급하는 Key-Value 자료구조 클래스
 *  - 직렬화,역직렬화를 이용해 데이터를 입출력하는 자료구조 클래스
 */ 
public class PropertiesTest {
	public static void main(String[] args) {
		
		// 프로퍼티 저장(직렬화)
		Properties prop = new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
		
		System.out.println(prop);
		
		// 반드시 파일확장자는 properties로 정의
		String target = "C:\\Users\\java\\Desktop\\Fruit.properties";
		
		try {
		FileOutputStream fos = new FileOutputStream(target);
		//직렬화
		prop.store(fos, null);
		//스트림 해제
		fos.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// 프로퍼티 읽기(역직렬화)
		String source = "C:\\Users\\java\\Desktop\\City.properties";
		
		Properties propCity = new Properties();
		try {
			
		FileInputStream fis = new FileInputStream(source);
		//역직렬화
		propCity.load(fis);
		
		//스트림해제
		fis.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(propCity);
		System.out.println(propCity.getProperty("101"));
		System.out.println(propCity.getProperty("104"));
		System.out.println(propCity.getProperty("105"));
		
		
		
		System.out.println("프로그램 종료...");
	}
	
	
}
