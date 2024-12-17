//1. Implementar uma função para converter kilos para gramas
package pages.condicionais;
import java.util.Scanner;

class Exer1{

    static Scanner input = new Scanner(System.in);

    public static float kilos(){
        System.out.printf("=-=-=-KILOS PRA GRAMAS-=-=-=\n");

        System.out.printf("Informe a quantidade de Kilos que você quer transformar em gramas: ");
        float kilos = input.nextFloat();

        return kilos;
    }

    public static float conversor(float kilos){
        float conversor = kilos * 1000;
        return conversor;
    }

    public static void impressao(float kilos, float conversor){
        System.out.printf("Resultado da conversão de %.1fkg pra gramas é = %.1f", kilos, conversor);
    }

    public static void main(String[] args) {
        float kilos = kilos();
        float conversor = conversor(kilos);

        impressao(kilos, conversor);
    }

}