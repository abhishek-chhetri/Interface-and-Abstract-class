package Interface;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SMS implements Messaging {
    private Scanner scanner = new Scanner(System.in);

    public String getMessage() {
        System.out.print("Enter SMS message: ");
        return scanner.nextLine();
    }

    public String getRecipient() {
        System.out.print("Enter mobile number: ");
        String number = scanner.nextLine();
        if (Pattern.matches("\\d{10}", number)) {
            return number;
        } else {
            return "Invalid mobile number";
        }
    }

    public void print() {
        String recipient = getRecipient();
        if (recipient.equals("Invalid mobile number")) {
            System.out.println("Failed to send SMS: Invalid mobile number.");
            return;
        }
        String message = getMessage();
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
}
