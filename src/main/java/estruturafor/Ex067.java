package estruturafor;

public class Ex067 {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma += i; // Adiciona o valor de i à soma
        }

        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}

