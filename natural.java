public class natural {
    public static void main(String[] args) {
        int num=10;
        int i=1;
        int sum=0;
     do { 
        sum+=i;
        i++; 
     }
     while(i<=num);
    
   System.out.println("sum of natural numbers from 1 to" +num+"is:"+sum);
}
}