package com.mctait.lang;

import java.util.Random;

public class RandomCharsGenerator {
	
	public final int MIN_DELAY = 10;
	public final int MAX_DELAY = 2 * 1000;
	public final int MIN_NUM_CHARS = 10;
	public final int MAX_NUM_CHARS = 250;
	public final char startCharRange = '\u1200';
	public final char endCharRange = '\u1375';
	//

	public RandomCharsGenerator() {
	}
	
	public String getRandomChars() {
		String output = new String();
		int iterations = getRandomNumber(MIN_NUM_CHARS, MAX_NUM_CHARS);
		for(int i = 0; i < iterations; i++) {
			char c = getRandomChar();
			if(!Character.isWhitespace(c))
				output += c;			
		}
		output += '\n';
		return output;
	}
	
	public long getRandomDelayInMillis() {
		return (long)getRandomNumber(MIN_DELAY, MAX_DELAY);
	}
	
	private char getRandomChar(char fromChar, char toChar) {
		int unicode  = fromChar + (int)((toChar - fromChar +1) * Math.random());
		return (char)unicode;
	}
	
	private char getRandomChar() {
		//http://jrgraphix.net/research/unicode_blocks.php
		return getRandomChar(startCharRange, endCharRange);
	}
	
	private int getRandomNumber(int min, int max) {
		Random r = new Random();
		int randNumber = r.nextInt(max-min) + min;
		return randNumber;
	}
}
