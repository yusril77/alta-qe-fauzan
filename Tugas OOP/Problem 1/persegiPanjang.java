package com.bangunDatar;

import java.util.Scanner;
public class persegiPanjang extends bangunDatar{
    public void persegipanjang() {
        double P, L, luas , kel;
        Scanner PP = new Scanner(System.in);
        System.out.println("Persegi Panjang");
        System.out.println("=================");
        System.out.print("Masukan Panjang : ");
        P = PP.nextDouble();
        System.out.print("Masukan Luas : ");
        L = PP.nextDouble();

        luas = P * L;
        kel = 2*(P + L);
        System.out.println("Luas Persegi Panjang adalah : "+luas+" cm");
        System.out.println("Keliling Persegi Panjang adalah : "+kel+" cm" );
        PP.close();
    }
}
