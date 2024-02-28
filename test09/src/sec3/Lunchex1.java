package sec3;

public class Lunchex1 {

	public static void main(String[] args) {
		Lunch food;
		
		food = new Korean();
			food.eating("김밥");
			
		food = new Chinese();
			food.eating("짜장면");

		food = new Japanese();
			food.eating("초밥");


	}

}
