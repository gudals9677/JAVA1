package sub5;

public class Sedan extends Car {
	
	private int cc;
	
	public Sedan(String name, String color, int speed,int cc) { //Car의 생성자 그대로 가져옴
		super(name,color,speed); // 부모클래스 생성자 호출
		this.cc = cc;
	}
	
	@Override
	public void speedUp(int speed) {
		this.speed += speed + 20;
	}
	public void speedTurbo() {
		this.speed += 20;
	}
	
	public void show() {
		super.show();
		System.out.println("배기량: " + this.cc);
	}
	
	
}
