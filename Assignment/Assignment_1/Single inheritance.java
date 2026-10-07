class A {
    void show() {
        System.out.println("Parent Class");
    }
}

class B extends A {
    void display() {
        System.out.println("Child Class");
    }
}

class Single {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.display();
    }
}
