package lista1;

/* Fazer um algoritmo que lê dois números, a base e o expoente, e imprime a potência (base elevada ao
expoente). Dica: use a função matemática Math.pow(). Exemplo: 5 elevado ao cubo ficaria
Math.pow(5, 3). Você pode trocar esses números por variáveis.
*/

import java.util.Scanner;
import java.lang.Math;

public class Exer2{
    
    static Scanner input = new Scanner(System.in);

    public static double[] vetorNumeros(){
        double[] vetorNumeros = new double[2];

        return vetorNumeros;
    }

    public static double[] recebeValor(double[] vetorNumeros){

        System.out.printf("Informe base: ");
        vetorNumeros[0] = input.nextDouble();    

        System.out.printf("Informe o expoente: ");
        vetorNumeros[1] = input.nextDouble(); 
        
        return vetorNumeros;
    }
    
    public static double potencia(double[] vetorNumeros){
        double num1 = vetorNumeros[0];
        double num2 = vetorNumeros[1];
        double potencia = Math.pow(num1, num2);

        return potencia;
    }

    public static void impressao(double potencia, double[] vetorNumeros){

        System.out.printf("O resultado da potênciação de %.2f elevado a %.2f = %.2f", vetorNumeros[0], vetorNumeros[1], potencia);
    }

    public static void main(String[] args) {
        
        double[] vetor = vetorNumeros();
        recebeValor(vetor);
        double potencia = potencia(vetor);
        impressao(potencia, vetor);
    }
}
