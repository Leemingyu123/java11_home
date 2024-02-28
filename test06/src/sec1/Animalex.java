package sec1;
class Animal{
	private String type;
	private String name;
	private int leg=4;
	private int wing=0;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	public int getWing() {
		return wing;
	}
	public void setWing(int wing) {
		this.wing = wing;
	}
	
	@Override
	public String toString() {
		return "Animal [type=" + type + ", name=" + name + ", leg=" + leg + ", wing=" + wing + "]";
	}
	public void print() {
		System.out.println(this.toString());
	}
	
	
}//public 쓰면 오류남, 메인은 Animalex 이기때문

public class Animalex {
	public static void main(String[] args) {
		Animal ani1 = new Animal();
		ani1.setType("포유류");//ani1.type = "";//getter-setter 넣고 set으로 값을 넣어야함
		ani1.setName("호랑이");
		/*ani1.setLeg(4);
		ani1.setWing(0);*/ //to string하고 위private int leg=4; private int wing=0;
		ani1.print();
		
		Animal ani2 = new Animal();
		ani2.setType("조류");
		ani2.setName("독수리");
		ani2.setLeg(2);
		ani2.setWing(2);
		ani2.print();
		
		Animal ani3 = new Animal();
		ani3.setType("파충류");
		ani3.setName("아나콘다");
		ani3.setLeg(0);
		ani3.print();
	

	}
}
