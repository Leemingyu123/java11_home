package test;

import com.kh.test4.model.Person;

public class test4 {

	public static void main(String[] args) {
		
		Person[] pArr = new Person[3];
		pArr[0] = new Person("김기태", 43);
		pArr[1] = new Person("이성하", 54);
		pArr[2] = new Person("이예린", 24);	//비어있거나 초기화 되어 있지 않은 pArr배열에 Person객체를 생성하여 각 요소(0~2)에 생성된 객체를 대입
		for(int i=0; i< pArr.length;i++) {//for(int i=0; i<= pArr.length;i++) {	//실제 선언한 배열의 개수보다 더 많은 수의 반복실행이된다.
			//(요청한 횟수가 배열수보다 더 많다) =>ArrayIndexOutOfBoundsException 발생
			System.out.println(pArr[i].getNaem());	//Person의 배열요소인 pArr 객체가 
			//초기화(값이 존재)되어 있지 않아=>NullpointException 발생
		}
	}

}
