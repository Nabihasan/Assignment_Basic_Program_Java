package lambdaExpression;

public class MainClass {

	public static void main(String[] args) {


		System.out.println("system starting----------");
		
//		lambda1 l=new ImplimentClass();
//		l.show();
	
//		lambda1 l=new lambda1() {
//			public void show() {
//				System.out.println("this is first time anonymus class....");
//			}
//		};
//		anonymous class
//		l.show();
//		
//		lambda1 l1=new lambda1() {
//			public void show() {
//				System.out.println("this is second time anonymus class....");
//			}
//		};
//		
//		l1.show();
		
		//using lambda 
		
		lambda1 l= () ->{
			System.out.println("this is lamba function......");
		};
		
		l.show();
		
		Sum s=(a,b) -> a + b;
		
		System.out.println("adding of two no:"+s.sum(12, 89));
		System.out.println("adding of two no:"+s.sum(20, 29));
		
		Substraction n=( x, y) -> x - y;
		

		System.out.println(n.minus(120, 89));
		System.out.println(n.minus(200, 29));
		
//		Stringlength ls=(String str)->{
//			return str.length();
//		};
//		int x1=ls.getLength("nabi hasan");
//		System.out.println("length of String :"+x1);
		
		//we can write this also if we have single method
		
		Stringlength ls= str-> str.length();
		
		int x1=ls.getLength("maroof khan salman");
		System.out.println("length of String :"+x1);
	}

}
