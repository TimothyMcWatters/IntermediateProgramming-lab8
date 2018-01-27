/**
This program:
creates a class that has a recursive method, and tests that recursive method

@author Timothy McWatters
@version 1.0

COP3022    Lab 8
File Name: SentenceTester.java
*/

public class SentenceTester {

	public static void main(String[] args) {
		String s1 = "I do not like green eggs and ham!";
		Sentence sentence1 = new Sentence(s1);
		String substring1 = "eggs";
		System.out.printf("\nThe substring \"%s\" is found in the string \"%s\"? \n", substring1, sentence1.getSentence());
		System.out.println(sentence1.find(s1, substring1));
		
		String s2 = "I do not like them Sam I am!";
		Sentence sentence2 = new Sentence(s2);
		String substring2 = "eggs";
		System.out.printf("\nThe substring \"%s\" is found in the string \"%s\"? \n", substring2, sentence2.getSentence());
		System.out.println(sentence2.find(s2, substring2));
		
		String s3 = "Would you eat them in a house?";
		Sentence sentence3 = new Sentence(s3);
		String substring3 = "house?";
		System.out.printf("\nThe substring \"%s\" is found in the string \"%s\"? \n", substring3, sentence3.getSentence());
		System.out.println(sentence3.find(s3, substring3));
		
		String s4 = "Would you eat them with a mouse?";
		Sentence sentence4 = new Sentence(s4);
		String substring4 = "Wou";
		System.out.printf("\nThe substring \"%s\" is found in the string \"%s\"? \n", substring4, sentence4.getSentence());
		System.out.println(sentence4.find(s4, substring4));
		
		String s5 = "Would you eat them with a fox?";
		Sentence sentence5 = new Sentence(s5);
		String substring5 = " ";
		System.out.printf("\nThe substring \"%s\" is found in the string \"%s\"? \n", substring5, sentence5.getSentence());
		System.out.println(sentence5.find(s5, substring5));
		
		String s6 = "Would you eat them in a box?";
		Sentence sentence6 = new Sentence(s6);
		String substring6 = "would";
		System.out.printf("\nThe substring \"%s\" is found in the string \"%s\"? \n", substring6, sentence6.getSentence());
		System.out.println(sentence6.find(s6, substring6));
		
		String s7 = "1 fish, 2 fish, red fish, blue fish.";
		Sentence sentence7 = new Sentence(s7);
		String substring7 = "2";
		System.out.printf("\nThe substring \"%s\" is found in the string \"%s\"? \n", substring7, sentence7.getSentence());
		System.out.println(sentence7.find(s7, substring7));
		
		String s8 = "1 fish, 2 fish, red fish, blue fish.";
		Sentence sentence8 = new Sentence(s8);
		String substring8 = ".";
		System.out.printf("\nThe substring \"%s\" is found in the string \"%s\"? \n", substring8, sentence8.getSentence());
		System.out.println(sentence8.find(s8, substring8));
		
	} // end of Main method

} // end of SentenceTester class
