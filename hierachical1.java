public class hierachical1{
     public static void main(String[] args) {
        Shape s1=new Shape();
        Triangle t1=new Triangle();
        Equilatortriaingle e1=new Equilatortriaingle();
        s1.area();
        t1.area();
        e1.area();
       
    }
}


class Shape {
    public void area() {
        System.out.println("display area");
    }
}

class Triangle extends Shape {
    public void area() {
        System.out.println("display area.");
    }
}

class Equilatortriaingle extends Triangle {
    public void area() {
        System.out.println("display area.");
    }
}

