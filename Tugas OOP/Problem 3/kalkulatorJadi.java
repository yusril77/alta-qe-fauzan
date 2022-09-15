package com.kalkulator;

import java.util.Scanner;

import static com.kalkulator.child.*;
import static com.kalkulator.main.*;

public class kalkulatorJadi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        String op;

        System.out.println("Angka Pertama");
        a = sc.nextInt();

        System.out.println("Angka Kedua");
        b = sc.nextInt();

        sc.nextLine();

        System.out.println("Masukkan Operator .. + - * /");
        op = sc.nextLine();

        if(op.equals(Tambah)) {
            tambah(a,b);
        }

        if(op.equals(Kurang)) {
            kurang(a,b);
        }

        if(op.equals(Kali)) {
            kali(a,b);
        }

        if(op.equals(Bagi)) {
            bagi(a,b);
        }
    }
}
