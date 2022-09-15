package com;

import java.util.Scanner;

public class Balok extends bangunDatar {

    public void Balok() {
        double p, l, t, volum;
        Scanner balok = new Scanner(System.in);
        System.out.println("Segitiga");
        System.out.println("===========");
        System.out.print("Masukkan Panjang : ");
        p = balok.nextDouble();
        System.out.print("Masukkan Lebar : ");
        l = balok.nextDouble();
        System.out.print("Masukkan Tinggi : ");
        t = balok.nextDouble();

        volum = (p * l * t);
        System.out.println("Volume Balok adalah : "+volum);
        balok.close();
    }
}