/*39)Fazer um algoritmo que leia e escreva o nome e a altura das moças inscritas em
um concurso de beleza. Para cada moça, existe uma linha contendo seu nome e
sua altura. Calcule e escreva as duas maiores alturas e quantas moças as
possuem */
import java.util.Scanner;
public class Exerc43 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String nome;
        double altura, maiorAltura = 0, maiorAltura2 = 0;
        char resp = 's';
        int qtde_totalMulheres = 0, qtde_maiorAltura = 0, qtde_maiorALtura2 = 0;

        while (resp == 's') {

            System.out.println("Digite o nome ");
            nome = ler.next();

            System.out.println("Digite a altura");
            altura = ler.nextDouble();

            if (altura >= maiorAltura) {
                maiorAltura = altura;
                System.out.println("nome = " + nome + " e a altura é = " + altura);
                qtde_maiorAltura++;

            }

            if (altura >= maiorAltura2 && altura < maiorAltura) {
                maiorAltura2 = altura;
                System.out.println("nome = " + nome + " e a altura é = " + altura);
                qtde_maiorALtura2++;
            }


            qtde_totalMulheres++;

            System.out.println("Deseja continuar? [s/n]");
            resp = ler.next().charAt(0);

        }

        System.out.println("a maior altura é " + maiorAltura + " e a quantidade de moças com a maior altura é = " + qtde_maiorAltura);
        System.out.println("a segunda maior altura é " + maiorAltura2 + " e a quantidade de moças com a segunda maior altura é = " + qtde_maiorALtura2);


    }
}