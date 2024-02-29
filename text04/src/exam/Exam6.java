package exam;

public class Exam6 {
		/*int a= 40;
		String name="James";
		boolean married= true;
		int son = 4;
		
		System.out.println("나이 : "+a+"\n이름 : "+name+"\n결혼 : "+married+"\n자식수 : "+son);*/
		
		private String name;
		private int age;
		private int gender;
		private boolean isMarried;
		private int childAmount;
		public Exam6 () {}
		public Exam6(String name, int age, short gender, boolean isMarried, short childAmount) {
			
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.isMarried = isMarried;
			this.childAmount = childAmount;
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
		public int getGender() {
			return gender;
		}
		public void setGender(int gender) {
			this.gender = gender;
		}
		public boolean isMarried() {
			return isMarried;
		}
		public void setMarried(boolean isMarried) {
			this.isMarried = isMarried;
		}
		public int getChildAmount() {
			return childAmount;
		}
		public void setChildAmount(int childAmount) {
			this.childAmount = childAmount;
		}
		
		public void print() {
			System.out.println("나이 : "+age);
			System.out.println("이름 : "+name);
			System.out.println("결혼여부 : ");
			if(isMarried) {
				System.out.print("기혼\n");
			}else {
				System.out.print("미혼\n");
			}
			System.out.println("자녀수 : "+childAmount);
	

		}
		
		
		
	

}
