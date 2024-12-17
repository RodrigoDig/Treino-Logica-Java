/*Implementar uma função que escreva no terminal os números naturais, a partir de um número de início e fim.
Ex: (3, 11) => 3 4 5 6 7 8 9 10 11
*/

package pages.repeticao;
import java.util.Scanner;

class Exer4{
    static Scanner input = new Scanner(System.in);

    private static int[] vetorNumeros(){
        int[] vetorNumeros = new int[2];
        
        return vetorNumeros;
    }

    private static int[] preencheVetor(int[] vetorNumeros){

        System.out.printf("Informe o número inicial: ");
        vetorNumeros[0] = input.nextInt();

        System.out.printf("Informe o número final: ");
        vetorNumeros[1] = input.nextInt();

        return vetorNumeros;
    }

    private static void impressao(int[] vetorNumeros){
        for(int i = vetorNumeros[0]; i <= vetorNumeros[1]; i++){
            System.out.printf("%d ", i);
        }
    }

    public static void main(String[] args) {
        int[] vetor = vetorNumeros();
        preencheVetor(vetor);
        impressao(vetor);
    }
}
