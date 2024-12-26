/*Implementar uma função que escreva no terminal os números naturais pares de 0 até um número informado de forma decrescente.
Ex: (10) => 10 8 6 4 2 0 */

package pages.repeticao;
import java.util.Scanner;

class Exer6{

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
            for(int i = numero; i >= 0; i--){

                if(i % 2 == 0){
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