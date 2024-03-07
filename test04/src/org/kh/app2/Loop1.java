package org.kh.app2;
//반복문 : for, while, do~while~
public class Loop1 {

	public static void main(String[] args) {
		int n = 0;
		/*
		n = n+1;
		n = n+1;
		n = n+1;
		n = n+1;
		n = n+1;
		n = n+1;
		n = n+1;
		n = n+1;
		n = n+1;
		*/
		/*조건식이 참 일때 동안만 반복수행한다.
		 * for(a초기식;b조건식;c증감식){d반복해야할문장;}
		 a->b->d->c->b->d 반복하다가 조건이 만족되지 않으면 종료
		 */
		for(int i=0;i<10;i++) //0 1 2~9 //i는0이고-> 10보다 작다->i는1씩후위증가
			{n = n+1;}	     //1 2 3~10
			System.out.println("n ="+n);
		// []는 배열에쓰인다
		int[] nums = {80, 95, 75, 60, 100, 65,70,90,85,95};//배열, 순번은 0을시작9로끝
		String names[] = {"김","이","박","최","정","오","배","강","장","계"}; //[]위치
		int tot = 0;
			System.out.println("nums : "+nums);
			System.out.println("names : "+names);
			System.out.println("\n이름\t점수\t학점\t판정");
		int max=nums[0], min=nums[0]; //== max=0, min=100;
		for(int i=0;i<10;i++) { 
			tot += nums[i]; 
			System.out.print(names[i]+"\t "); // \t는 탭 만큼 띄운다
			System.out.print(nums[i]+"\t");
			if(nums[i]>=90) {
					System.out.print("A\t");
			} else if (nums[i]>=80) {
				System.out.print("B\t");
			} else if (nums[i]>=70) {
				System.out.print("C\t");
			} else if (nums[i]>=60) {
				System.out.print("D\t");
			} else {
				System.out.print("F/t");
			}
			if(nums[i]>=70) {
				System.out.print("합격\n");
			} else {
				System.out.print("탈락\n");
			}
			if (nums[i]>max) max=nums[i];
			if (nums[i]<min) min=nums[i];
					
		}
		
		//num[0], index(순번) 0~9, num[10] = 없는데 요구하는 에러[out of bounds], nums[10] = 70;으로추가가능
		System.out.println("전체총점 : "+tot);
		System.out.println("평균 : "+tot/10.0f); // 10은 정수 평균은 소수점까지해야하니 f써야함
		System.out.println("최대점수 : "+max);
		System.out.println("최대점수 : "+min);

	}

}
