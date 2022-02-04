import java.util.Scanner;

public class Main {

	public static void rejectMessage(String number) {
		// Prevent SMS data write
		System.out.println("Rejected - " + number);
	}

	public static void acceptMessage(String number) {
		// Accept SMS data write
		System.out.println("Accepted - " + number);
	}

	public static void main(String[] args) {
		// Feed number data from incoming SMS request
		Scanner numberInput = new Scanner(System.in);
		System.out.println("Enter a number: ");
		String number = numberInput.nextLine();
		// Validate number
		if (number.length() != 5 || number.length() != 6) {
			rejectMessage(number);
		} else {
			acceptMessage(number);
		}
	}
}
