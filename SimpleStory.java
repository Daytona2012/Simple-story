package JustSomeStupidStory;

import java.util.Scanner;

public class SimpleStory {

	public static void main(String[] args) {
		
		Scanner userScan = new Scanner(System.in);
		
		/*  Some terms:
	    noun - Person, place or thing
	    verb - An action
	    adjective - A description used to modify or describe a noun
	    */
		
		System.out.print("How old are you? ");
		userScan.nextLine();
		int age = 17;
		if (age < 17) {
			System.out.print("Sorry you must be at least 17 to use this program.\n");
		    System.exit(0);
		} else { System.out.print("Well let's tell a story....\n");}
		
		
		String name;
		String verb;
		String adjective;
		String noun;
		String adverb;
		
		
		System.out.print("Enter your name?  ");
		name = userScan.nextLine();
		System.out.printf("Enter an adjective. ");
		adjective = userScan.nextLine();
		do {
		System.out.printf("Enter an noun. ");
		noun = userScan.nextLine();
		if (noun.equalsIgnoreCase("jerkface")||
				noun.equalsIgnoreCase("dorkhead")||
				noun.equalsIgnoreCase("nerdhead")||
				noun.equalsIgnoreCase("geekface")) {
			System.out.print("That language is not allowed. Try again. \n\n");
		}
		} while (noun.equalsIgnoreCase("jerkface")||
				noun.equalsIgnoreCase("dorkhead")||
				noun.equalsIgnoreCase("nerdhead")||
				noun.equalsIgnoreCase("geekface"));
		System.out.printf("Enter an adverb. ");
		adverb = userScan.nextLine();
		System.out.print("Enter a verb. ");
		verb = userScan.nextLine();
		
		
		System.out.printf("Ok time for your simple story \n-------------------\n");
		System.out.printf("%s is a(n) %s %s. ", name, adjective, noun);
		
		System.out.printf("They are always %s %s. \n", adverb, verb);
    
	}

}
