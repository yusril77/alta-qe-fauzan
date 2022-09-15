package com.bangunDatar;

import java.util.*;

public class bangunDatar {
    public static void main(String[] args) {
        int angka;
        persegiPanjang P = new persegiPanjang();
        segitiga S = new segitiga();
        persegi P2 = new persegi();
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("======");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga");
        System.out.println("3. Persegi");
        System.out.print("Pilihan : ");
        angka = input.nextInt();

        switch(angka)  {
            case 1 : P.persegipanjang();
            break;
            case 2 : S.segitiga();
            break;
            case 3 : P2.persegi();
            break;
        }
        input.close();
    }
}
