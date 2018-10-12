
public class Runner {

	static String[] numbers = { " ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" };

	static String[] numTeens = { "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
			"eighteen", "nineteen" };

	static String[] numTens = { "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "nintey",
			"One Hundred" };
	
	static String[] numHundreds = { "Onehundred", "twohundred", "threehundred", "fourhundred", "fivehundred", "sixhundred", "sevenhundred", "eighthundred",
	"ninehundred" };
	

	public static void main(String[] args) {

		oneToTen(1, 10);

		hundredToNineHundredAndNintyNine(100, 999);

		oneToTenInWords();

		oneToHundredInWords();
		
		oneToOneThousandInWords();

	}

	static void oneToTen(int a, int b) {

		for (int i = 1; i < b + 1; i++) {
			System.out.println(i);
		}

	}

	static void hundredToNineHundredAndNintyNine(int a, int b) {

		for (int i = 1; i < b + 1; i++) {
			System.out.println(i);
		}

	}

	static void oneToTenInWords() {
		System.out.println("Numbers one to ten in words: ");
		for (String words : numbers) {
			System.out.println(words);
		}
	}

	static void oneToHundredInWords() {
		System.out.println("Numbers one to One hundred in words:");

		for (String wordsOneToTen : numbers) {
			System.out.println(wordsOneToTen);
		}
		for (String wordsTenToNineteen : numTeens) {
			System.out.println(wordsTenToNineteen);
		}

		int x = 0;

		while (x < 8) {

			int y = 0;

			while (y < 10) {
				System.out.print(numTens[x]);
				System.out.println(numbers[y]);
				y = y + 1;
			}

			x = x + 1;
		}

		System.out.println("One Hundred");
	}

	
	static void oneToOneThousandInWords() {
		System.out.println("Numbers one to a One Thousand in words:");

		for (String wordsOneToTen : numbers) {
			System.out.println(wordsOneToTen);
		}
		for (String wordsTenToNineteen : numTeens) {
			System.out.println(wordsTenToNineteen);
		}

		int x = 0;

		while (x < 8) {

			int y = 0;

			while (y < 10) {
				System.out.print(numTens[x]);
				System.out.println(numbers[y]);
				y = y + 1;
			}

			x = x + 1;
		}

		System.out.println("One Hundred");
	
	
	x = 0;

	while (x < 8) {

		int y = 0;

		while (y < 10) {
			System.out.print(numHundreds[x] + " and ");
			System.out.println(numbers[y]);
			y = y + 1;
		}

		x = x + 1;
	}
	
	
	}

	
	
}
