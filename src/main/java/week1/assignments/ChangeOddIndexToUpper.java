package week1.assignments;

public class ChangeOddIndexToUpper {

	public static void main(String[] args) {
		
		// Here is the input
				String testString = "changeme";
				
		//Build a logic  to change the odd index to uppercase (output:cHaNgEmE)
				/* Pseudo Code: 
				a) Convert the String to character array
				b) Traverse through each character (using loop)
				c) find the odd index within the loop (use mod operator)
				d) within the loop, change the character to uppercase if the index is odd else don't change
				   (use Character.toUpperCase(ch) and print without new line as System.out.print(ch);
			*/
			   
				String output = "";
		        for (int i = 0; i < testString.length(); i++) {
		            if(i%2 == 0)
		            {
		                output += Character.toLowerCase(testString.toCharArray()[i]);
		            }else
		            {
		                output += Character.toUpperCase(testString.toCharArray()[i]);
		            }
		        }

		        System.out.println("Newly generated string is as follow: "+ output);
		    }
		}