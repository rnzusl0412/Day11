package Workshop;

public class Employee extends Person {
	public String dept;

	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public void print() {
		System.out.println("�̸� : "+super.getName()+", ���� : "+super.getAge()+", ���� : "+dept);
	}

}
