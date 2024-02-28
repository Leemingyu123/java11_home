package exam3;

import java.util.ArrayList;
import java.util.List;

public class BoardExam {

	public static void main(String[] args) {
		
		List<Board> boardList = new ArrayList<Board>(); //???
		
		for(int i=1;i<=6;i++) {
			Board board = new Board(i,"글제목"+i, "작성자"+i, "글내용"+i, "작성일"+i, 0);
			boardList.add(board); //???
		}
		
		System.out.println("번호\t제목\t작성자\t작성일");
		for(Board board : boardList) {
			System.out.println(board.getBno()+"\t"+board.getTitle()+"\t"+board.getUname()+"\t"+board.getResdate()+"\t");
		}

	}

}
