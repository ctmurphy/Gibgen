import java.util.*;

public class GibGen {

	Scanner scanIn;					//Scanner to read in text
	StringBuilder textOutput;		
	String[] words;					//String[] that holds each word in passed into the scanner
	
	/**
	 * GibGen constructor
	 * @param in
	 */
	public GibGen(String in) {
		this.scanIn = new Scanner(in);   
		this.words = in.split("//s+");	  //Puts each word from given string (separated by whitespace) in a string[]
		this.textOutput = new StringBuilder(in.length());	//Initializes the output to the same size as the input
	}
	
	/**
	 * Method that examines each "word" in original string to determine which chars to scramble
	 */
	public void parseString() {
		for (int i = 0; i < words.length; i++) {  //For each word in the String[]
			int index = 0;  //Start at the beginning of the word
			while (index < words[i].length()) {
				while (Character.isLetter(words[i].charAt(index))) {
				index++;
				}
			// If we got to the end of the word and it isn't an UpperCase abbreviation
			if ((index == words[i].length()+1) && (!words[i].equals(words[i].toUpperCase()))) {
				if (index >= 3) {  // If the word is big enough to be scrambled
					scrambleAndAdd(words[i], 0, index-1);
					textOutput.append(" "); // Add a space after the scrambled word
				}
				else {  // If the word is NOT big enough to be scrambled
					textOutput.append(words[i].toString());
					textOutput.append(" ");	// Add a space after the unscrambled word
				}
			}
			// If we got to the end of the word and it IS an UpperCase abbreviation
			else if ((index == words[i].length()+1) && (words[i].equals(words[i].toUpperCase()))) {
				textOutput.append(words[i].toString());
				textOutput.append(" ");
			}
			// If we didn't get to the end of the word (meaning either punctuation or number exists)
			else if (index != words[i].length()+1) {
				int start = 0;  //Reference used when scrambling partial words
				while (start < words[i].length()) {  
				if ((index - start) < 4) {  //If portion not big enough to scramble
					for (int j = start; j <= index; j++) {
						textOutput.append(words[i].charAt(j));  //Append each letter to textOutput
					}
					index++;
					start = index;
					while ((index < words[i].length()) && (Character.isLetter(words[i].charAt(index)))) {
						index++;
					}
				}
				else {	// If portion big enough to scramble
					scrambleAndAdd(words[i], start, index);
					textOutput.append(String.valueOf(words[i].charAt(index)));
					index++;
					start = index;
					while ((index < words[i].length()) && (Character.isLetter(words[i].charAt(index)))) {
						index++;
					}
				}
	
				}
				textOutput.append(" "); // Add space after word
				}
			}
			}
		
	}
	/**
	 * A method that takes a char[] and returns a scrambled char[]
	 * @require char[].length > 3
	 * @ensure	char[0] && char[length-1] stay the same
	 */
	private void scrambleAndAdd(String s, int start, int end) {
		String scrambled = new String("");  // The complete scrambled String
		scrambled = scrambled + s.charAt(start);	//Set each first char equal
		
		//Make temp char[] that contains portion of string to be scrambled
		char[] temp = new char[(end-start)-2];		
		// Copy all chars into temp[] to be manipulated
		int t = 0;
		for (int i = start+1; i < end-1; i++) {	
			temp[t] = s.charAt(i);
			t++;
			}
		
		//Scramble them
		int last = temp.length-1;
		for (int i = 0; i < last; i++) {
			char a = temp[i];	//Swap
			temp[i] = temp[last];
			temp[last] = a;
			last--;
		}
		
		// Add scrambled letters plus last letter to scrambled
		String add = new String(temp);
		scrambled = scrambled + add;
		scrambled = scrambled + s.charAt(end-1);
		
		// Add scrambled word/portion of word to the final output
		textOutput.append(scrambled);
	}
	
	
	public void print() {
		System.out.print(textOutput.toString());
	}
	
}
