package lista1;

//Fazer um algoritmo que leia quatro números e imprime a média aritmética dos quatro números.

import java.util.Scanner;

public class Exer8 {
    static Scanner input = new Scanner(System.in);

    public static float[] vetorNotas(){

        float[] notas = new float[4];
        
        return notas;
    }

    
    public static float[] notas(float[] vetorNotas){

        System.out.printf("Informe a primeira nota: ");
        vetorNotas[0] = input.nextFloat();

        System.out.printf("Informe a segunda nota: ");
        vetorNotas[1] = input.nextFloat();

        System.out.printf("Informe a terceira nota: ");
        vetorNotas[2] = input.nextFloat();

        System.out.printf("Informe a quarta nota: ");
        vetorNotas[3] = input.nextFloat();

        return vetorNotas;
    }

    public static void impressao(float[] vetorNotas){
        float media = (vetorNotas[0] + vetorNotas[1] + vetorNotas[2] + vetorNotas[3]) / 4; 

        System.out.printf("\n=-=-=-Notas-=-=-=\nNota 1 = %.2f\nNota 2 = %.2f\nNota 3 = %.2f\nNota 4 = %.2f\nMédia = %.2f",vetorNotas[0], vetorNotas[1], vetorNotas[2], vetorNotas[3], media);
    }

    public static void main(String[] args) {
        float[] notas = vetorNotas();
        notas(notas);
        impressao(notas);
    }
}
