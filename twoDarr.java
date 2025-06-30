public class twoDarr{
    public static void main(String[] args) {

        int[] oneD = { 10, 15, 20, 25,30};
        System.out.println("1D Arr:");
        for (int i = 0; i < oneD.length; i++) {
            System.out.println("Index " + i + ": " + oneD[i]);
        }
 
        int[][] twoD= {
            {10, 20},{30, 40},{50, 60}
        };
        System.out.println("\n2D Arr:");
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}








