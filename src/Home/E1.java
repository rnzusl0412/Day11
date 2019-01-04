package Home;
abstract class A{		//추상 class, method 는 반드시 상속을 해야만 한다. (상속을 강제한다.)
	public abstract int b();
	//본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
	//public abstract int c() {System.out.println("Hello")}
		//추상 클래스 내에슨ㄴ 추상 메소드가 아닌 메소드가 존재 할 수 있다.
	public void d() {
		System.out.println("world");
	}
}

class B extends A{
	public int b() {
		return 1;
	}
}
public class E1 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//A obj = new A();
		B obj = new B();
	}
}
