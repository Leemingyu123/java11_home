package creational.factorymethod;
//Product 추상클래스
public class IDCard extends Product {
	private String owner;
	
	public IDCard(String owner) {
		System.out.println(owner+"의 카드를만듭니다.");
		this.owner = owner;	
	}

	@Override
	public void use() {
		System.out.println(owner+"의 카드를 사용합니다.");
		
	}

	public String getOwner() {
		return owner;
	}
	
	
	
	
}
