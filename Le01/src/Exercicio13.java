import java.util.Scanner;

public class Exercicio13 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor real:");
        double num1 = sc.nextDouble();

        System.out.println("Digite o segundo valor real:");
        double num2 = sc.nextDouble();

        System.out.println("Digite o operador aritmético (+, -, *, /):");
        char operador = sc.next().charAt(0);

        double result = 0;

        switch (operador) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero.");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Erro: Operador não definido.");
                return;
        }

        System.out.printf("%.2f %c %.2f = %.2f\n", num1, operador, num2, result);
    }
}