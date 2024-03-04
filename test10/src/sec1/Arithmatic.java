package sec1;
//같은 레벨 클래스에서 상속받을 수 있음 extends
public class Arithmatic extends Repeator {

	@Override
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		int su =0;
		if(num1>num2) su = num1/num2;
		else su = num2/num1;
		return su;
	}

	@Override
	int power(int num1, int num2) {
		int tmp = num1;
		for(int i = 1;i<num2;i++) {
			num1 = num1*tmp;
		}
		return num1;
		
	}
	

}
