package Test2;

public class lcd {
public static void main(String[] args) {
	
	int x = 8;
	int y = 12;
	
	int i=1;
	
	while(true) {
		if(i % x ==0 && i % y==0) {
			System.out.println(i);
			break;
		}
		
		
		i+=1;
		
	}
}
}
