package TEST;

public class fortest {

	public static void main(String[] args) {
		for(int i=1; i<=5;i++) {
			System.out.println("i: " + i);
		}
		int sum = 0;
		
		for(int k=1; k<=10; k++) {
			sum += k;
		}
		System.out.println("1부터 10까지의합 :" +sum);
		
		int tot =0;
		
		for(int k=1; k<=10; k++) {
			if(k%2 == 0) {
			tot += k;
			}
			}
		System.out.println("1부터 10까지의 짝수합 : " + tot);
		
		for(int a=1;a<=3;a++) {
			System.out.println("a: " + a);
			for(int b=1; b<=5;b++) {
				System.out.println("b: " + b);
			}
		}
		
		for(int x=2;x<=9;x++) {
			System.err.println(x+"단");
			for(int y=1;y<=9;y++) {
				int z = x*y;
				System.out.printf("%d x %d = %d\n",x,y,z);
			}
		}
for(int start = 10; start >= 1; start--) {
			
			for(int end=1; end <= start; end++) {
				
				System.out.print("★");
			}
			System.out.println();
		}
	}
	}


