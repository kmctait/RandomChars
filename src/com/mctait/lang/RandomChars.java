package com.mctait.lang;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class RandomChars {

	public static void main(String[] args){
		RandomCharsGenerator rcg = new RandomCharsGenerator();
		try {
			PrintStream out = new PrintStream(System.out, true, "UTF-8");
			
			while(true) {
				out.print(rcg.getRandomChars());
				Thread.sleep(rcg.getRandomDelayInMillis());
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}

}
