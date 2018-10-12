public class Runner {

	static String hello = "Hello ";

	public static void main(String args[]) {
		GreetingService greetService1 = message -> System.out.println(hello + message);
		greetService1.sayMessage("World!!");
	}

	interface GreetingService {
		void sayMessage(String message);
	}
}