public class oop {
    public static void main(String[] args) {
        pen pen1=new pen();
        pen1.color="blue";
        pen1.type="ball";
        System.out.println(pen1.color);
        System.out.println(pen1.type);
        pen1.write();
    }
}
    class pen{
        String color;
        String type;

         public void write(){
            System.out.println("writing something");
         }
    }

