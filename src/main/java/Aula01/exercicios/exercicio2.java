package Aula01.exercicios;

public class exercicio2 {
    public static void main(String[] args) {
        var quantIntTicket =  8;
        var priceInt = 30.00;

        var quantHalfTicket = 5;
        var priceHalf = 15.00;

        var totalInt = quantIntTicket * priceInt;
        var totalHalf = quantHalfTicket * priceHalf;

        var total = totalInt + totalHalf;

        var media = total / 13.00;

        System.out.println("total arrecadado com infressos inteiros: " + totalInt);
        System.out.println("total arrecadado com meia-entrada: " + totalHalf);
        System.out.println("Total na sessao: " + total);
        System.out.println("Media final: " + media);

    }
}
