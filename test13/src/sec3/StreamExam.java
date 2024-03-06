package sec3;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

//Stream : 입출력 방식의 제어
public class StreamExam {

	public static void main(String[] args) {
		int[]arr= {95,80,100,85,90};// 배열선언
		
		Arrays.stream(arr).forEach(n -> System.out.println(n));	//stream을 이용한 순회 출력=> stream은 반복문을 forEach로 활용함.
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println(avg);
		OptionalInt max = Arrays.stream(arr).max();
		System.out.println(max);
		OptionalInt min = Arrays.stream(arr).min();
		System.out.println(min);
		int cnt = (int) Arrays.stream(arr).count();
		System.out.println(cnt);
	}

}
