class ConstructorOverloading {
    String name;
    int age;

    ConstructorOverloading() {
        name = "Unknown";
        age = 0;
    }
    ConstructorOverloading(String n, int a) {
        name = n;
        age = a;
    }
    void display() {
        System.out.println(name + " " + age);
    }
    public static void main(String[] args) {
        ConstructorOverloading s1 = new ConstructorOverloading();
        ConstructorOverloading s2 = new ConstructorOverloading("Rahul", 21);
        s1.display();
        s2.display();
    }
}