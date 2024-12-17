package lista1;

//Fazer um algoritmo que leia um valor L e calcula a área de um quadrado de lado L.

import java.util.Scanner;

public class Exer5 {
    
    static Scanner input = new Scanner(System.in);

    public static float numero(){
        System.out.printf("Informe o valor do lado do quadrado: ");

        float lado = input.nextFloat();

        return lado;
    }

    public static void impressao(float lado){

        float areaQuadrado = lado * lado;

        System.out.printf("A área do quadrado de lado %.2f é = %.2f", lado, areaQuadrado);
    }

    public static void main(String[] args) {
        float num = numero();
        impressao(num);
    }
}
