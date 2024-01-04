package sub02;

public class Car {

	//속성(필드)
	private String name;
	private String color;
	private int speed;
	
	//생성자 - 캡슐화된 속성을 초기화하기 위한 메서드
	public Car(String name,String color,int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	//기능(메서드)
	public void speedUp(int speed) {
		this.speed += speed;
	}
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	public void show() {
		System.out.println("차량명 : " + name);
		System.out.println("차량색 : " + color);
		System.out.println("현재속도 : " + speed);
	}
	//Getter, Setter - 필요에 따라서 정의 (같이나옴)
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	}


