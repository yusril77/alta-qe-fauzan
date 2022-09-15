package com;

import java.util.Scanner;

public class Kubus extends bangunDatar{
    public void Kubus() {
        double r, volum;
        Scanner kubus = new Scanner(System.in);
        System.out.println("Kubus");
        System.out.println("===========");
        System.out.print("Masukkan Sisi : ");
        r = kubus.nextDouble();

        volum = (r * r * r);
        System.out.println("Volume Kubus adalah : "+volum);
        kubus.close();

    }
}