package com;

import java.util.Scanner;

public class Tabung extends bangunDatar {

    public void Tabung(){
        double t, j, volum;
        double phi = 3.14;
        Scanner tabung = new Scanner(System.in);
        System.out.println("Tabung");
        System.out.println("===========");
        System.out.print("Masukkan Jari-Jari : ");
        j = tabung.nextDouble();
        System.out.print("Masukkan Tinggi : ");
        t = tabung.nextDouble();

        volum = (phi * j * j * t);
        System.out.println("Volume Tabung adalah : "+volum);
        tabung.close();
    }
}
