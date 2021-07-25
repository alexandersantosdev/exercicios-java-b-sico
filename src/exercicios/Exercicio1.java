package exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero1, numero2, soma;

        numero1 = ler.nextInt();
        numero2 = ler.nextInt();
        soma = numero1 + numero2;

        System.out.println("A soma é: " + soma);

        ler.close();
    }
}
