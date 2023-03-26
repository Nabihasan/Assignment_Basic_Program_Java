package upcasting_downcasting;

class Parent1 {
	void showMessage() {
		System.out.println("Parent method is called......");
	}
}

class Child1 extends Parent1{
	@Override
	void showMessage() {
		System.out.println("Child method is called........");
	}
}

public class DownCasting {

	public static void main(String[] args) {
		Child1 c1 = new Child1();
		Parent1 p1 = new Parent1();

		c1 = (Child1) p1;// downcasting
		p1 = c1;// upcasting
	}
}
