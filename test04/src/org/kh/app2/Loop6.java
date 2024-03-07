package org.kh.app2;

import java.util.Scanner;

public class Loop6 {

	public static void main(String[] args) {
		/*숫자 맞추기 게임 : 무작위로 퀴즈의 답이 되는 수(랜덤수)를 1~100 번위의 
		정수형태로 발생시키고, 답이 되는 숫자가 입력될 때 까지 계속 입력을 받되 만약,
		퀴즈의 답과 일치하는 숫자를 입력하면, "축하합니다, 맞추셨습니다."라고 출력한다.
		*/
		int quiz = (int) (Math.random()*100);		//Math.random()=0~1까지만나옴 
		System.out.println(quiz);
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("숫자 입력[0-100] : ");
			int n = s.nextInt();
			if(quiz==n) {
				System.out.println("축하합니다. 맞추셨습니다.");
				break;
			}
		}
		
	}

}
