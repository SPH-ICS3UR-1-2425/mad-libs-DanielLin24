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
		int age = in.nextInt();
		in.nextLine();
		System.out.println("Ok... Where were you last Thursday? (One word answer please) ");
		String place = in.nextLine();
		System.out.println("Uh huh, and at what time was this exactly? (Type the time like x.xx)");
		double time = in.nextDouble();
		in.nextLine();
		System.out.println("What did you have on you that time? (One important item please)");
		String item1 = in.nextLine();
		System.out.println("Okay... I see, well im hungry and in a mood, sooooo, could you just confess? (Yes or No)");
		in.nextLine();
		System.out.println("What? Was that a no??? Oh nah, you testing me huh");
		System.out.println("Imma read your alibi right now, your name is " +name+ " you're " +age+ " you were at the (a) " +place+ " at " +time+ " right? (Yes or No)");
		in.nextLine();
		System.out.println("Yup and you also had a " +item1+ " and a knife, probably a bomb too, to be honest, I don't really care");
		System.out.println("Soooo, let me finish your alibi real quick");
		System.out.println("You were at (the) " +place+ " when you pulled out the " +item1+ " and hit Elijah Bicol with it, this unfortunately knocked him out, did you do it for real or nah?");
		in.nextLine();
		System.out.println("DON'T CARE BRO, you're not getting a trial and you're getting sentenced 40 years for murder with a " +item1+ " do you protest against this?");
		in.nextLine();
		System.out.println("For like the third time, I don't really care, I also don't know how to do if, else statements, so there are no other endings");
		System.out.println("Well guys, hoped you liked this video");
		System.out.println(" if you can, please like and hit that bell notification");
		System.out.println("and if you're new to this channel, why not subscribe and as always");
		System.out.println("see you in the next one :)");
	}

}
