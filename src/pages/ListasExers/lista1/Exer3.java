package lista1;

/*Fazer um algoritmo que lê dois números e imprime a soma dos quadrados dos dois números. O quadrado
de um número A é representado por A2 = A * A. 
*/

import java.util.Scanner;

public class Exer3{

    static Scanner input = new Scanner(System.in);

    public static double[] vetorNumeros(){
        double[] vetorNumeros = new double[2];

        return vetorNumeros;
    }

    public static double[] recebeValor(double[] vetorNumeros){

        System.out.printf("Informe o primeiro número: ");
        vetorNumeros[0] = input.nextDouble();    

        System.out.printf("Informe o segundo número: ");
        vetorNumeros[1] = input.nextDouble(); 
        
        return vetorNumeros;
    }

    public static double quadrados(double[] vetorNumeros){

        double num1 = vetorNumeros[0] * vetorNumeros[0];
        double num2 = vetorNumeros[1] * vetorNumeros[1];

        double somaQuadrados = num1 + num2;
        System.out.printf("\n=-=-=-Quadrados-=-=-=\n%.2f = %.2f\n%.2f = %.2f\n", vetorNumeros[0], num1,vetorNumeros[1], num2);
        return somaQuadrados;
    }

    public static void impressao(double somaQuadrados, double[] vetorNumeros){

        System.out.printf("O resultado da soma dos quadrados é = %.2f", somaQuadrados);
    }

    public static void main(String[] args) {
        
        double[] vetor = vetorNumeros();
        recebeValor(vetor);
        double soma = quadrados(vetor);
        impressao(soma, vetor);
    }
}
