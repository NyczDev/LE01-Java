import java.util.Scanner;

public class Exercicio07 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = ler.nextInt();

        if (num >= 100 && num <= 200){
            System.out.println("O número está entre o intervalo de 100 e 200");
        }
        else {
            System.out.println("O número está fora do intervalo de 100 e 200");
        }
        ler.close();
    }
}