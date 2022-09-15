public class faktorBilangan6 {
    public static void main(String[] args) {

        //input
        int numA = 6, numC = 0;
        for (int y = 0; y <= numA; y++) {
            numC++;
            if (numA % numC == 0) {
                System.out.println(numC + " ");

            }
        }
    }
}
