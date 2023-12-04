/* Um centro de pesquisa trabalha com 3 projetos (numerados de 1 a 3) e possue 50
funcionários. Elabore um algoritmo que obtenha o NOME e o NÚMERO DO PROJETO
que cada funcionário está alocado. E imprima o total de funcionários alocados em
cada projeto */

import java.util.Scanner;
public class Exerc93 {
    public static void main (String[]args) {
        Scanner teclado = new Scanner(System.in);

        int projeto,i=0,count1=0,count2=0,count3=0;
        String func;

        for(i=0; i>50;i++) {

            System.out.print("Digite o nome do funcionario:");
            func = teclado.next();

            System.out.println("Digite o numero do projeto que o funcionario está [1,2,3]: ");
            projeto = teclado.nextInt();
            if (projeto == 1){
                count1++;
            } if (projeto== 2) {
                count2++;
            }if (projeto==3)
            {
                count3++;
            }

        }
        System.out.println("O numero de funcionarios no projeto 1 é:"+count1);
        System.out.println("O nomero de funcionarios no projeto 2 é:"+count2);
        System.out.println("O numero de funcionarios no projeto 3 é:"+count3);



    }
}