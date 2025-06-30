public class student1 {
    public static void main(String[] args) {
        Student s1 = new Student("Rohit", 79);  
        s1.display();
           }
}
class Student { 
    String name;
    int age;
 
    Student(String name, int age) {
        System.out.println("constructor has been called");
        this.name = name;
        this.age = age;
    }
 public void display(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}


















