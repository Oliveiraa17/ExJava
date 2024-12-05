package exerciciosjava;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / (2 + 3 + 5);

        System.out.printf("Média ponderada: %.2f%n", media);
    }
}
