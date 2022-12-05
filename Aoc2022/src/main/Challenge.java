package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public abstract class Challenge {

	public BufferedReader reader;

	public Challenge(String s) {
		try {
			reader = new BufferedReader(new FileReader(s));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public String run(String s) throws Exception {
		Integer command = Integer.parseInt(s);
		String output = null;
		
		setup();
		if (command == 1)
			output = challenge1();
		else if (command == 2)
			output = challenge2();
		reader.close();
		return output;
	}

	public abstract void setup() throws Exception;
	public abstract String challenge1() throws Exception;
	public abstract String challenge2() throws Exception;
}
