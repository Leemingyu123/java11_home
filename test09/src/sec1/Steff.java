package sec1;
//구현클래스
public class Steff extends User {
	 private int level; //접근레벨
	 private String part; //근무부서
	 private String name; //이름
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Steff [level=" + level + ", part=" + part + ", name=" + name + "]";
	}
	
	@Override
	public void connect() {
		System.out.println(part+"의"+name+"가(이)출근하였습니다.\n");	
	}
	 
	

}
