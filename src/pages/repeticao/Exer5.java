/*Implementar uma função que escreva no terminal os números naturais de 1 até um número informado de forma decrescente.
Ex: (10) => 10 9 8 7 6 5 4 3 2 1 */

package pages.repeticao;
import java.util.Scanner;

class Exer5{

    static Scanner input = new Scanner(System.in);

    private static int informeNumero(){
        System.out.printf("Informe um número: ");
        int numero = input.nextInt();

        return numero;
    }

    private static void impressao(int numero){

        if(numero > 1){
            for(int i = numero; i >= 1; i--){
                System.out.printf("%d ", i);
            }
        }
        else if(numero < 1){
            for(int i = numero; i <= 1; i++){
                System.out.printf("%d ", i);
            }
        }
        else{
            System.out.println("Os números são iguais");
        }
    }

    public static void main(String[] args) {
        int numero = informeNumero();
        impressao(numero);    
    }
}