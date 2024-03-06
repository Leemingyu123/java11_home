package sec3;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExam {

	public static void main(String[] args) {
		//TreeMap 선언 및 객체 생성
		Map map0 = new TreeMap<>();
		TreeMap map1= new TreeMap<Integer, String>();
		TreeMap map2= new TreeMap<>();
		TreeMap map3= new TreeMap<>(map1);
		TreeMap map4= new TreeMap<>() {{
			put(1,"이민규");
		}};
		
		map2.put(1, "김기태");	//요소(Entry)추가
		map2.put(2, "박은성");
		map2.put(3, "조대신");
		map2.put(4, "조우진");
		map2.put(5, "이희훈");
		
		map2.remove(4);	//키가 4인요소를 제거
		//map2.clear();	//TreeMap 비우기
		//TreeMap 순회하여 출력
		for(Integer i : map2.keySet()) {
			System.out.println(i+":"+map2.get(i));
		}
		System.out.println(map2);
		
		
	}

}
