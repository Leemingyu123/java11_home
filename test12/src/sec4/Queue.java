package sec4;

import java.util.LinkedList;

//Queue: First In Fist Out  -> 선입선출: 먼저 입력한 데이터가 먼저 출력되는 자료 구조
//자바에서는 Queue가 인터페이스 이므로 같은 구조를 가진 LinkedList를 이용하여 생성한다.
public class Queue {
	public static void main(String[]args) {
		Queue <String> q = new LinkedList<>();
		
		//큐(Queue)에 요소 추가
		q.offer("아이브");
		q.offer("뉴진스");
		q.offer("케플러");
		q.offer("에스파");
		q.offer("여자아이들");
		q.offer("르세라핌");
		
		System.out.println();
		
	}
}
