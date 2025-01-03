/*Implementar uma função que escreva no terminal o dobro dos números naturais de 1 até um número informado. A mensagem deve estar no formato: "O dobro de X é Y".
Ex:  (5) => O dobro de 1 é 2
            O dobro de 2 é 4
            O dobro de 3 é 6
            O dobro de 4 é 8
            O dobro de 5 é 10 */

package pages.repeticao;
import java.util.Scanner;

class Exer10{

    static Scanner input = new Scanner(System.in);

    public static int numero(){

        System.out.printf("Informe um valor: ");
        int numero = input.nextInt();

        return numero;
    }

    public static void impressao(int numero){

        int tabuada = 0;

        for(int i = 1; i <= numero; i++){
            tabuada = i * 2;

            System.out.printf("O dobro de %d é %d\n", i, tabuada);
        }
    }

    public static void main(String[] args){

        int numero = numero();
        impressao(numero);

    }
}