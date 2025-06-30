public class inheritance {
    public static void main(String[] args) {
        child c1=new child();
        c1.Show();
        c1.display();
        
    }
}
class Parent{
    void Show(){
        System.out.println("This is inheritance");
    }
}
class child extends Parent{
    void display(){

    
    System.out.println("Say hiii to child: ");
    }
    

}
