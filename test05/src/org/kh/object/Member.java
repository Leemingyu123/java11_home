package org.kh.object;
//public 			> protected		  > default > private
//*(모든패키지나 클래스) > 동일/상속/연관패키지 > 동일패키지 > 현재 클래스
public class Member {
	private String id;
	private String pw;
	private String email;
	private int birth;
	private String tel;
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getBirth() {
		return birth;
	}


	public void setBirth(int birth) {
		this.birth = birth;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	/*
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	*/
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", email=" + email + ", birth=" + birth + ", tel=" + tel + "]";
	}
	//메소드에 private는 절때 거는경우가 없다.
	
}
