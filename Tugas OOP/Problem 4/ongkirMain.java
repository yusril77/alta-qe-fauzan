import java.util.Scanner;

public class ongkirMain {
    public static void main(String[] args) {
        int angka;
        ongkir K = new ongkir();

        Scanner input = new Scanner(System.in);
        System.out.print("Menu = ");
        angka = input.nextInt();

        switch (angka) {
            case 1:
                K.ongkir();
                break;
        }
    }
}
