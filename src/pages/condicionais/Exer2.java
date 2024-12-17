package pages.condicionais;
import java.util.Scanner;

//2. Implementar uma função para converter reais em dólares

class Exer2{

    static Scanner input = new Scanner(System.in);

    public static float real(){
        System.out.printf("=-=-=-REAL PRA DÓLAR-=-=-=\n");

        System.out.println("Informe o valor: ");
        float real = input.nextFloat();

        return real;
    }

    public static double conversor(float real){
        double conversor = real * 0.18;
        return conversor;
    }

    public static void impressao(float real, double conversor){
        System.out.printf("R$ %.2f convetendo pra dolar é = %.2f", real, conversor);
    }
    public static void main(String[] args) {
        float real = real();
        double conversor = conversor(real);
        impressao(real, conversor);
    }
}