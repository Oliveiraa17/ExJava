package exerciciosjava;
import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base do triângulo: ");
        double base = sc.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        double altura = sc.nextDouble();

        double area = (base * altura) / 2;

        System.out.printf("Área do triângulo: %.2f%n", area);
    }
}
