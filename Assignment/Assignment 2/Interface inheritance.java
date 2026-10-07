interface Animal {
    void eat();
}

interface Dog extends Animal {
    void bark();
}

class Test implements Dog {
    public void eat() {
        System.out.println("Dog eats");
    }

    public void bark() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.eat();
        t.bark();
    }
}
