import java.util.Scanner;

public class Exercicio10 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 5");
        int num = ler.nextInt();
        
        if (num > 5 || num < 1)
        {
            System.out.println("Número inválido!");
        }
        else {
            System.out.println("Correto!!");
        }
        ler.close();
    }
}