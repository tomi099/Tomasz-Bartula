package com.generics;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

<<<<<<< HEAD
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
=======

        int z = 0;
        for (z < 10, z++;){
            System.out.print("*");
        }
>>>>>>> master
        System.out.print("To jest jakis tekst ");

    }
}
