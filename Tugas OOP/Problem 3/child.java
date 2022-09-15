package com.kalkulator;

public class child extends main {
    static String Kali = "x";
    static String Bagi = "/";

    public static void kali(int x, int y) {
        Display(x, y, Kali, x*y);
    }

    public static void bagi(int x, int y) {
        Display(x, y, Bagi, x/y);
    }
}
