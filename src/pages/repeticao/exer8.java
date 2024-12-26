/*Implementar uma função que escreva no terminal os números naturais, a partir de um número de início e fim, de forma decrescente.
Ex: (3, 11) => 11 10 9 8 7 6 5 4 3
 */

package pages.repeticao;

import java.util.Scanner;

class Exer8{

    static Scanner input = new Scanner(System.in);

    public static int[] vetorNumeros(){
        int[] vetor = new int[2];

        System.out.printf("Informe o número de início: ");
        vetor[0] = input.nextInt();

        System.out.printf("Informe o número final: ");
        vetor[1] = input.nextInt();

        if(vetor[0] > vetor[1]){
            System.err.printf("Inválido!! Informe o número final novamente: ");
            vetor[1] = input.nextInt();
        }

        return vetor;
    }

    public static void impressao(int[] vetor){

        if(vetor[0] == vetor[1]){
            System.out.printf("Números iguais");
        }
        else{
            for(int i = vetor[1]; i >= vetor[0]; i--){
                System.out.printf("%d ", i);
            }
        }
    }

    public static void main(String[] args){
        int[] vetor = vetorNumeros();
        impressao(vetor);
    }
}