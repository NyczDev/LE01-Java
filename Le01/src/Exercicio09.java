import java.util.Scanner;

public class Exercicio09 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o número A");
        double numA = ler.nextDouble();
        System.out.println("Digite o número B");
        double numB = ler.nextDouble();

        if (numA == numB) {
            System.out.println("Os dois números são iguais");
        } else {
            System.out.println("Os dois números são diferentes");
        }
        ler.close();
    }
}