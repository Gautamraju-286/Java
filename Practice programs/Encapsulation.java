class Student {
    private int age = 18;

    void show() {
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.show();
    }
}
