public class faktorBilangan20 {
    public static void main(String[] args) {
        //input
        int numA = 20, numC = 0;
        for (int y = 0; y <= numA; y++) {
            numC++;
            if (numA % numC == 0) {
                System.out.println(numC + " ");

            }
        }
    }
}
