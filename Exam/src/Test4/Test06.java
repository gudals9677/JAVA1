package Test4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Test06 {

	public static void main(String[] args) {
		
		printList(createList()); ///printList//createList 두개 메소드를 호출
	}					//createList 먼저호출
	
	public static void printList(List<Integer> scoreList){
		
		int total = 0;
		int size = scoreList.size();
				
		for(int i = 0; i < size; i++) {
			
			int score = scoreList.get(i);
					
			total += score;
			
			System.out.println(score);
			
			if(i == size - 1) {
				System.out.println(" = ");
			}else {
				System.out.println(" + ");
			}
		}
		System.out.println(total);
	}
	
	public static List<Integer> createList(){
		
		List<Integer> scoreList = new ArrayList<>();
		Random rand = new Random();
		
		for(int i=1; i<=10; i++) {
			
			int num = rand.nextInt(41) + 60; //rand.nextInt(41) 1~40까지
											//(1~40)+60 = 60~100사이정수
			scoreList.add(num);
		}
		
		return scoreList;
	}
}
