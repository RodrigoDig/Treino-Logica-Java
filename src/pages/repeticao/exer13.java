/*Implementar uma função que retorne um texto que represente a forma de um quadrado a partir da quantidade de linhas, conforme abaixo:
Exemplo: 4 linhas
* * * *
* * * *
* * * *
* * * */

package pages.repeticao;

import java.util.Scanner;

class Exer13{

    public static Scanner input = new Scanner(System.in);

    public static int linha(){

        System.out.printf("Informe a quantidade de linhas: ");
        int linha = input.nextInt();

        return linha;
    }

    public static void impressao(int linha){

        for(int i = 1; i <= linha; i++){

            System.out.println();
            
            for(int j = 1; j<= linha; j++){
                System.out.printf("* ");
            }
        }
    }

    public static void main(String[] args) {
        
        int linha = linha();
        impressao(linha);
    }
}