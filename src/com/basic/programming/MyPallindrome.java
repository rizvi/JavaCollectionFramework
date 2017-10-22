package com.basic.programming;

/**
 * Basic Programming: Pallindrome
 * 
 * @author Rizvi
 * 
 */
public class MyPallindrome {

	public static void main(String[] args) {
		System.out.println("Is madam pallindrome? Ans: "
				+ isPallindrome("madam"));
		System.out.println("Is referee pallindrome? Ans: "
				+ isPallindrome("referee"));
		System.out.println("Is malayalam pallindrome? Ans: "
				+ isPallindrome("malayalam"));
	}

	public static boolean isPallindrome(String testString) {
		testString = testString.toLowerCase();

		int index = 0;
		int lastIndex = testString.length() - 1;

		while (index < lastIndex) {
			char forwardChar = testString.charAt(index);
			char reverseChar = testString.charAt(lastIndex);

			// Ignore white spaces in checking for a pallindrome, we skip over
			// all white spaces and do not compare them.
			while (forwardChar == ' ') {
				index++;
				forwardChar = testString.charAt(index);
			}

			while (reverseChar == ' ') {
				lastIndex--;
				reverseChar = testString.charAt(lastIndex);
			}

			if (forwardChar != reverseChar) {
				return false;
			}
			index++;
			lastIndex--;
		}
		return true;
	}

}
