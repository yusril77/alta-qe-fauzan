public class DrawXYZ {
    private static void DrawXYZ(int n){
        int a = n;
        int b = a * a;
        int i;
        //y = ganji, z = genap, x = kelipatan 3
        for( i = 1 ; i <= b; i++ ){
            if (i%3==0){
                //if i = kelipatan 3
                System.out.print(" X ");
                if(i%a==0){System.out.println(" ");}
            }else if (i%2==0){
                //if i = genap
                System.out.print(" Z ");
                if(i%a==0){System.out.println("");}
            }else{
                //if i = ganjil
                System.out.print(" Y ");
                if(i%a==0){System.out.println("");}
            }

        }
        System.out.println("");
    }

    public static void main(String args[]) {

        DrawXYZ(5);

    }
}
