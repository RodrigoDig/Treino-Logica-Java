/*Implementar uma função que retorne um texto que represente a forma de uma linha a partir do tamanho de pontos que a compõem, conforme abaixo:
Exemplo: 4 pontos
* * * */

package pages.repeticao;

import java.util.Scanner;

class Exer12{

    public static Scanner input = new Scanner(System.in);

    public static int numero(){

        System.out.printf("Informe um número: ");
        int numero = input.nextInt();

        return numero;
    }

    public static void impressao(int numero){

        for(int i = 1; i <= numero; i++){
            System.out.print("* ");
        }
    }

    public static void main(String[] args){
        int numero = numero();
        impressao(numero);
    }
}