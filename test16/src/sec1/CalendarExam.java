package sec1;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();	//Date today = new Date();
		int year = today.get(Calendar.YEAR);
		System.out.println("현재년도 : "+year);
		
		int month = today.get(Calendar.MONTH)+1;// 0~11
		System.out.println("현재 월 : " +month);
		
		int day = today.get(Calendar.DATE);
		System.out.println("현재 날 : "+day);
		
		int doy = today.get(Calendar.DAY_OF_YEAR);
		int dom = today.get(Calendar.DAY_OF_MONTH);
		int dow = today.get(Calendar.DAY_OF_WEEK);
		System.out.println("오늘은 "+year+"년의  "+doy+"일째 날");
		System.out.println("오늘은 "+month+"월의 "+dom+"번째 날");
		System.out.println("오늘은 이번주의 "+dow+"번째 날");
	
		String[] wk= {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		System.out.println("오늘은 "+wk[dow-1]+"입니다.");
		
		int hour12 = today.get(Calendar.HOUR);	//12시간제
		int hour24 = today.get(Calendar.HOUR_OF_DAY);	//24시간제
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);
		int ampm = today.get(Calendar.AM_PM);
		System.out.println(ampm);	//오전0, 오후 1
		
		System.out.println("현재시각 - "+hour24+":"+minute+":"+second);
		
		if(ampm ==0) {
			System.out.println("오전 "+hour12+":"+minute+":"+second);
		}else {
			System.out.println("오후 "+hour24+":"+minute+":"+second);
		}
		
		int timeZone = today.get(Calendar.ZONE_OFFSET);	//밀리초 => 시간 (/1000/60
		int lastDate = today.getActualMaximum(Calendar.DATE);	
		int firstDate = today.getActualMinimum(Calendar.DATE);
		System.out.println("타임존  : "+(timeZone/1000/60/60));
		System.out.println("이달의 마지막 날 : "+lastDate);
		System.out.println("이달의 첫번째 날 : "+ firstDate);
		
		
	}

}

