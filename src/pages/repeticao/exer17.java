/*Implementar uma função que calcule a soma dos números naturais de 1 até um número informado.
Ex: Somar de 1 até 5 => 1+2+3+4+5 => 15 */

package pages.repeticao;

import java.util.Scanner;

class Exer17{

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

        int soma = 0;

        for(int i = 1; i <= numero; i++){
            soma += i;

            System.out.printf("%d + ", i);
        }

        System.out.printf("= %d", soma);
    }

    public static void main(String[] args){
        
        int numero = numero();
        impressao(numero);
    }
}
