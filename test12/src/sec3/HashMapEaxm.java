package sec3;

import java.util.HashMap;
import java.util.Map;

//자료 구조(자료의 논리적인 저장 원리에 따른 구조)
//1. 단순구조(Primitive) : 정수, 실수, 문자, 문자열, 논리형
//2. 선형구조(Sequence) : 배열(Array), 리스트(List), 스택(Stack), 큐(Queue), 덱(Deque)
//3. 비선형구조(Non-Sequence) : 맵(Map), 트리(Tree), 그래프(Graph), 셋(Set)
public class HashMapEaxm {

	public static void main(String[] args) {
		//선언방법
		Map<String, String> map0 = new HashMap<String, String>();	//Map 인터페이스를 활용한 HashMap생성, 형변환가능
		HashMap<String, String> map1 = new HashMap<String, String>();	//HashMap 선언 및 생성 표준식
		HashMap<String, String> map2 = new HashMap<>();	//생성자에 앞서 선언한 인자의 생략이 가능
		HashMap<String, String> map3 = new HashMap<>(map1);	//맵의 복제
		//배열시 개수 지정 ->	String[] arr = new String[10];	//맵의 초기용량은 기본적을 16개
		HashMap<String, String> map4 = new HashMap<>(10);	//초기 용량 지정(capacity) - 초기 용량 지정보다 더많은 데이터를 저장하게 되면, 자동적으로 초기용량의 배로 증가됨
		HashMap<String, String> map5 = new HashMap<>(10, 0.7f);	//load factor - 사용 확률 지정
		HashMap<String, String> map6 = new HashMap<>() {{	//기본 key와 그에 해당하는 값을 적용하여 HashMap생성
			put("name","김기태");
		}};
		
		HashMap<Integer, String> fruits = new HashMap<>();
		
		
	}

}
