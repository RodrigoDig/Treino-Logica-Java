//Implementar uma função que calcule o total a se pagar na compra de ingressos de cinema, a partir da quantidade de ingressos 'inteiras' e 'meias'. O valor do ingresso é R$ 28,50. Considere que se o ingresso for para QUARTA-FEIRA, todo ingresso custará meia entrada. Se for um filme NACIONAL, o ingresso custará R$ 5,00 para 'inteira' e 'meia'. O desconto para filmes nacionais tem prioridade sobre o desconto de quarta-feira, ou seja, os dois descontos não podem acontecer ao mesmo tempo.

package pages.condicionais;
import java.util.Scanner;

class Exer22{

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

    public static boolean nacional(){
        boolean nacional = true;

        System.out.printf("O filme é nacional(responda com Sim ou Nao)? ");
        String decisao = input.next();

        if(decisao.equalsIgnoreCase("Sim")){
            nacional = true;
        }
        else if(decisao.equalsIgnoreCase("Nao")){
            nacional = false;
        }

        return nacional;
    }

    public static double calculo(float[] ingressos, String diaSemana, boolean nacional){

        double somaIngressos = 0;
        double inteira = ingressos[0] * 28.50; 
        double meia = ingressos[1] * 14.25;

        if(nacional == true){
            inteira = 5;
            meia = 5;

            somaIngressos = inteira + meia;
        }
        else if(diaSemana.equalsIgnoreCase("Quarta")){
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
        boolean nacional = nacional();
        float[] ingresso = ingressos();
        quantidadeIngressos(ingresso);
        double calculo = calculo(ingresso, dia, nacional);

        impressao(calculo);
    }
}   