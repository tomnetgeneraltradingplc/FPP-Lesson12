package Prob1;

import java.util.Scanner;

public class MarkRangeException {
	// Demo code to throw an exception
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int studentMarrk = 0;
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Please enter student mark in Range of 0 - 100: ");
			studentMarrk = scanner.nextInt();
			if ((studentMarrk < 0)){
				

				throw new Exception("Student Mark should not be Negative!");
			}
			if(studentMarrk > 100){
				throw new Exception("Student Mark should not Greaterthan 100");
			}
			// throw new Exception();
			System.out.println("Student mark: " + studentMarrk);
			System.out.println("End");
		} catch (Exception exc) {
			System.out.println("Error:" + exc.getMessage());
		}
		scanner.close();
	}

}
/*Output
 * Case1//input negative mark
 Please enter student mark in Range of 0 - 100: -71
Error:Student Mark should not be Negative!

Case2//input greater than 100 mark
Please enter student mark in Range of 0 - 100: 130
Error:Student Mark should not Greaterthan 100

Case1//correct input
Please enter student mark in Range of 0 - 100: 92
Student mark: 92
End

*/

