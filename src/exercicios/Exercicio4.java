package exercicios;

// Informar um saldo e imprimir o saldo com reajuste de 1%

public class Exercicio4 {
    public static void main(String[] args) {
        
        float saldo = 1000.0f;
        float saldoComReajusteDe1PorCento = saldo + saldo * 0.01f;

        System.out.println("Saldo: " + saldo);
        System.out.println("Saldo com reajuste: " + saldoComReajusteDe1PorCento);
    }
}
