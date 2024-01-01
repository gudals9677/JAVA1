package Test2;

public class tes {
public static void main(String[] args) {
	System.out.println("14와 28의 최대공약수 : " +gcd(14,28));
	System.out.println("14와 28의 최대공약수 : " +gcd(60,24));
	System.out.println("14와 28의 최대공약수 : " +gcd(192,162));
}

public static int gcd(int a, int b) {
	while(b != 0) {
		int temp = b;
		b = a % b;
		a = temp;
	}
	return a;
}
}
