package Workshop;

public class School {
	public static void main(String[] args) {
		Person p = new Student("홍길동학생", 24, 25000);
		p.print();
		p = new Teacher("홍길동강사", 30, "자바");
		p.print();
		p = new Employee("김길동관리자", 40, "교무과");
		p.print();
	}

	public static void MView() {
		Person s = new Student("홍길동학생", 24, 25000);
		Person t = new Teacher("홍길동강사", 30, "자바");
		Person e = new Employee("김길동관리자", 40, "교무과");
		s.print();
		t.print();
		e.print();
		
	}
}
