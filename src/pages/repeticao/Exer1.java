/*Implementar uma função que escreva no terminal os números naturais de 1 até um número informado.
Ex: (10) => 1 2 3 4 5 6 7 8 9 10 */

package pages.repeticao;
import java.util.Scanner;

class Exer1{

    static Scanner input = new Scanner(System.in);

    private static int informeNumero(){
        System.out.printf("Informe o número limite: ");
        int numero = input.nextInt();

        return numero;
    }

    private static void impressao(int numero){
        for(int i = 1; i <= numero; i++){
            System.out.printf("%d ", i);
        }
    }

    public static void main(String[] args) {
        int numero = informeNumero();        
        impressao(numero);;
    }   
}