import java.util.Scanner;

public class Exercicio05 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da variável A:");
        int num1 = sc.nextInt();
        System.out.println("Digite o valor da variável B:");
        int num2 = sc.nextInt();

        System.out.println("Valores originais: A = " + num1 + " e B = " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Valores trocados: A = " + num1 + " e B = " + num2);

        sc.close();
    }
}
