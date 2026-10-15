import java.util.Scanner;

// User-defined exception
class LengthNotSufficientException extends Exception {

    public LengthNotSufficientException(String message) {
        super(message);
    }
}

public class StudentIDValidation {

    static void validateStudentID(String id)
            throws LengthNotSufficientException {

        try {
            // Check digits only
            for (int i = 0; i < id.length(); i++) {
                if (!Character.isDigit(id.charAt(i))) {
                    throw new NumberFormatException();
                }
            }

            // Check if length is greater than 5
            if (id.length() > 5) {
                int[] arr = new int[5];

                for (int i = 0; i < id.length(); i++) {
                    arr[i] = Character.getNumericValue(id.charAt(i));
                }
            }

            // Check if length is less than 5
            if (id.length() < 5) {
                throw new LengthNotSufficientException(
                    "Invalid Student ID - LengthNotSufficientException"
                );
            }

            System.out.println("Valid Student ID");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                "Invalid Student ID - ArrayIndexOutOfBoundsException"
            );

        } catch (NumberFormatException e) {
            System.out.println(
                "Invalid Student ID - NumberFormatException"
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();

        try {
            validateStudentID(id);
        } catch (LengthNotSufficientException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
            System.out.println("Validation completed.");
        }
    }
}
