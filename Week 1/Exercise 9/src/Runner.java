public class Runner {

	public static void main(String[] args) {

		String nameOne = "John";

		String nameTwo = "Joghn";
		
		nameString checker = (FirstString, SecondString) -> FirstString.equals(SecondString);
		
		System.out.println(checker.check(nameOne, nameTwo));
		

	}
	
	
	interface nameString {
		boolean check(String FirstString, String SecondString);
	}

}
