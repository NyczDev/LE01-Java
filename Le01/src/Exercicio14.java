import java.util.Scanner;

public class Exercicio14 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro termo da PA (a1):");
        double a1 = sc.nextDouble();

        System.out.println("Digite a razão da PA (r):");
        double r = sc.nextDouble();

        System.out.println("Digite o termo desejado (n):");
        int n = sc.nextInt();

        double an = a1 + (n - 1) * r;

        System.out.printf("O termo %d da PA é: %.2f\n", n, an);

        sc.close();
    }
}