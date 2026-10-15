class Student {
    String name;
    int id;
    String course;
    double fee;
    String result;

    // Default constructor
    Student() {
        name = "Unknown";
        id = 0;
        course = "Not Assigned";
        fee = 0;
        result = "Pending";
    }

    // Constructor with 2 parameters
    Student(String name, int id) {
        this.name = name;
        this.id = id;
        course = "Java";
        fee = 10000;
        result = "Pass";
    }

    // Constructor with 5 parameters
    Student(String name, int id, String course,
            double fee, String result) {
        this.name = name;
        this.id = id;
        this.course = course;
        this.fee = fee;
        this.result = result;
    }

    // Display method
    void display() {
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Course : " + course);
        System.out.println("Fee    : " + fee);
        System.out.println("Result : " + result);
        System.out.println();
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = new Student("Rahul", 101);

        Student s3 = new Student(
            "Anil", 102, "Python", 15000, "Pass"
        );

        s1.display();
        s2.display();
        s3.display();
    }
}
