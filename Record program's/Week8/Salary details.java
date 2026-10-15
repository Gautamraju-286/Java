interface MarksDetails {
    void calculateMarks();
}

class Student implements MarksDetails {

    int maths = 80;
    int science = 75;
    int english = 85;

    public void calculateMarks() {

        int total = maths + science + english;
        double average = total / 3.0;

        System.out.println("Maths Marks = " + maths);
        System.out.println("Science Marks = " + science);
        System.out.println("English Marks = " + english);
        System.out.println("Total Marks = " + total);
        System.out.println("Average = " + average);
    }
}

public class StudentMarks {
    public static void main(String[] args) {

        Student s = new Student();
        s.calculateMarks();
    }
}
