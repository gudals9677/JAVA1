package sub3;

public class Calc {
	
	// 싱클톤 객체 생성
	private static Calc instance = new Calc();
	public static Calc getInstance() {
		return instance;
	}
	public Calc() {}
	
	public int plus(int x, int y) {
		return x + y;
	}
	public int minus(int x, int y) {
		return x - y;
	}
	public int multi(int x, int y) {
		return x * y;
	}
	public int div(int x, int y) {
		return x / y;
	}
//new 못하게 하려고 생성

}