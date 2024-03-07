package exam;

public class Exam5 {
	public static void main(String[]args) {
		for(int i=1;i<=7;i++) {
			if(i<=4) {
				for(int j=4-i;j>0;j--) {
					System.out.print(" ");
			}
				for(int j=1;j<=2*i-1;j++) {
					System.out.print("*");
				}
				
		} else {
				for(int j1=1;j1<i-3;j1++) {
					System.out.print(" ");
				}
				for(int j2=5;j2>i*2-10;j2--) {
					System.out.print("*");
				}
			}
			System.out.println();
	
		
	}
	}
}
/*줄 빈칸 별수
 *1	3	1 =  2*i-1
 *2	2	3
 *3	1	5
 *4	0	7 
 *
 *
 *줄	j1	j2
 *5	1	5 
 *6	2	3
 *7	3	1

 */