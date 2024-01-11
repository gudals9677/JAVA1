package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* 날짜 : 2024/01/11
 * 이름 : 김형민
 * 내용 : Java 파일 Buffer 스트림 실습
 */
public class BufferIOTest {
	public static void main(String[] args) {
		
		String source = "C:\\Users\\java\\Desktop\\Java.zip";
		String target = "C:\\Users\\java\\Desktop\\JavaCopy.zip";
		try {
			//스트림 생성
		FileInputStream  fis = new FileInputStream(source);
		FileOutputStream fos = new FileOutputStream(target);
		
		    //보조 스트림 생성
		BufferedInputStream  bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		while(true) {
			
			// 파일 읽기(input)
			int data = bis.read();
			
			
			if(data == -1) {
				//파일을 모두 읽었을 때 반복종료
				break;
			}
			//숫자를 문자로바꿔서 출력
			//char ch = (char)data;
			
			//System.out.println(ch);
			
			//파일쓰기(output)
			bos.write(data); 
		}
		
		//스트림 해제 메모리 낭비 방지를 위해 무조건 해줘야함.
		bos.flush(); // 버퍼 비우기
		
		bis.close(); 
		bos.close();

		fis.close();
		fos.close();
		
		} catch(Exception e) {
			e.printStackTrace();
		} 
		System.out.println("프로그램 종료...");
	}
}
