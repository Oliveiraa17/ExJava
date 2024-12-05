package exerciciosjava;
import java.util.Scanner;

public class Ex017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 16 && idade <= 24) {
            System.out.println("Adolescente");
        }else if (idade < 16) {
            System.out.println("ciança");
        }else if (idade <= 49) {
            System.out.println("adulto");
        } else {
            System.out.println("idoso");
        }
    }
}