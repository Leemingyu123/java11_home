package sec3;

import java.util.ArrayList;
import java.util.List;

//Class 타입의 List Stream 방식 활용
class Tour{
	private String name;
	private int age;
	private int price;
	public Tour () {}
	public Tour(String name, int age, int price) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Tour [name=" + name + ", age=" + age + ", price=" + price + "]";
	}
	
	
}
public class StreamExam4 {

	public static void main(String[] args) {
		List<Tour> vList = new ArrayList<>();
		Tour v1 = new Tour("김기태", 43, 1000);
		Tour v2 = new Tour("조대신", 15, 500);
		Tour v3 = new Tour("권민지", 72, 0);
		Tour v4 = new Tour("이원석", 22, 0);
		Tour v5 = new Tour("김응원", 31, 1000);
		
		vList.add(v1);
		vList.add(v2);
		vList.add(v3);
		vList.add(v4);
		vList.add(v5);
		
		//Stream<Tour> vStream = vList.stream();
		System.out.println("객체순회");
		vList.stream().forEach(tour -> System.out.println(tour.toString()));
		System.out.println("이름만추출");
		vList.stream().forEach(tour -> System.out.println(tour.getName()));
		vList.stream().map(tour -> tour.getName()).forEach(s -> System.out.println(s));
		System.out.println("나이가 30이상인 사람의 이름을 정렬하여 출력");
		vList.stream().filter(tour -> tour.getAge()>=30 ).map(c->c.getName()).sorted().forEach(s -> System.out.println(s));
		
	}

}
