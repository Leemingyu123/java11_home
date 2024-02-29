package exam;

public class Exam611 {
	public static void main(String[]args) {
		//Exam6 p = new Exam6("james", 40, 1, true, 3);
		Exam6 p = new Exam6();
		p.setName("james");
		p.setAge(40);
		p.setGender(1);
		p.setMarried(true);
		p.setChildAmount(3);
		
		p.print();
	}
	
}
