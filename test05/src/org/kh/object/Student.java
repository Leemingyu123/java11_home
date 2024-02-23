package org.kh.object;

public class Student {
	String name="아무개";
	int kor; 
	int eng;
	int mat;
	/*public*/ int tot() { //public을 지우면 해당 pakage에서만 쓸수있음
		return this.kor+this.eng+this.mat;
	}
	
	float avg() {
		return (this.kor+this.eng+this.mat) / 3.0f;
	}
	void resulting() {
		System.out.println("이름 : "+this.name+"\n총점 : "+this.tot()+"\n평균 : "+this.avg());
	}

}
