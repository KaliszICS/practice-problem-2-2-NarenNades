/**
 * File: More Functions
 * Author: Naren
 * Date Created: Mar 11, 2026
 * Date Last Modified: Mar 12, 2026
 */

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static Boolean isEven(int num1) {
		Boolean isEven = (num1 % 2 == 0);
		return isEven;
	}

	public static Boolean isOdd(int num1) {
		Boolean isOdd = (num1 % 2 != 0);
		return isOdd;
	}

	public static Boolean isPositive(int num1) {
		Boolean isPositive = (num1 > 0);
		return isPositive;
	}

	public static Boolean isNegative(int num1) {
		Boolean isPositive = (num1 < 0);
		return isPositive;
	}

	public static int combinedLength(String string1, String string2) {
		int combinedLength = string1.length() + string2.length();
		return combinedLength;
	}
}
