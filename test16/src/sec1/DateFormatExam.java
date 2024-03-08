package sec1;

import java.text.SimpleDateFormat;
import java.util.Date;

//SimpleDateFormat : 날짜 표시형식을 지정할 때 활용하는 클래스
public class DateFormatExam {

	public static void main(String[] args) {
		Date today = new Date();
		//표시형식 코드 : y=년, M=월, d=일, hh=시, m=분, s=초, E=요일, a=오전/오후, W=월 중 몇 번째 주, w=년 중 몇 번째 주
		SimpleDateFormat fnt1 = new  SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println(fnt1);
		SimpleDateFormat fnt2 = new  SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat fnt3 = new  SimpleDateFormat("오늘날짜 : yyyy년 MM월 dd일(E), 현재시각 : a hh시 mm분 ss초");
		SimpleDateFormat fnt4 = new  SimpleDateFormat("yyyy년 MM월 W번째 주");

		
		//날짜데이터에서 특정 표시형식이 부여된 문자열로 변환
		String t1 = fnt1.format(today);
		System.out.println(t1);
		
		String t2 = fnt2.format(today);
		System.out.println(t2);

		String t3 = fnt3.format(today);
		System.out.println(t3);
		
		String t4 = fnt4.format(today);
		System.out.println(t4);
	}

}
