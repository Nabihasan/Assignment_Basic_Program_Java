package lambdaExpression;

public interface StaticInterfaceExample {
	
	public static void show() {
		System.out.println("show static interface.....");
	}
	 default void show1() {
		System.out.println("show default interface.....");
	}
	 public abstract void show2();
}
