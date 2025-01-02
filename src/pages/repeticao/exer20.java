/*Implementar uma função que calcule o fatorial de um número informado.
Ex: Fatorial de 5 => 5*4*3*2*1 => 120 */

package pages.repeticao;

import java.util.Scanner;

class Exer20{

    static Scanner input = new Scanner(System.in);

    public static int numero(){

        System.out.printf("Informe um número: ");
        int numero = input.nextInt();

        if(numero <= 0){
            System.err.printf("Inválido! Informe novamente: ");
            numero = input.nextInt();
        }

        return numero;
    }

    public static void impressao(int numero){

        for(int i = numero; i > 0; i--){

            
        }
    }

    public static void main(String[] args){

        int numero = numero();
        impressao(numero);
    }
}