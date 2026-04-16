package util;

import java.util.Scanner;

public class Input {
	public static final Scanner scanner = new Scanner(System.in);
	
	public static String get() {
		return scanner.nextLine();
	}
}