import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {

    public static void main(String[] args) {

        String text =
            "The theory of programming is useful\n" +
            "There are many things to learn\n" +
            "The teacher explains the concepts\n" +
            "Practice helps improve programming skills.";

        try {
            // Writing data into the file
            FileWriter writer = new FileWriter("sample.txt");
            writer.write(text);
            writer.close();

            // Reading data from the file
            FileReader reader = new FileReader("sample.txt");

            String content = "";
            int ch;

            while ((ch = reader.read()) != -1) {
                content += (char) ch;
            }

            reader.close();

            // Convert to lowercase
            content = content.toLowerCase();

            int thCount = 0;
            int heCount = 0;

            // Count "th" and "he"
            for (int i = 0; i < content.length() - 1; i++) {

                if (content.substring(i, i + 2).equals("th")) {
                    thCount++;
                }

                if (content.substring(i, i + 2).equals("he")) {
                    heCount++;
                }
            }

            System.out.println("'th' - no of occurrences - " + thCount);
            System.out.println("'he' - no of occurrences - " + heCount);

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
