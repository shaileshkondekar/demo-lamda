
public class LambdaDemo {

	public static void main(String[] args) {
		
		Thread thread = new Thread(()->{System.out.println("This is lambda demo");System.out.println("this is another statement...");});
		thread.start();
	}

}
