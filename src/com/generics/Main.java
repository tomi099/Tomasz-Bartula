package com.generics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        odejmowanie();
    }

    static void odejmowanie(){
        Scanner scanner = new Scanner(System.in);
        int v,b,n;

        System.out.print("Wprowadz pierwsza liczbe: ");
        v = scanner.nextInt();
        System.out.print("Wprowadz druga liczbe: ");
        b = scanner.nextInt();

        n = v-b;
        System.out.print("Wynik odejmowania to: " + n);

    }
}
