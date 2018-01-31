import java.util.Scanner;
public class LengthAndCharacter {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter any string");
		String input = keyboard.next();
		System.out.println("The length of the String is " + input.length());
		System.out.println("The first character of the String is " + input.charAt(0));
	}
}

