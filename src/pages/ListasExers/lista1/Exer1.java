package lista1;
//Fazer um algoritmo que leia dois números e imprima na tela o produto (multiplicação) dos dois números. 

import java.util.Scanner;

public class Exer1 {

    static Scanner input = new Scanner(System.in);

    public static float[] vetorNumeros(){
        float[] vetorNumeros = new float[2];

        return vetorNumeros;
    }

    public static float[] recebeValor(float[] vetorNumeros){

        System.out.printf("Informe o primeiro valor: ");
        vetorNumeros[0] = input.nextFloat();    

        System.out.printf("Informe o segundo valor: ");
        vetorNumeros[1] = input.nextFloat(); 
        
        return vetorNumeros;
    }

    public static float multiplicacao(float[] vetorNumeros){
        float mult = vetorNumeros[0] * vetorNumeros[1];

        return mult;
    }

    public static void impressao(float mult, float[] vetorNumeros){

        System.out.printf("O resultado da multiplicação de %.2f X %.2f = %.2f", vetorNumeros[0], vetorNumeros[1], mult);
    }

    public static void main(String[] args) {
        
        float[] vetor = vetorNumeros();
        recebeValor(vetor);
        float mult = multiplicacao(vetor);
        impressao(mult, vetor);
    }
}
