package br.com.stackqueue;

import java.util.Scanner;

public class Main {
    public static void main(String[] a) {
        Scanner in = new Scanner(System.in);
        Dados dados = new Dados();

        int opt = 1;

        while (opt != 0) {
            System.out.print("" +
                    "[1] Stack\n" +
                    "[2] Queue\n" +
                    "[0] Exit\n\n" +
                    "SET > ");
            
            opt = in.nextInt();

            if (opt != 0) {
                dados.cli(opt);
            }
        }
    }
}
