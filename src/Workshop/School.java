package Workshop;

public class School {
	public static void main(String[] args) {
		Person p = new Student("ȫ�浿�л�", 24, 25000);
		p.print();
		p = new Teacher("ȫ�浿����", 30, "�ڹ�");
		p.print();
		p = new Employee("��浿������", 40, "������");
		p.print();
	}

	public static void MView() {
		Person s = new Student("ȫ�浿�л�", 24, 25000);
		Person t = new Teacher("ȫ�浿����", 30, "�ڹ�");
		Person e = new Employee("��浿������", 40, "������");
		s.print();
		t.print();
		e.print();
		
	}
}
