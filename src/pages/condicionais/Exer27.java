//Implementar uma função que calcule o total a se pagar em uma compra na sorveteria, a partir do total de gramas comprado. O preço de 100g é R$ 3,50 mas se o total de gramas for maior que 1kg, o preço de 100g diminui 50 centavos.

package pages.condicionais;
import java.util.Scanner;

class Exer27{
     
    static Scanner input = new Scanner(System.in);

    public static float qtdGramas(){
        System.out.printf("Informe a quantidade de gramas que deseja comprar: ");
        float gramas = input.nextFloat();

        if(gramas < 100){
            System.out.println("Só aceitamos acima de 100 gramas. Insira novamente: ");
            gramas = input.nextFloat();
        }

        return gramas;
    }

    public static double calculo(float gramas){
        double valor = gramas * 3.50 / 100;

        if(gramas > 1000){
            valor = gramas * 3.00 / 100;
        }

        return valor;
    }

    public static void impressao(double calculo, float gramas){
        System.out.printf("O valor total em %.0f gramas é de R$%.2f", gramas, calculo);
    }

    public static void main(String[] args) {
        float qtdGramas = qtdGramas();
        double calculo = calculo(qtdGramas);

        impressao(calculo, qtdGramas);
    }
}