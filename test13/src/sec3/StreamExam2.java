package sec3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//String 타입의 list Stream 방식 활용
//stream.메소드();
public class StreamExam2 {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("이연정");
		lst.add("조우진");
		lst.add("박은성");
		lst.add("강민우");
		lst.add("장인범");
		lst.add("박범수");
		
		//ArrayList의 Stream화
		Stream<String> stream = lst.stream();
		System.out.println("정렬 전");
		stream.forEach(s-> System.out.println(s));
		/*for(String t : lst) {
			System.out.println(t);
		}*/
		System.out.println("정렬 후"); //가나다순으로나옴
		lst.stream().sorted().forEach(s -> System.out.println(s));
		int cnt = (int) lst.stream().count();
		System.out.println(cnt);
	}

}
