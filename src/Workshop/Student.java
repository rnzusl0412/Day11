package Workshop;

public class Student extends Person {
	private int id;
	
	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void print() {
		System.out.println("�̸� : "+super.getName()+", ���� : "+super.getAge()+", �й� : "+id);
	}

}
