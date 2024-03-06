package sec1;

public class GenericExam {

	public static void main(String[] args) {
		
		Generic1<Student> s = new Generic1<Student>();
		Student a = new Student("장원영", 21);
		s.setField1(a);
		
		Generic1<Teacher> t = new Generic1<Teacher>();
		Teacher b= new Teacher("김기태", 43);
		t.setField1(b);
		
		Generic1<Integer> i = new Generic1<>(); // 기본형 int는 안됨
		i.setField1(155);
		
		Generic1<String> str = new Generic1<>();
		str.setField1("김기태");

	}

}
