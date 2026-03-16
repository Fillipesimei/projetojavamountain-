// Nome: Fillipe Símei Souza Ribeiro
// Matrícula: 1261940446

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual: ");
        double salario = scanner.nextDouble();

        double novoSalario = salario * 1.07;

        System.out.printf("Salário original: R$ %.2f%n", salario);
        System.out.printf("Novo salário: R$ %.2f%n", novoSalario);

        scanner.close();
    }
}
