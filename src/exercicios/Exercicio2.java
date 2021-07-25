package exercicios;

import java.util.Scanner;

/*
Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e 
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30. 
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.

*/

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int anos, meses, dias, totalDias;

        System.out.println("Informe a quantidade de anos, meses e dias separados por espaço: ");
        
        anos = ler.nextInt();
        meses = ler.nextInt();
        dias = ler.nextInt();

        totalDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("O total de dias é: " + totalDias);

        ler.close();
    }
}
