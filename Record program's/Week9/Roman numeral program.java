import java.util.Scanner;

class RomanNumeral {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1-3999): ");
        int num = sc.nextInt();

        int[] values = {1000, 900, 500, 400, 100, 90,
                        50, 40, 10, 9, 5, 4, 1};

        String[] symbols = {"M", "CM", "D", "CD", "C", "XC",
                            "L", "XL", "X", "IX", "V", "IV", "I"};

        if (num < 1 || num > 3999) {
            System.out.println("Invalid number");
        } else {
            System.out.print("Roman Numeral: ");

            for (int i = 0; i < values.length; i++) {
                while (num >= values[i]) {
                    System.out.print(symbols[i]);
                    num -= values[i];
                }
            }
        }

        sc.close();
    }
}
