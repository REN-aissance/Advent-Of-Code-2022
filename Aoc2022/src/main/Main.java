
package main;

import day1.Day1;
import day2.Day2;

public class Main {

	public static void main(String[] args) {
		Challenge c = getChallenge(args[0]);
		String out = null; 
		try {
			out = c.run(args[1]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(out);
	}

	public static Challenge getChallenge(String arg) {
		int i = Integer.parseInt(arg);
		switch (i) {
			case 1:
				return new Day1();
			case 2:
				return new Day2();
		}
		return null;
	}
}
