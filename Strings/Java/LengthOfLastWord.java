package com.jagjit.Hactoberfest;


/**
 * https://leetcode.com/problems/length-of-last-word/
 * runtime beats 47.01% of Java submissions
 * memory usage beats 100.00%  of Java submissions
 */
public class LengthOfLastWord {

	
	//function gives length of last word 
	public int lengthOfLastWord(String s) {

		s = s.trim();//trim the string
		
		//split the string where " "(space) is there and stored in in the string array 
		String st[] = s.split(" ");

		int n = st.length; // get the value of the string array

		String str = st[n - 1]; // get the string of last index in String array

		return str.length(); //return the length of last word

	}
	
	
	//Main function
	public static void main(String[] args) {

		String input = "Hello World"; //input String 
		
		LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
		
		//Print the length of last word of string 
		System.out.println("The length of last word is " + lengthOfLastWord.lengthOfLastWord(input));

	}

}
