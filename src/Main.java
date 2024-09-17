import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: Daniel Lin
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to prison!");
		System.out.println("Imma need some answers outta you, got it bud? ;)");
		System.out.println("Now, what's your name?");
		String name = in.nextLine();
		System.out.println("That's very nice... so nice that it matches the current suspects name");
		System.out.println("Imma need your age now");
		in.nextInt();
		in.nextLine();
		System.out.println("Where were you last Thursday, at exactly 4 in the morning? (One word answer please) ");
		String place = in.nextLine();
		System.out.println("Okay... I see, well im hungry and in a mood, sooooo, could you just confess? (Yes or No)");
		String name2 = in.nextLine();
		
		
	}

}
