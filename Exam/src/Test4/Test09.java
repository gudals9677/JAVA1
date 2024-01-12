package Test4;

import java.util.ArrayList;
import java.util.List;

class Orange {
	private String country;
	private int price;
	
	public Orange(String country, int price) {
		this.country = country;
		this.price   = price;
		
		
	}
	
	}
public class Test09 {
	public static void main(String[] args) {
	
		ArrayList<Orange> list1 = new ArrayList<>();
		list1.add(new Orange("파주",3000));
		list1.add(new Orange("파주",3000));
		list1.add(new Orange("파주",3000));
		
		ArrayList<Orange> list2 = new ArrayList<>();
		list1.add(new Orange("파주",3000));
		list1.add(new Orange("파주",3000));;
		list1.add(new Orange("파주",3000));
		
		ArrayList<Orange> list3 = new ArrayList<>();
		list1.add(new Orange("파주",3000));
		list1.add(new Orange("파주",3000));
		list1.add(new Orange("파주",3000));
		
		ArrayList<Orange> list1 = new ArrayList<>();
		list1.add(new Orange("파주",3000));
		list1.add(new Orange("파주",3000));
		list1.add(new Orange("파주",3000));
		
		List<Orange> list = map.get("gyeonggi");
		Orange orange = list.get(2);
		orange.show();
		
		map.set("chungbuk").get(1).show();
		
		map.get("gyungnam").get(0).show();
		
		
	}
	
	
}
}
