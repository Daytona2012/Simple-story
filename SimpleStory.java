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
		
		String name;
		String verb;
		String adjective;
		
		
		System.out.print("What is your name?  ");
		name = userScan.nextLine();
		System.out.printf("Give me a verb %s. ", name);
		verb = userScan.nextLine();
		System.out.printf("Now give me an adjective. ");
		adjective = userScan.nextLine();
		
		System.out.printf("Ok I think I got enough information, I gotta story to tell about this"
				+ " %s.\n", name);
		
		System.out.printf("Do you know %s? ", name);
		System.out.printf("Just one of the most amazing persons you will ever meet, they are %s\n ", adjective + " on the inside and out."); 
		System.out.printf("The only problem they have is %s", verb
		+ ", just never saw the point in it.");
    
	}

}
