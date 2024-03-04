package sec2;

public class StringExam1 {

	public static void main(String[] args) {
		
		String name1 = "김기태";
		String name2 = new String("김기태");
		Integer su1 = 1004;
		String su2 = "1004";
		System.out.println(su1.equals(su2)); //int와 String은 정수와 문자라 비교가 불가하지만 Integer 로 참조형으로 바꾸면 가능
		//String su3 = new String(su1);
		String su3 = String.valueOf(su1);
		System.out.println(su1.equals(su2));
		System.out.println(su2.equals(su3));
		
		String str = "강범준/박동빈/이성하/조대신/배곤희/권민지";
		String[] names = new String[6];
		names = str.split("/");		//문자열 분리
		for(String s : names) {
			System.out.println(s);
		}
		String str2= String.join("/", names);		//문자열 합치기ㅉ
		System.out.println(str2);
		
		String data = "  ivE\'s beaUty grOup\nnewJeans is girlgroup Top ";
		
		
		char ten = data.charAt(9);		//10번째 문자 (인덱스가 9인 문자)
		System.out.println(ten);
		String trimData = data.trim();	//앞 뒤의 공백을 제거하여 trimData에 저장
		System.out.println(trimData.length()+trimData);
		int size = data.trim().length();		//글자수를 size에 저장
		int n = data.indexOf(n); 			//n의 글자 위치(인덱스)를 n에 저장
		
		String up = data.toUpperCase();		//모두 대문자로 변환하여 up에 저장
		String down = data.toLowerCase(); 	//모두 소문자로 변환하여 down에 저장
		String sub1 = data.substring(20,28); 	//공백을 제거하고, 20번째 글자 부터 27번째만 추출
		String sub2 = data.new("newJeasn", "kepler"); 	//newJeans의 단어를 Kepler로 변경하여 sub2에 저장
		byte[] girl = data;		//문자열을 girl 문자배열로 변환하여 저장
		
		
	}

}
