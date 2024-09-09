package com.java.proceduralprog;

public class TempClass {
	public static void main(String[] args) {
		String toEncrypt = "Hello There! Secret Message!";
		// 1. Extract individual characters from the string. - Done
		// 2. loop through the characters - Done
		// 3. convert each character to integer - Done
		// 4. increment or decrement by n numbers (take input from user)
		// 5. convert the number back to characters
		// 6. convert the characters to string again.
		int shift = 5;
		char[] individualChars = toEncrypt.toCharArray();
		char[] shiftedCharacterArray = new char[individualChars.length];
		for(int i=0; i<individualChars.length; i++) {
			int charToNumber = (int)individualChars[i];
			shiftedCharacterArray[i] = (char)(charToNumber+shift); 
		}
		System.out.println(new String(shiftedCharacterArray));
	}
}
