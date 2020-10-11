package jFotso_Assignment3;

import java.util.Scanner;

public class CryptoManager {
	
	private static final char LOWER_BOUND = ' ';
	private static final char UPPER_BOUND = '_';
	private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_BOUND and UPPER_BOUND characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean stringInBounds (String plainText) {
		
		int totalAscii = 0;
		
		for(int i = 0; i < plainText.length(); i++ ) // convert plainText into Asscii value
		{
			int asciiValue =  plainText.charAt(i);
			
			totalAscii += asciiValue;
			
		}
		if(totalAscii <= UPPER_BOUND && totalAscii >= LOWER_BOUND) // return true if character is in acceptable bounds
		{
			return true;
		}
		else 
			return false;
	
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String encryptCaesar(String plainText, int key) {
		String encryptCase = "";
		for(int i = 0; i < plainText.length(); i++ )
		{
			int asciiValue = plainText.charAt(i) + key;
			
			encryptCase += (char)asciiValue;		
		}
		return encryptCase;
		
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String encryptBellaso(String plainText, String bellasoStr) {
		
		String encryptBella = "";
		
		while(bellasoStr.length()<plainText.length())
		{
		bellasoStr += bellasoStr.substring(0,(plainText.length()-bellasoStr.length())); //appends to end
		}
		  
		//encrypts
		for(int i=0;i<plainText.length();i++)
		{
		char c=(char)((int)plainText.charAt(i)+(int)bellasoStr.charAt(i) );
		
		 encryptBella +=Character.toString(c);
		}
		//return result
		return encryptBella;
		}
	
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String decryptCaesar(String encryptedText, int key) {
		
		String plainText = "";
		for(int i = 0; i < encryptedText.length(); i++ ) //turn each char in text to encytion asscii
		{
			int asciiValue = encryptedText.charAt(i) - key;
			
			plainText += (char)asciiValue;		//append decryption to new string
		}
		return plainText;
		
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String decryptBellaso(String encryptedText, String bellasoStr) {
		String encryptBella = "";
		
		while(bellasoStr.length()<encryptedText.length())
		{
		bellasoStr+=bellasoStr.substring(0,(encryptedText.length()-bellasoStr.length()));
		}
		for(int count = 0;count <encryptedText.length();count++)
		{
		char a=(char)((int)encryptedText.charAt(count)-(int)bellasoStr.charAt(count) );
		encryptBella +=Character.toString(a);
		}
		
		return encryptBella;
	}
}