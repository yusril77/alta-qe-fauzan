package com.kalkulator;

public class main {
        static String Tambah = "+";
        static String Kurang = "-";

    public static void Display(int x, int y, String operator, int z) {
        System.out.println(x + " "+ operator + " "+ y + " = " +z);

    }

    public static void tambah(int x, int y) {
        Display(x, y, Tambah, x+y);

    }

    public static void kurang(int x, int y) {
        Display(x, y, Kurang, x-y);
    }

}
