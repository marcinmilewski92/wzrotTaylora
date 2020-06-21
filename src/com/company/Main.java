package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    try {


        String sX = args[0];
        String sZ = args[1];
        double x = Double.parseDouble(sX);
        double z = Double.parseDouble(sZ);

        System.out.println("Podana wartość x: " + x + ", tolerancja błędu: " + z);

        /* Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj x: ");
         double x = scanner.nextDouble(); */

        double y = Math.sinh(x);

        System.out.println("Watość wyliczona bezpośrednio ze wzoru: " + y);

        System.out.println("Watrości przybliżone za pomocą szeregu Maclaurina: ");

        double funkcja = 0.0;

        for (int i = 0; true; i++) {

            funkcja += Math.pow(x, 2 * i + 1) / silnia(2 * i + 1);

            System.out.println(i + 1 + " iteracja: " + funkcja + ", Różnica: " + Math.abs(funkcja - y));

            if (Math.abs(y - funkcja) < z) {
                break;
            }
        }

    } catch(Exception e) {
        System.out.println("Błędne parametry");

    }

    }


    static double silnia(int k) {
        double iloczyn = 1.0;
        if (k == 0) {
            return 1.0;
        } else {
            for (int i = 1; i <= k; i++) {
                iloczyn *= i;

            }
            return iloczyn;
        }
    }

}