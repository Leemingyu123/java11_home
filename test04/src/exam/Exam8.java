package exam;

class MyDate{
	private int day;
	private int month;
	private int year;
	
	public MyDate() {}
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public boolean isValid() {
		boolean valid = false;//unli;lijlji
		if(month==2) {
			if(day>0 && day<29) {
				valid = true;
			} else if(month==4 || month== 6 || month==9 ||month ==11) {
				if(day>0 && day<31) valid = true;
			} else {
				if(day>0 && day<32) valid = true;
				
			}
		}
			return valid;
	}
	public void print() {
		if(this.isValid()) System.out.println("유효한날짜");
		else System.out.println("유효하지않은 날짜");
	}
}

public class Exam8 {
	public static void main(String[] args) {
		
	
		MyDate date1 = new MyDate(30, 2, 2024);
		date1.print();
	
	
	
		
	}
}
