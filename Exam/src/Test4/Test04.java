package Test4;

public class Test04 {
	public static void main(String[] args) {
		
		String fileName = "HelloWorld.java";
		
		int idx = fileName.indexOf(".");//점 11의 인덱스를 구함
		
		String title = fileName.substring(0,idx);
		String ext   = fileName.substring(idx+1); //idx 기준으로 substring
		
		System.out.println("파일명 : " + title);
		System.out.println("확장자 : " + ext);
		
		String strScores = "60, 72 ,82 , 86 , 92"; //이수들을 더하려면 쪼개야함
												   //
		String[] scores = strScores.split(","); // split ,기준으로 쪼개기
				
			int total = 0;
		
				for(String score : scores) {
					
					total += Integer.parseInt(score.trim());   
					//인티저 나온이유는 문자열을 기본열로 바꾸기위해
					//trim() << 공백 없애기
				}
				
				System.out.println("strScores 총점 : " + total);
	}
}
