// Nome: Fillipe Símei Souza Ribeiro
// Matrícula: 1261940446

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double COTACAO = 5.25;

        System.out.print("Digite o valor em dólar: ");
        double valorDolar = scanner.nextDouble();

        double valorReal = valorDolar * COTACAO;

        System.out.printf("Valor convertido: R$ %.2f%n", valorReal);

        scanner.close();
    }
}
