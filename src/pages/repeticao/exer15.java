/*Implementar uma função que retorne um texto que represente a forma de um triângulo a partir da quantidade de linhas, conforme abaixo:
Exemplo: 5 linhas
*
* *
* * *
* * * * 
* * * * */

package pages.repeticao;

import java.util.Scanner;

class Exer15{

    public static Scanner input = new Scanner(System.in);

    public static int linhas(){

        System.out.printf("Informe a quantidade de linhas: ");
        int linha = input.nextInt();

        return linha;
    }

    public static void impressao(int linha){

        for(int i = 1; i <= linha; i++){
    
            for(int j = 1; j <= i; j++){
                
                System.out.printf("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args){

        int linha = linhas();
        impressao(linha);
    }

}
