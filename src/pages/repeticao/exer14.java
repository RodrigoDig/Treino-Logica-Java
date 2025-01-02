/*Implementar uma função que retorne um texto que represente a forma de um retângulo a partir da quantidade de linhas e colunas, conforme abaixo:
Exemplo: 4 linhas e 2 colunas
* *
* *
* *
* */

package pages.repeticao;

import java.util.Scanner;

class Exer14{

    public static Scanner input = new Scanner(System.in);

    public static int[] linhasColunas(){

        int[] linCol = new int[2];

        System.out.printf("Informe a quantidade de linhas: ");
        linCol[0] = input.nextInt();

        System.out.printf("Informe a quantidade de colunas: ");
        linCol[1] = input.nextInt();

        return linCol;
    }

    public static void impressao(int[] linCol){

        for(int i = 1; i <= linCol[0]; i++){
    
            for(int j = 1; j <= linCol[1]; j++){
                
                System.out.printf("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args){

        int[] vetor = linhasColunas();
        impressao(vetor);
    }
}
