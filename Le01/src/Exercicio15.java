import java.util.Scanner;

public class Exercicio15 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as coordenadas do primeiro ponto P1(x1, y1):");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Digite as coordenadas do segundo ponto P2(x2, y2):");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("A distância entre os pontos P1(%.2f, %.2f) e P2(%.2f, %.2f) é: %.2f\n", x1, y1, x2, y2, distancia);

        sc.close();
    }
}