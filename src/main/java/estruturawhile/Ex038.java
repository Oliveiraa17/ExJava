package estruturawhile;

public class Ex038 {
    public static void main(String[] args) {


        int cont = 1;

        while (cont <= 50) {
            if (cont % 2 == 0) {
                System.out.println(cont);
            }
            cont++;
        }
    }
}
