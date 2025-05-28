package Interface;
import java.util.Scanner;
public class Email implements Messaging {
    private Scanner scanner = new Scanner(System.in);

    public String getMessage() {
        System.out.print("Enter Email message: ");
        return scanner.nextLine();
    }

    public String getRecipient() {
        System.out.print("Enter email address: ");
        return scanner.nextLine();
    }

    public void print() {
        String recipient = getRecipient();
        String message = getMessage();
        System.out.println("Sending Email to " + recipient + ": " + message);
    }
}
