import java.util.Scanner;

public class Exercicio17 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota e peso 1, do aluno:");
        double nota1 = sc.nextDouble();
        double peso1 = sc.nextDouble();

        System.out.println("Digite a nota e peso 2, do aluno:");
        double nota2 = sc.nextDouble();
        double peso2 = sc.nextDouble();

        System.out.println("Digite a nota e peso 3, do aluno:");
        double nota3 = sc.nextDouble();
        double peso3 = sc.nextDouble();

        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        System.out.printf("A média ponderada das notas %.2f, %.2f e %.2f com pesos %.2f, %.2f e %.2f é: %.2f\n", nota1,
                nota2, nota3, peso1, peso2, peso3, mediaPonderada);

        sc.close();
    }
}