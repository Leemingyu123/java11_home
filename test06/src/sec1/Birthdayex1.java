package sec1;

public class Birthdayex1 {

	public static void main(String[] args) {
		Birthday birth1 = new Birthday();
		birth1.setName("이민규");
		birth1.setYear(1994);
		birth1.setMonth(02);
		birth1.setDay(11);
		birth1.birth();
		birth1.birthAddr();
		
		Birthday birth2 = new Birthday();
		birth2.setName("박준현");
		birth2.setYear(1994);
		birth2.setMonth(07);
		birth2.setDay(24);
		birth2.birth();
		birth2.birthAddr();

	}

}
