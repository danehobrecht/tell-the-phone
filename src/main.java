import java.util.Scanner;

public class Main {

	public static void rejectWrite(String number) {
		// Reject SMS
		System.out.println("rejectWrite(" + number + ")");
	}

	public static void permitWrite(String number) {
		// Permit SMS
		System.out.println("permitWrite(" + number + ")");
	}

	public static void main(String[] args) {
		// Feed number data from incoming SMS request
		Scanner numberInput = new Scanner(System.in);
		System.out.print("Enter a number: ");
		String number = numberInput.nextLine();
		// Validate number
		if (number.length() < 5 || number.length() > 6) {
			rejectWrite(number);
		} else {
			permitWrite(number);
		}
	}
}
