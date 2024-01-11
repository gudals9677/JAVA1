package sub3;




import java.io.FileInputStream;
import java.io.ObjectInputStream;

/* 날짜 : 2024/01/11
 * 이름 : 김형민
 * 내용 : Java 역직렬화 실습
 * 
 */ 
public class DesrializeTest {
	public static void main(String[] args) {
		
		String source = "C:\\Users\\java\\Desktop\\Apple.txt";
		

		try {
			FileInputStream fis = new FileInputStream(source);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			//객체 역직렬화(파일 불러오기)
			Apple apple=(Apple) ois.readObject();
			apple.show();
			//스트림 해제
			ois.close();
			fis.close();
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("프로그램 종료...");
			
	
		
	}
}
