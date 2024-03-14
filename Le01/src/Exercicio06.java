import java.util.Scanner;

public class Exercicio06 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius:");
        double celsius = sc.nextDouble();

        double fahrenheit = (9 * celsius + 160) / 5;

        System.out.printf("A temperatura em graus Fahrenheit é: %.2f\n", fahrenheit);

        sc.close();
    }
}