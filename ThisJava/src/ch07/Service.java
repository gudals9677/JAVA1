package ch07;

public interface Service {
	
	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속코드");
		
	}
}
