public class reverse {
    public static void main(String[] args) {
        String org= "hello";

        StringBuilder sb = new StringBuilder("hello");
        String reversed = sb.reverse().toString();
        System.out.println("reversed string: " + reversed);
    }
}


