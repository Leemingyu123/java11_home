package exam2;

public class GugudanExam {
//2중 = for문 (줄), for문(칸)
	public static void main(String[] args) {
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡ구구단ㅡㅡㅡㅡㅡㅡㅡ\n");
		for(int i= 1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.printf("%dx%d=%d\t",j,i,j*i);
				//ystem.out.print(j+"x"+i+"="+(j*i)+"\t");
			} 
			System.out.println();
			//System.out.print("\n");
			//System.out.printf("%n");
		}
		

	}

}
