package exercicios;

import java.util.Scanner;

/**
 * 
 * Escrever um algoritmo que lê: - a porcentagem do IPI a ser acrescido no valor
 * das peças - o código da peça 1, valor unitário da peça 1, quantidade de peças
 * 1 - o código da peça 2, valor unitário da peça 2, quantidade de peças 2 O
 * algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
 * Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
 */
public class Exercicio5 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        float valorDaPeca1, valorDaPeca2, valorOriginal, valorTotal, porcentagemDeIPI;
        int codigoDaPeca1, qtdPecas1;
        int codigoDaPeca2, qtdPecas2;

        System.out.println("Informe o código da peça 1: ");
        codigoDaPeca1 = ler.nextInt();

        System.out.println("Informe o valor da peça 1: ");
        valorDaPeca1 = ler.nextFloat();

        System.out.println("Informe o quantidade de peça(s) 1: ");
        qtdPecas1 = ler.nextInt();

        System.out.println("Informe o código da peça 2: ");
        codigoDaPeca2 = ler.nextInt();

        System.out.println("Informe o valor da peça 2: ");
        valorDaPeca2 = ler.nextFloat();

        System.out.println("Informe o quantidade de peça(s) 2: ");
        qtdPecas2 = ler.nextInt();

        System.out.println("Informe a porcentagem de IPI: ");
        porcentagemDeIPI = ler.nextFloat();

        valorOriginal = (valorDaPeca1 * qtdPecas1 + valorDaPeca2 * qtdPecas2);
        valorTotal = (valorDaPeca1 * qtdPecas1 + valorDaPeca2 * qtdPecas2) * (porcentagemDeIPI / 100 + 1);

        System.out.println("########################");
        System.out.println("#### AUTO PEÇAS JAVA ###");
        System.out.println("########################");
        System.out.println("Peça 1 código:  " + codigoDaPeca1);
        System.out.println("QTD: " + qtdPecas1);
        System.out.println("Valor da peça: " + valorDaPeca1);
        System.out.println("Valor total R$ " + qtdPecas1 * valorDaPeca1);
        System.out.println("#########################");
        System.out.println("Peça 2 código:  " + codigoDaPeca2);
        System.out.println("QTD: " + qtdPecas2);
        System.out.println("Valor da peça: " + valorDaPeca2);
        System.out.println("Valor total R$ " + qtdPecas2 * valorDaPeca2);
        System.out.println("#########################");
        System.out.println("Valor total original R%" + valorOriginal);
        System.out.println("#########################");
        System.out.printf("Valor total a pagar com IPI R$%.2f", valorTotal);
        System.out.println("#########################");

        ler.close();
    }
}
