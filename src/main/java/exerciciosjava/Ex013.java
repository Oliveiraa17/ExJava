package exerciciosjava;
import java.util.Scanner;


public class Ex013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int num = sc.nextInt();
        System.out.print("Digite outro numero inteiro: ");
        int num2 = sc.nextInt();

        if (num % num2 == 0) {
            System.out.println("E MULTIPLO");

        }else {
            System.out.println("NÃO MULTIPLO");
        }
    }
}
