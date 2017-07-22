package sorting;

import java.util.Random;

public class RandomGenerator {
	private String randomString;
	private String[] theArray;
	private String characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

	public String[] generateString(int value) {
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		String [] arr = new String[value];
		int i;
		for (i = 0; i < value; i++) {
			int numOfChars = (int)(Math.random()*5);
			while (sb.length() < numOfChars) {
				int index = (int) (Math.random() * characters.length());
				sb.append(characters.charAt(index));
			}
			String string = sb.toString();
			arr[i] = string;
		}
	
		return arr;
	}
}
