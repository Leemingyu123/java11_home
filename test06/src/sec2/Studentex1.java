package sec2;

public class Studentex1 {

	public static void main(String[] args) {
		Student s1 = new Student("이민규", 1, 100000);
		Student s2 = new Student("박준현", 2, 200000);
		Student s3 = new Student("정민혁", 3, 300000);
	
		Bus bus1 = new Bus(101) ;
		s1.takeBus(bus1);
		s1.print();
		bus1.show();
		
		//박준현 학생이 101버스를 두번 이용하고, 지하철을 2호선 세번 이용했을 경우
		//박준현 학생의 정보와 버스 101호 정보와 지하철 2호선의 정보를 출력해라
		Subway sub2 = new Subway(2);
		s2.takeBus(bus1);
		s2.takeBus(bus1);
		s2.takeSubway(sub2);
		s2.takeSubway(sub2);
		s2.takeSubway(sub2);
		s2.print();
		bus1.show();
		sub2.show();
	}

}
