
public class Runner {

	public static void main(String args[]) {

		Runner tester = new Runner();

		MathOperation addition = (int a, int b) -> a + b;
		MathOperation subtraction = (int a, int b) -> a - b;
		MathOperation multiplication = (int a, int b) -> a * b;
		MathOperation division = (int a, int b) -> a / b;

		System.out.println("42 + 21 = " + tester.operate(42, 21, addition));
		System.out.println("42 - 21 = " + tester.operate(42, 21, subtraction));
		System.out.println("42 x 21 = " + tester.operate(42, 21, multiplication));
		System.out.println("42 / 21 = " + tester.operate(42, 21, division));
	}

	interface MathOperation {
		int operation(int a, int b);
	}

	int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
}
