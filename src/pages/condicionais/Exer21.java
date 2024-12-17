//Implementar uma função que calcule o total a se pagar na compra de ingressos de cinema, a partir da quantidade de ingressos 'inteiras' e 'meias'. O valor do ingresso é R$ 28,50. Considere que se o ingresso for para QUARTA-FEIRA, ingressos 'inteiras' também custarão meia entrada.

package pages.condicionais;
import java.util.Scanner;

class Exer21{

    static Scanner input = new Scanner(System.in);

    public static String diaSemana(){
        System.out.println("Informe o dia da semana:");
        String diaSemana = input.next();

        return diaSemana;
    }   

    public static float[] ingressos(){
        float[] ingressos = new float[2];

        return ingressos;
    }

    public static float[] quantidadeIngressos(float[] ingressos){

        System.out.println("Informe a quantida de inteiras:");
        ingressos[0] = input.nextFloat();

        System.out.println("Informe a quantida de meias");
        ingressos[1] = input.nextFloat();

        return ingressos;
    }

    public static double calculo(float[] ingressos, String diaSemana){

        double somaIngressos = 0;
        double inteira = ingressos[0] * 28.50; 
        double meia = ingressos[1] * 14.25;

        if(diaSemana.equalsIgnoreCase("Quarta")){
            inteira = 14.50;

            somaIngressos = meia + inteira;
        }
        else{
            somaIngressos = meia + inteira; 
        }

        return somaIngressos;
    }

    public static void impressao(double somaIngressos){
        System.out.printf("O total da compra foi de R$%.2f", somaIngressos);
    }

    public static void main(String[] args) {
        String dia = diaSemana();
        float[] ingresso = ingressos();
        quantidadeIngressos(ingresso);
        double calculo = calculo(ingresso, dia);

        impressao(calculo);
    }
}   