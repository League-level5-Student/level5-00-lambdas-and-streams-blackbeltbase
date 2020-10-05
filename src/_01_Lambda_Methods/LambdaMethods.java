package _01_Lambda_Methods;

import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
		
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)-> {
			for(int i = s.length()-1; i>=0;i--) {
				System.out.print(s.charAt(i));
			}
			System.out.println("");
		}, "backwards");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)-> {
			Random ran = new Random();
			for(int i = 0; i<s.length();i++) {
				String letter = ""+s.charAt(i);
				if(ran.nextInt()%2 == 0) {
					letter = letter.toUpperCase();
				}
				else {
					letter = letter.toLowerCase();
				}
				System.out.print(letter);
			}
			System.out.println("");
		}, "mixed case");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)-> {
			for(int i = 0; i<s.length();i++) {
				String letter = s.charAt(i)+" . ";
				System.out.print(letter);
			}
			System.out.println("");
		}, "period in between");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)-> {
			for(int i = 0; i<s.length();i++) {
				String letter = s.charAt(i)+"";
				switch(letter) {
				case "a": break;
				case "e":break;
				case "i":break;
				case "o":break;
				case "u":break;
				default: System.out.print(letter);
				break;
				}
			}
			System.out.println("");
		}, "consanants only");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
