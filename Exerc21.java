import java.util.Scanner;

public class Exerc21 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nome Completo: ");
        String nome = entrada.next();
        nome.substring(1, nome.length() - 1);
        System.out.println("Primeiro Caractere: " + nome);
        System.out.println("Ultimo Caractere: ");
        System.out.println("Do primeiro ate o terceiro: ");
        System.out.println("Quarto caractere: ");
        System.out.println("Todos menos o primeiro: ");
        System.out.println("Os dois ultimos: ");
    }
}
