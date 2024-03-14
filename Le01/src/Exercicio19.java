import java.util.Scanner;

public class Exercicio19 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o raio e a altura do cilindro");
        double raio = sc.nextDouble();
        double alt = sc.nextDouble();

        double vol = 3.14 * Math.pow(raio, 2) * alt;

        System.out.printf("Volume do cilindro = %.2f", vol);
        
        sc.close();
    }
}