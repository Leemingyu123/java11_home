package sec1;
//Failure(고장) : 시스템 적인 이상으로 정상적으로 하드웨어나 소프트웨어가 동작하지 못하는 현상
//Error(오류) : 프로그램 작업시에 코드의 문법적 구문 오류, 개발자의 논리적 문장의 실수 등으로 인해 정상적인
//			구문 오류(Syntax Error), 논리 오류(Logical Error), 실행 오류(Run-time Error)
//Exception(예외) : 고장(Failure)이나 오류(Error)와 다르게 개발자의 잘못된 코딩으로 인해 정상적으로
//Mismatch(불일치) : 정상적인 결과와 다르게 결과가 표출되는 것으로 프로그램 코딩 상에 해당 기능이나 구조에 
//예외(Exception) 처리 : 프로그래밍에서 로직상애러가 발생하면, 그 이후의 처리 문장은 처리되지 못하고 실행이 중지되는데, 
//이러한 경우를 예외(Exception)라고 하며, 다음문장까지 실행 될수 있도록 예외사항을 계속 다음문장도 처리될 수 있도록 하는것을 예외 처리라고 한다.
//예외의 구분 : IOException, Run-timeException, SQLException,...
public class ExceptionExam1 {

	public static void main(String[] args) {
		String name = null;
		/*int data;	// 초기화안되서 출력안됨 오류남
		System.out.println(data);*/
		
		//실제 처리할 문장(try)이 예외가 발생하면, 예외처리 문장(catch)을 실행한다.
		try {
			 //실제 처리할 문장
			System.out.println(name.toString());
		} catch(Exception e) {
			//예외가 발생할 경우 처리할 문장
			System.out.println("알수없는 예외가 발생하였습니다");
		}

	}

}
