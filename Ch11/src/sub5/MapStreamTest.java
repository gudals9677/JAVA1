package sub5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

public class MapStreamTest {
	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("김유신",23));
		persons.add(new Person("김춘추",21));
		persons.add(new Person("장보고",33));
		persons.add(new Person("강감찬",43));
		persons.add(new Person("이순신",53));
		
		// map : 스트림 특정 요소를 다른 요소로 변환
		persons
			.stream()
			.map(person -> person.getName()) // person의 name만 리턴을 한다는 뜻
			.forEach(name -> System.out.print(name + ", "));
		
		System.out.println();
		
		//flatMap : 스트림 특정 요소를 다른 여러개의 요소로 변환
		List<List<String>> nestedList = Arrays.asList(
				Arrays.asList("apple","banana"),
				Arrays.asList("oragne","grape"),
				Arrays.asList("peach","melon")
				
				
		);
		
		nestedList.stream()
				.flatMap(list -> list.stream())
				.forEach(str -> System.out.print(str + ", "));
				
				
				
	}
}
