/*Implementar uma função que escreva no terminal os números naturais ímpares de 1 até um número informado de forma decrescente.
Ex: (10) => 9 7 5 3 1 */

package pages.repeticao;

import java.util.Scanner;

class Exer7{
    static Scanner input = new Scanner(System.in);

    public static int numero(){
        System.out.printf("Informe o número de início: ");
        int numero = input.nextInt();

        return numero;
    }

    public static void impressao(int numero){
        if(numero < 0){
            System.err.println("Operação inválida");
        }
        else{
            for(int i = numero; i >= 1; i--){
                
                if(i % 2 != 0){
                    System.out.printf("%d ", i);
                }
            }
        }
    }

    public static void main(String[] args){
        int numero = numero();
        impressao(numero);
    }
}