package sec1;

public class OverloadEx1 {

	public static void main(String[] args) {
		Product pro1 = new Product();
		pro1.print();
		pro1.print(566);
		pro1.print("나이키");
		pro1.print(486, "아디다스");
		pro1.print("보리차", 1000);


	}

}
