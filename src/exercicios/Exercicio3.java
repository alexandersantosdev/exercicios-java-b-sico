package exercicios;
/*
Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos 
números 4, 5 e 6. A soma das duas médias. A média das médias.

*/
public class Exercicio3 {
    
    public static void main(String[] args) {

        float media1, media2, soma, mediaDasMedias;

        media1 = (8 + 9 + 7) / 3;
        media2 = (4 + 5 + 6) / 3;
        soma = media1 + media2;
        mediaDasMedias = soma / 2;

        System.out.println("Média 1: " + media1);
        System.out.println("Média 2: " + media2);
        System.out.println("Soma das médias: " + soma);
        System.out.println("Média das médias: " + mediaDasMedias);
    }
}
