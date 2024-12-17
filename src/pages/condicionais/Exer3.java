//3. Implementar uma função para converter dólares em reais
package pages.condicionais;
import java.util.Scanner;

class Exer3{

    static Scanner input = new Scanner(System.in);

    public static float dolar(){
        
        System.out.printf("=-=-=-DÓLAR PRA REAL-=-=-=\n");

        System.out.println("Informe o valor: ");
        float dolar = input.nextFloat();

        return dolar;
    }

    public static double conversor(float dolar){
        double conversor = dolar * 5.62;
        return conversor;
    }

    public static void impressao(float dolar, double conversor){
        System.out.printf("US %.2f convetendo pra real é = R$ %.2f", dolar, conversor);
    }
    public static void main(String[] args) {
        float dolar = dolar();
        double conversor = conversor(dolar);
        impressao(dolar, conversor);
    }
}