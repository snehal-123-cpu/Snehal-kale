public class student3 {
    public static void main(String[] args) {
        Student s1 = new Student("snehal", 20);  
        s1.display();

        Student s2 = new Student(s1);  
        s2.display();
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        System.out.println("Parameterized ");
        this.name = name;
        this.age = age;
    }

    Student(Student s2) {
        System.out.println("Copy constructor");
        this.name = s2.name;
        this.age = s2.age;
    }

    public void display() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
   
















