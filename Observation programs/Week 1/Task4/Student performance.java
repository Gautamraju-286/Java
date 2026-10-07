import java.util.Scanner;

class Performance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 90)
            System.out.println("Performance: Excellent");
        else if (marks >= 75)
            System.out.println("Performance: Very Good");
        else if (marks >= 60)
            System.out.println("Performance: Good");
        else if (marks >= 40)
            System.out.println("Performance: Average");
        else
            System.out.println("Performance: Poor");
    }
}
