package day2.classroom.arrays;

import java.util.Arrays;

public class MissingElement {


	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,4,6,7,8};
		// 2 3 4 6 7 8
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Traverse through each array item
		 3) Compare consecutive items -> 
		 		the next one should be = previous one + 1
		 4) If the following one is not +1 -> Print as missing
		 */
		int dataLen = data.length;
		Arrays.sort(data);

		int num = data[dataLen-1];
		for (int i = 0; i < data.length; i++) {
			if(i < data.length-1) {
				
				if (data[i] +1 == data[i+1]) {
					System.out.println("no missing");

				}else {
					System.out.println(data[i] +1);
				}



			}



			// Print the second largest number	


		}

	}}
