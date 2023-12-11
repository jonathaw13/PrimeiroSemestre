import java.util.Scanner;

public class Exerc17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int numero = entrada.nextInt();
        double quadrado = Math.pow((double)numero, 2.0);
        double raiz = (double)((int)Math.sqrt((double)numero));
        System.out.println("O valor digitado foi: " + numero);
        System.out.println("O quadrado de " + numero + " =  " + quadrado);
        System.out.println("A raiz quadrada de " + numero + " = " + raiz);
    }
}
