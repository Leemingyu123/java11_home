package sec1;

import java.util.Scanner;

public class Studentex {
/*5명의 점수를 Scanner활용해 키보드로 입력받아 총점, 평균, 학점을 계산해 아래처럼 나오게해라
   i 번호 국어 영어 수학 총점 평균 학점
 s[0] 1	90	90	90	270	90.0 A
 s[1] 2 80	70	60	210	70.0 C
 s[2] 3	90	80	70	240	80.0 D	
 s[3] 4	60	90	70	220	73.3 C	
 s[4] 5	70	90	90	250	83.3 B
 */
	
	public static void main(String[] args) {
		//5명의 학생을 배열 객체선언
		Student[] s = new Student[5];
		Scanner scn = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			s[i] = new Student(); // 개별 객체생성
			s[i].setNum(i+1);
			
			System.out.print((i+1)+"번째 국어 :");
			s[i].setKor(scn.nextInt());
			System.out.print((i+1)+"번째 영어 :");
			s[i].setEng(scn.nextInt());
			System.out.print((i+1)+"번째 수학 :");
			s[i].setMat(scn.nextInt());
		}
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t학점\t");
		for(int i =0;i<5;i++) {
			s[i].print();
		}
	}

}
