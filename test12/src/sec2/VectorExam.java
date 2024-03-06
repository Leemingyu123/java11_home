package sec2;

import java.util.List;
import java.util.Vector;

public class VectorExam {

	public static void main(String[] args) {
		List<Notice> nVector = new Vector<>();
		
		//글쓰기
		nVector.add(new Notice("제목 1", "내용 1", "정도준"));
		nVector.add(new Notice("제목 2", "내용 2", "김기태"));
		nVector.add(new Notice("제목 3", "내용 3", "조우진"));
		nVector.add(new Notice("제목 4", "내용 4", "최태영"));
		nVector.add(new Notice("제목 5", "내용 5", "한태역"));
		nVector.add(new Notice("제목 6", "내용 6", "조대신"));

		//글목록
		System.out.println("제목\t내용\t작성자");
		for(Notice n : nVector) {
			System.out.println(n.getTitle()+"\t"+n.getContent()+"\t"+n.getAuthor());
		}
		
		
	}

}
