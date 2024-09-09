package com.java.proceduralprog;

import java.util.Scanner;

public class EncryptDecrypt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userCryptValue;
		int shiftValue = 0;
		int option;
		boolean isRunning = true;
		System.out.println("####### Encryption Decryption Application #######");
		while(isRunning) {
			System.out.println("Please choose an option from below Menu: ");
			System.out.println("1. Encrypt a String ");
			System.out.println("2. Decrypt a String ");
			System.out.println("3. Quit ");
			option = sc.nextInt();
			switch(option) {
			case 1: 
				System.out.println("Please enter messsage to encrypt :");
				sc.nextLine();
				userCryptValue = sc.nextLine();
				System.out.println("Enter Shift Value :");
				shiftValue = sc.nextInt();
				char[] individualChars = userCryptValue.toCharArray();
				char[] shiftedCharacterArray = new char[individualChars.length];
				for(int i=0; i<individualChars.length; i++) {
					int charToNumber = (int)individualChars[i];
					shiftedCharacterArray[i] = (char)(charToNumber+shiftValue); 
				}
				System.out.println("Your Encrypted Message is : "+new String(shiftedCharacterArray));
				break;
			case 2:
				//
				System.out.println((int)'A');
				break;
			case 3:
				isRunning = false;
				break;
			default:
				System.out.println("Enter a valid option from menu");
				break;
			}
		}
	}
}
