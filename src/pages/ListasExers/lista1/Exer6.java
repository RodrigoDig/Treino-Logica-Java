package lista1;

import java.util.Scanner;

public class Exer6 {
    
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.print("Digite o valor de A: ");
        double A = input.nextDouble();
        
        System.out.print("Digite o valor de B: ");
        double B = input.nextDouble();
        
        System.out.print("Digite o valor de C: ");
        double C = input.nextDouble();

        exibirValores(A, B, C);
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        double areaTriangulo = (base * altura) / 2;
        return areaTriangulo;
    }

    public static double calcularAreaCirculo(double raio) {
        double areaCirculo = 3.14159 * raio * raio;
        return areaCirculo;
    }

    public static double calcularAreaTrapezio(double base1, double base2, double altura) {
        double areaTrapezio = ((base1 + base2) * altura) / 2;
        return areaTrapezio;
    }

    public static double calcularAreaQuadrado(double lado) {
        double areaQuadrado = lado * lado;
        return areaQuadrado;
    }

    public static double calcularAreaRetangulo(double lado1, double lado2) {
        double areaRetangulo = lado1 * lado2;
        return areaRetangulo;
    }

    public static double calcularPerimetroRetangulo(double lado1, double lado2) {
        double perimetroRetangulo = 2 * (lado1 + lado2);
        return perimetroRetangulo;
    }

    public static void exibirValores(double A, double B, double C) {
        double areaTriangulo = calcularAreaTriangulo(A, C);
        double areaCirculo = calcularAreaCirculo(C);
        double areaTrapezio = calcularAreaTrapezio(A, B, C);
        double areaQuadrado = calcularAreaQuadrado(B);
        double areaRetangulo = calcularAreaRetangulo(A, B);
        double perimetroRetangulo = calcularPerimetroRetangulo(A, B);

        System.out.printf("Área do triângulo retângulo: %.2f\n", areaTriangulo);
        System.out.printf("Área do círculo: %.2f\n", areaCirculo);
        System.out.printf("Área do trapézio: %.2f\n", areaTrapezio);
        System.out.printf("Área do quadrado: %.2f\n", areaQuadrado);
        System.out.printf("Área do retângulo: %.2f\n", areaRetangulo);
        System.out.printf("Perímetro do retângulo: %.2f\n", perimetroRetangulo);
    }
}

