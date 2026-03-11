package lista01_exercicio10;

import java.util.Locale;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de meia-entrada: ");
        int qtdMeia = sc.nextInt();

        System.out.print("Quantidade de inteira: ");
        int qtdInteira = sc.nextInt();

        sc.nextLine();

        System.out.print("preço de cada meia-entrada: ");
        String meiaStr = sc.nextLine();

        System.out.print("preço de cada inteira: ");
        String inteiraStr = sc.nextLine();

        Locale localeMeia = Locale.US;
        Locale localeInteira = Locale.US;

        for (int i = 0; i < meiaStr.length(); i++) {
            if (meiaStr.charAt(i) == ',') {
                localeMeia = new Locale("pt");
            }
        }

        for (int i = 0; i < inteiraStr.length(); i++) {
            if (inteiraStr.charAt(i) == ',') {
                localeInteira = new Locale("pt");
            }
        }

        Scanner scMeia = new Scanner(meiaStr);
        scMeia.useLocale(localeMeia);
        double valorMeia = scMeia.nextDouble();

        Scanner scInteira = new Scanner(inteiraStr);
        scInteira.useLocale(localeInteira);
        double valorInteira = scInteira.nextDouble();

        double total = (qtdMeia * valorMeia) + (qtdInteira * valorInteira);

        System.out.println("Total arrecadado: R$ " + total);

        sc.close();
    }
}
