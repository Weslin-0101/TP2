package utils;

import java.util.Scanner;

@SuppressWarnings("resource")
//metodo criado para o scanner não ficar bugado por conta do buffer
public class Sc {

    private Sc() {
    }

    //utilizando no scanner de inteiro
    public static int nextInt() {
        var scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    //utilizando no scanner de string
    public static String nextLine() {
        var scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    //utilizando no scanner de double
    public static double nextDouble() {
        var scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
