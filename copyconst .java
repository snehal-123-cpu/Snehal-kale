class Student {
    int id;
    String name;

    // Parameterized constructor
    Student(int i, String n) {
        id = i;
        name = n;
    }

    // Copy constructor
    Student(Student s) {
        id = s.id;
        name = s.name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Sarthak");
        Student s2 = new Student(s1);           

        System.out.println("Original Student:");
        s1.display();

        System.out.println("Copied Student:");
        s2.display();
    }
}
