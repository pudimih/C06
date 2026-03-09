package Aula02.exercicios;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("entre com a quantidade de lanche na hora 1:");
        int hora1 = teclado.nextInt();
        System.out.println("entre com a quantidade de lanche na hora 2:");
        int hora2 = teclado.nextInt();
        System.out.println("entre com a quantidade de lanche na hora 3:");
        int hora3 = teclado.nextInt();

        double answ = (hora1 + hora2 + hora3) / 3.00;
        System.out.println("a media dos lanches consumidos é " + answ);

    }
}
