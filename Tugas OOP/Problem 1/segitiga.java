package com.bangunDatar;

import java.util.Scanner;
public class segitiga extends bangunDatar{
    public void segitiga(){
        double A, T, S, luas, kel;
        Scanner segi3 = new Scanner(System.in);
        System.out.println("Segitiga");
        System.out.println("===========");
        System.out.print("Masukkan Alas : ");
        A = segi3.nextDouble();
        System.out.print("Masukkan Tinggi : ");
        T = segi3.nextDouble();
        System.out.print("Masukkan Sisi : ");
        S = segi3.nextDouble();

        luas = (A * T)/2;
        kel = (S + S + S);
        System.out.println("Luas Segitiga adalah : "+luas+" cm");
        System.out.println("Keliling Segitiga adalah : "+kel+" cm");
        segi3.close();
    }
}
