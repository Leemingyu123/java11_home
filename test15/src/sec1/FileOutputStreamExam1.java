package sec1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

// FileOutputStream : 파일의 내용을 바이트 단위로 쓰기위한 클래스
public class FileOutputStreamExam1 {

	public static void main(String[] args) throws IOException {
		File f1 = new File("b.txt");
		if(f1.createNewFile()) {
			System.out.println("파일 생성 성공");
		}else {
			System.out.println("이미 파일이 존재합니다");
		}
		String data = "Hello java";
		FileOutputStream fos = new FileOutputStream(f1);
		fos.write(data.getBytes());	//getByte()는 String을 Byte단위에 계열로 변경
		fos.close();
		
		
		
	}

}
