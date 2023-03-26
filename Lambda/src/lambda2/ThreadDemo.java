package lambda2;

public class ThreadDemo {

	public static void main(String[] args) {
		
		Runnable thread=() ->{
			
			for(int i=1; i<=10; i++ ) {
				System.out.println("count is :"+i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t=new Thread(thread);
		t.setName("hasan");
		t.start();

	}

}
