//Implementar uma função que informe a situação de um orçamento familiar baseado no total de ganhos e gastos. 
//Se o total de ganhos for maior que o total de gastos, deve ser exibido a mensagem: "Você está dentro do orçamento!", senão "Você está fora do orçamento! Não gaste mais!"

package pages.condicionais;
import java.util.Scanner;

class Exer14{
    static Scanner input = new Scanner(System.in);

    public static float[] orcamento(){
        float[] orcamento = new float[2];

        return orcamento;
    }

    public static float[] ganhosGastos(float[] orcamento){
        System.out.printf("Informe o valor dos seus ganhos:");
        orcamento[0] = input.nextFloat();

        System.out.printf("Informe o valor dos seus gastos:");
        orcamento[1] = input.nextFloat();

        return orcamento;
    }   

    public static String validacao(float[] orcamento){
        String msg = "";

        if(orcamento[0] > orcamento[1]){
            msg = "Você está dentro do orçamento!";
        }
        else{
            msg = "Você está fora do orçamento! Não gaste mais!";
        }

        return msg;
    }

    public static void impressao(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args) {
        float[] orcamento = orcamento();
        ganhosGastos(orcamento);
        String validacao = validacao(orcamento);

        impressao(validacao);
    }
}