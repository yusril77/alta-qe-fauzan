package com.bangunDatar;

import java.util.Scanner;
public class persegi extends bangunDatar{
    public void persegi(){
        double S, luas, kel;
        Scanner perseg = new Scanner(System.in);
        System.out.println("Persegi");
        System.out.println("===========");
        System.out.print("Masukkan Sisi : ");
        S = perseg.nextDouble();

        luas = (4 * S);
        kel = (S * S);
        System.out.println("Luas Persegi adalah : "+luas+" cm");
        System.out.println("Keliling Persegi adalah : "+kel+" cm");
        perseg.close();
    }
}

