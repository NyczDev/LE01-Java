import java.util.Scanner;

public class Exercicio20 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tempo de viagem em horas:");
        double tV = sc.nextDouble();

        System.out.println("Digite a velocidade média da viagem em km/h:");
        double vM = sc.nextDouble();

        double dP = tV * vM;
        double litrosConsumidos = dP / 12;

        System.out.printf("A distância percorrida foi: %.2f km\n", dP);
        System.out.printf("A quantidade de litros consumidos foi: %.2f litros\n", litrosConsumidos);

        sc.close();
    }
}