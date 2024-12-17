/*Implementar uma função que escreva no terminal os números naturais ímpares de 1 até um número informado.
Ex: (10) => 1 3 5 7 9 */
package pages.repeticao;
import java.util.Scanner;

class Exer3{

    static Scanner input = new Scanner(System.in);

    private static int informeNumero(){
        System.out.printf("Informe o número limite: ");
        int numero = input.nextInt();

        return numero;
    }

    private static void impressao(int numero){

        for(int i = 1; i <= numero; i++){

            if(i % 2 != 0){
                System.out.printf("%d ", i);
            }
        }
    }

    public static void main(String[] args) {
        int numero =  informeNumero();
        impressao(numero);    
    }
}