package sec1;
//다른패키지에서 불러올수있는 import
import sec2.Animal;
import sec2.Mammal;
import sec2.Birds;

public class Animalex2 {

	public static void main(String[] args) {
		Animal a1; //Animal 객체 선언-sec2것이다
		a1 = new Animal();
		a1.setName("토끼");
		a1.setSpine(true);
		System.out.println(a1.print());
		
		a1 = new Mammal();
		a1.setName("사자");
		//a1.leg = 4; Animal 클래스에있어서 안됨
		
		a1.setSpine(true);
		System.out.println(a1.print());
		
		a1 = new Birds();
		a1.setName("올뺴미");
		System.out.println(a1.print());

	}

}
