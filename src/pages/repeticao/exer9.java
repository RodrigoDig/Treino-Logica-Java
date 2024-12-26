/*Implementar uma função que escreva no terminal os números naturais múltiplos de número informado, de 0 até outro número informado.
Ex1: (4, 20) => 0, 4, 8, 12, 16, 20
Ex2: (6, 20) => 6, 12, 18 */

package pages.repeticao;
import java.util.Scanner;

class Exer9{

    static Scanner input = new Scanner(System.in);

    public static int[] vetorNumeros(){

        int[] vetor = new int[2];

        System.out.printf("Informe o múltiplo que deseja (Ex: 1,2,3...): " );
        vetor[0] = input.nextInt();

        System.out.printf("Informe o final do contador: " );
        vetor[1] = input.nextInt();

        return vetor;
    }

    public static void impressao(int[] vetor){
        for(int i = 0; i <= vetor[1]; i++){
            if(i % vetor[0] == 0){
                System.out.printf("%d ", i);
            }
        }
    }

    public static void main(String[] args) {
        int[] vetor = vetorNumeros();
        impressao(vetor);
    }
}