package lista1;

/*
Fazer um algoritmo que lê dois números inteiros e imprime os números consecutivos desses números. (Por
exemplo: se o usuário digitar 2 e -9, a saída deverá ser 3 e -8, porque 3 é consecutivo de 2. –8 é consecutivo
de –9)
*/

import java.util.Scanner;

public class Exer4 {
    
    static Scanner input = new Scanner(System.in);

    public static int[] vetorNumeros(){
        int[] vetorNumeros = new int[2];

        return vetorNumeros;
    }

    public static int[] recebeValor(int[] vetorNumeros){

        System.out.printf("Informe o primeiro número: ");
        vetorNumeros[0] = input.nextInt();    

        System.out.printf("Informe o segundo número: ");
        vetorNumeros[1] = input.nextInt(); 
        
        return vetorNumeros;
    }

    public static void impressao(int[] vetorNumeros){
        int consecutivo1 = vetorNumeros[0] ++;
        int consecutivo2 = vetorNumeros[1] ++;
        
        System.out.printf("\n=-=-=-Consecutivos-=-=-=\n");
        System.out.printf("Consecutivo de %d = %d\nConsecutivo de %d = %d", consecutivo1, vetorNumeros[0], consecutivo2, vetorNumeros[1]);
    }

    public static void main(String[] args) {
        int[] vetor = vetorNumeros();
        recebeValor(vetor);
        impressao(vetor);
    }
}
