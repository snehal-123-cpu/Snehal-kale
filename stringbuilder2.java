public class stringbuilder2 {
    public static void main(String[] args) {
        StringBuilder Sb = new StringBuilder("Snehal");
        System.out.println(Sb);
        System.out.println(Sb.charAt(1));

         Sb.setCharAt(2,'e');
        System.out.println(Sb);

           Sb.insert(0,'s');
           System.out.println(Sb);

            Sb.delete(1,3);
           System.out.println(Sb);
    }

}


