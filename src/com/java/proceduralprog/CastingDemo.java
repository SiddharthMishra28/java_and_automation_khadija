package com.java.proceduralprog;

public class CastingDemo {

	public static void main(String[] args) {
		String myWord = "Hello there!";
		int[] rollNumbers = {1,2,3,4,5,6,7,8,9,10};	
		//                   0,1,2,3............9
//		System.out.println(rollNumbers[2]);
//		char[] myChars = {'h', 'e', 'l', 'l', 'o', ' ', 't', 'h', 'e', 'r', 'e'};
		char[] mychars = myWord.toCharArray();
//		for(int i=0; i<rollNumbers.length; i++) {
//			System.out.println(rollNumbers[i]);
//		}
		for(int i=0; i<mychars.length; i++) {
			System.out.println(mychars[i]);
		}
		
		// A, B, C, D....Z a,b,c,d....z
		// 1, 2, 3, 4   26,27,28.....
		// hello
		// 85.19.19.22
		System.out.println((int)'A');
		System.out.println((char)97);
	}

}
