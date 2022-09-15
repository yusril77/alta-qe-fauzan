package com;

import java.util.Scanner;

public class bangunDatar {
    public static void main(String[] args) {

        int angka;
        Kubus K = new Kubus();
        Balok B = new Balok();
        Tabung T = new Tabung();
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("======");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");
        System.out.print("Pilihan : ");
        angka = input.nextInt();

        switch (angka) {
            case 1:
                K.Kubus();
                break;
            case 2:
                B.Balok();
                break;
            case 3:
                T.Tabung();
                break;
        }
        input.close();
    }
}