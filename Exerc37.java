import java.util.Scanner;

public class Exerc37 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o raio: ");
        double raio = entrada.nextDouble();
        System.out.println("Digite a altura: ");
        double altura = entrada.nextDouble();
        double volume = Math.PI * Math.pow(raio, 2.0) * altura;
        System.out.println("O volume = " + volume);
        System.out.println(String.format("O volume: %.2f", volume));
    }
}
