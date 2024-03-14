import java.util.Scanner;

public class Exercicio08 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = ler.nextInt();

        if (num >= 50) {
            System.out.println("O número é maior ou igual a 50");
        } else {
            System.out.println("O número é menor que 50");
        }
        ler.close();
    }

}