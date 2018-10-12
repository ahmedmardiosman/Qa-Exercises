public class Runner {

	public static void main(String[] args) {

		System.out.print("Adding the two integers we get: " + adding(18, 10));

		System.out.println("Multiplying the two integers we get: " + multiplication(18, 10));

		System.out.println("Subtracting the two integers we get: " + subtraction(18, 10));

		System.out.println("Dividing the two integers we get: " + division(18, 10) + " remainder " + remainder(18, 10));

		System.out.println("Dividing the two integers we get: " + div(18, 10));

	}

	static int adding(int a, int b) {

		int sum = a + b;

		return sum;

	}

	// this method is alot more efficient than the one above it.

	static int adding2(int a, int b) {

		return a + b;

	}

	static int subtraction(int a, int b) {

		return a - b;

	}

	static int multiplication(int a, int b) {

		return a * b;

	}

	static int division(int a, int b) {

		return a / b;

	}

	static int remainder(int a, int b) {

		return a % b;

	}

	static double div(double a, double b) {

		return a / b;

	}

}
