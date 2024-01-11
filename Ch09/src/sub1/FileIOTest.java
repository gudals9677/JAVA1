package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 날짜 : 2024/01/11
 * 이름 : 김형민
 * 내용 : Java 파일 input/output 스트림 실습
 */
public class FileIOTest {
	
	public static void main(String[] args) {
		
		String source = "C:\\Users\\java\\Desktop\\Test1.txt";
		String target = "C:\\Users\\java\\Desktop\\Test2.txt";
		try {
			//스트림 생성
		FileInputStream fis = new FileInputStream(source);
		FileOutputStream fos = new FileOutputStream(target);
		
		while(true) {
			
			// 파일 읽기(input)
			int data = fis.read();
			
			
			if(data == -1) {
				//파일을 모두 읽었을 때 반복종료
				break;
			}
			//숫자를 문자로바꿔서 출력
			char ch = (char)data;
			
			System.out.println(ch);
			
			//파일쓰기(output)
			fos.write(data); 
		}
		
		//스트림 해제 메모리 낭비 방지를 위해 무조건 해줘야함.
		fis.close();
		fos.close();
		
		} catch(Exception e) {
			e.printStackTrace();
		} 
		System.out.println("프로그램 종료...");
	}
	
}
