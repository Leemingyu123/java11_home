package sec4;

public class StoreExam1 {

	public static void main(String[] args) {
		
		Inventory store;
		store = new Store();
		store.inventory();
		
		Pay pay;
		pay = new Pay();
		pay.pay();
		pay.inventory();
		
		pay = new Store();
		pay.inventory();
		pay.pay();
	}

}
