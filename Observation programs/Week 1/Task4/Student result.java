import java.util.Scanner;

class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks in 3 subjects: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int total = a + b + c;
        double avg = total / 3.0;

        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);

        if (avg >= 40)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");
    }
}
