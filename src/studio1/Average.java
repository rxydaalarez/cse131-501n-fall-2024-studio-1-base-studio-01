package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter one number to be averaged.");
		int x = in.nextInt();
		System.out.println("Please enter another number to average with the first.");
		int y = in.nextInt();
		System.out.print("The average of " + x + " and " + y + " is " + (5 + 6)/2.0);
	}

}
