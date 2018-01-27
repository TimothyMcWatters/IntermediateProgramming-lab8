/**
This program:
creates a class that has a recursive method, and tests that recursive method

@author Timothy McWatters
@version 1.0

COP3022    Lab 8
File Name: Sentence.java
*/

public class Sentence {
	private String sentence = "";
	
	/**
	 * Parameterized constructor for the Sentence class
	 * @param sentence = The sentence
	 */
	public Sentence(String sentence) {
		setSentence(sentence);
	} // end of parameterized constructor

	/**
	 * @return the sentence
	 */
	public String getSentence() {
		return sentence;
	}

	/**
	 * @param sentence the sentence to set
	 */
	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	
	/* 
	 * Recursively to search a string and determine if the parameter substring is found
	 * within the string to search. Start at the beginning of the searched string, and recursively 
	 * search the rest of the string until the substring is found or the substring is determined to not
	 * be in the string to search.
	 * @param stringToSearch = the string you are searching for the substring in
	 * @param substring = the substring to find in the string to search
	 * @return boolean = true if substring is found with in the searched string, false if not
	 */
	public boolean find(String sentence, String substring) {
		// substring needs to be smaller than the string in order for it to be located in the string
		if (sentence.length() < substring.length()) {
			return false;
		} 
		// first base case is when we have searched through the entire string until the string and 
		// substring are the same size (since it obviously cant be any further into the string)
		else if (sentence.length() == substring.length()) {
			return sentence.equals(substring);
		}
		// second base case will return true if the substring is found before the end of the string
		// or will start the recursive call searching starting at the next character of the string
		return sentence.startsWith(substring) || find(sentence.substring(0 + 1), substring);
		
	} // end of the find method
	
} // end of Sentence class
