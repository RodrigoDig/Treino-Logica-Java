/*Implementar uma função que escreva no terminal a tabuada de um número informado. A mensagem deve estar no formato: "A x B = X".
Ex:  (5) => 5 x 1 = 5
            5 x 2 = 10
            5 x 3 = 15
            5 x 4 = 20
            5 x 5 = 25
            5 x 6 = 30
            5 x 7 = 35
            5 x 8 = 40
            5 x 9 = 45
            5 x 10 = 50 */

package pages.repeticao;

import java.util.Scanner;

class Exer11{

    public static Scanner input = new Scanner(System.in);

    public static int numero(){

        System.out.printf("Informe um número: ");
        int numero = input.nextInt();

        return numero;
    }

    public static void impressao(int numero){

        int tabuada = 0;

        for(int i = 0; i <=10; i++){
            tabuada = numero * i;

            System.out.printf("%d X %d = %d\n",numero, i, tabuada);
        }
    }

    public static void main(String[] args) {
        
        int numero = numero();
        impressao(numero);
    }
}

