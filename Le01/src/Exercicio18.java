import java.util.Scanner;

public class Exercicio18 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno:");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota do aluno:");
        double nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota do aluno:");
        double nota3 = sc.nextDouble();

        double mediaHarmonica = 3 / (1/nota1 + 1/nota2 + 1/nota3);

        System.out.printf("A média harmônica das notas %.2f, %.2f e %.2f é: %.2f\n", nota1, nota2, nota3, mediaHarmonica);
        sc.close();
    }
}