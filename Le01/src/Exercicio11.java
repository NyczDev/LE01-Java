import java.util.Scanner;

public class Exercicio11 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int num1 = ler.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = ler.nextInt();
        System.out.println("Digite o terceiro número");
        int num3 = ler.nextInt();

        if (num1 > num2) {
            int maior = num1;
            num1 = num2;
            num2 = maior;
        }
        if (num1 > num3) {
            int maior = num1;
            num1 = num3;
            num3 = maior;
        }
        if (num2 > num3) {
            int maior = num2;
            num2 = num3;
            num3 = maior;
        }
        System.out.println("Ordem crescente dos números");
        Prompt.separador();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        ler.close();
    }
}