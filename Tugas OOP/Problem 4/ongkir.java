import java.util.Scanner;
public class ongkir extends ongkirMain{

    public void ongkir() {
        double p, l, t, volum, berat;
        Scanner ongkir = new Scanner(System.in);
        System.out.println("Input");
        System.out.println("===========");
        System.out.print("Masukkan Panjang : ");
        p = ongkir.nextDouble();
        System.out.print("Masukkan Lebar : ");
        l = ongkir.nextDouble();
        System.out.print("Masukkan Tinggi : ");
        t = ongkir.nextDouble();

        volum = (p * l * t);
        System.out.print("Masukkan Berat = ");

        berat = ongkir.nextDouble();
        if (berat <= 1 && volum <= 50) {
            System.out.println("Harga = Rp.5000");
        }
        else {
            System.out.println("Harga = RP.10000");
        }
        ongkir.close();
    }
}
