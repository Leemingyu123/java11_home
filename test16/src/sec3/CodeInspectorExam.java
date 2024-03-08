package sec3;

import java.io.Reader;

//PME : 코드 인스펙션 도구
public class CodeInspectorExam {

	public static void main(String[] args) {
		Reader r1 = new Reader();
		Reader r2 = new Reader(2, "http://www.naver.com", "네이버사이트", 1);
		r1.def = "시작페이지";
		//System.out.println(r2.toString());
		//System.out.println(r2.def);
		

	}

}
