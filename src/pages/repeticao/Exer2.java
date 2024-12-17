/*Implementar uma função que escreva no terminal os números naturais pares de 0 até um número informado.
Ex: (10) => 0 2 4 6 8 10 */

package pages.repeticao;
import java.util.Scanner;

class Exer2{

    static Scanner input = new Scanner(System.in);

    private static int informeNumero(){
        System.out.printf("Informe o número limite: ");
        int numero = input.nextInt();

        return numero;
    }

    private static void impressao(int numero){

        for(int i = 0; i <= numero; i++){

            if(i % 2 == 0){
                System.out.printf("%d ", i);
            }
        }
    }

    public static void main(String[] args) {
        int numero =  informeNumero();
        impressao(numero);    
    }
}