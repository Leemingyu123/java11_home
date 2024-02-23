package sec1;

public class Product {
	private String name;
	private int code;
	private int price;
	private int size;
	private int amount;
	private String remark;
	/* 메소드 오버로딩(Method Overload)*/ //오버로딩이랑 오버라이드 차이
	public void print() {
		System.out.println("제품정보");
	}
	public void print(String name) {
		System.out.println("제품이름 : "+name);
	}
	public void print(int amount) {
		System.out.println("제품수량 : "+amount);
	}
	public void print(String name, int amount) {
		System.out.println("제품이름 : "+name);
		System.out.println("제품수량 : "+amount);
	}
	public void print(int amount, String name) {
		System.out.println("제품이름 : "+name);
		System.out.println("제품수량 : "+amount);
	}
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getCode() {
		return code;
	}



	public void setCode(int code) {
		this.code = code;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = size;
	}



	public int getAmount() {
		return amount;
	}



	public void setAmount(int amount) {
		this.amount = amount;
	}



	public String getRemark() {
		return remark;
	}



	public void setRemark(String remark) {
		this.remark = remark;
	}



	@Override
	public String toString() {
		return "Product [name=" + name + ", code=" + code + ", price=" + price + ", size=" + size + ", amount=" + amount
				+ ", remark=" + remark + "]";
	}
	
	
}
