import java.util.Scanner;

public class Exercicio17 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno:");
        double nota1 = sc.nextDouble();
        System.out.println("Digite o peso da primeira nota do aluno:");
        double peso1 = sc.nextDouble();

        System.out.println("Digite a segunda nota do aluno:");
        double nota2 = sc.nextDouble();
        System.out.println("Digite o peso da segunda nota do aluno:");
        double peso2 = sc.nextDouble();

        System.out.println("Digite a terceira nota do aluno:");
        double nota3 = sc.nextDouble();
        System.out.println("Digite o peso da terceira nota do aluno:");
        double peso3 = sc.nextDouble();

        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        System.out.printf("A média ponderada das notas %.2f, %.2f e %.2f com pesos %.2f, %.2f e %.2f é: %.2f\n", nota1,
                nota2, nota3, peso1, peso2, peso3, mediaPonderada);

        sc.close();
    }
}