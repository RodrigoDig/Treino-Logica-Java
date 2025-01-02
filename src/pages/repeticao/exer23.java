/*Implementar uma função que retorne um texto que represente a forma de um triângulo a partir da quantidade de linhas, conforme abaixo:
Exemplo: 4 linhas
1
2 2
3 3 3
4 4 4 4 */

package pages.repeticao;

import java.util.Scanner;

class Exer23{

    static Scanner input = new Scanner(System.in);

    public static int linhas(){
        
        System.out.printf("Informe a quantidade de linhas: ");
        int linhas = input.nextInt();

        return linhas;
    }

    public static void impressao(int linhas){

        for(int i = 1; i <= linhas; i++){

            for(int j = 1; j <= i; j++){
                System.out.printf("%d ", i);
                
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int linhas = linhas();
        impressao(linhas);
    }
}