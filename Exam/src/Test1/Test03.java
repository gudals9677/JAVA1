package Test1;

public class Test03 {
	public static void main(String[] args) {
		
		int num=1;
		int result = 0;
		
		result = num++; //대입 후 증가
		System.out.println("result : "+result);
		
		result = ++num; // 증가 후 대입
		System.out.println("result : "+result);
		
		result = num--;
		System.out.println("result : "+result);
		
		result = --num;
		System.out.println("result : "+result);
}
}
