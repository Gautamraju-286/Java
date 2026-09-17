class A {
    void show() {
        System.out.println("A");
    }
}

class B extends A {
}

class C extends B {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}
