package day2.classroom.arrays;

public class CharacterOccurance {


	public static void main(String[] args) {

		// Here is the input
		String test = "I am getting better with Java";

		// Here is what the count you need to find
		char ch = 'J';
		int totalCount = 0;

		char[] array = test.toCharArray();

		// Build the logic to find the count of each
		/* Pseudo Code:
			a) Convert the String to character array
			b) Traverse through each character (using loop)
			c) If the given character matches the expected character (ch),
			   Then, increment totalCount
		 */

		for (int i = 0; i < array.length; i++) {
			if (array[i]=='J') {
				totalCount = totalCount+1;
			}
		}

		// Print the count here
		System.out.println("Total count of character("+ch+"): " + totalCount);

	}

}
