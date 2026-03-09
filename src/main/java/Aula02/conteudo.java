package Aula02;

import java.util.Scanner;

public class conteudo {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("entre com sua idade: ");
        int idade = teclado.nextInt();

        System.out.println("entre com a sua altura:");
        double altura = teclado.nextDouble();

        teclado.nextLine();

        System.out.println("Entre com o seu nome:");
        String nome = teclado.nextLine();

        System.out.printf("%d, %.2f, %s, \n", idade, altura, nome);

    }
}
