package sec1;
//필드 : 번호, 국어,영어,수학점수
//메소드 :getter/setter 및 총점, 평균, 학점계산
public class Student {
	private int num;
	private int kor;
	private int eng;
	private int mat;
	
	public int tot() { //메소드 앞에 퍼블릭 
		return kor+eng+mat;
	}
	public float avg() {
		return tot()/3.0f;
	}
	public String hak() {
		String h= "F";
		if(this.avg()>=90) h = "A";
		else if(this.avg()>=80) h = "B";
		else if(this.avg()>=70) h = "C";
		else if(this.avg()>=60) h = "D";
		else h = "F";
		return h;
	}
	
	public void print() {
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%.1f\t%s\n", this.num, this.kor, 
				this.eng, this.mat, this.tot(), this.avg(), this.hak());
	}
	
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	

	

}
