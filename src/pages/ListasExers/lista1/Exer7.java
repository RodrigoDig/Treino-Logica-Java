package lista1;

import java.util.Scanner;

public class Exer7 {
    
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.print("Digite o valor do lado A: ");
        double A = input.nextDouble();
        
        System.out.print("Digite o valor do lado B: ");
        double B = input.nextDouble();

        double hipotenusa = calcularHipotenusa(A, B);
        exibirHipotenusa(A, B, hipotenusa);
    }

    public static double calcularHipotenusa(double A, double B) {

        double num1 = A * A;
        double num2 = B * B;
        double soma = num1 + num2;

        double hipotenusa = Math.sqrt(soma);
        return hipotenusa;
    }

    public static void exibirHipotenusa(double A, double B, double hipotenusa) {
    
        System.out.printf("A hipotenusa do triângulo com lados %.2f e %.2f é: %.2f\n", A, B, hipotenusa);
    }
}
