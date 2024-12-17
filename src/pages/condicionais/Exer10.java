//Implementar uma função para verificar qual é o maior entre dois números. 
//A função deve retornar uma mensagem na formatação: "O número X é maior que Y"

package pages.condicionais;
import java.util.Scanner;

class Exer10{
    static Scanner input = new Scanner(System.in);

    public static float[] vetorNumeros(){
        float[] vetor = new float[2];
        return vetor;
    }

    public static float[] preencheVetor(float[] vetor){
        System.out.printf("Informe dois números\nNúmero 1");
        vetor[0] = input.nextFloat();

        System.out.printf("Número 2");
        vetor[1] = input.nextFloat();

        return vetor;
    }

    public static String maior(float[] vetor){
        String msg= "";

        if(vetor[0] > vetor[1]){
            msg = "O número X é maior que Y.";
        }
        else{
            msg = "O número Y é maior que X.";
        }

        return msg;
    }

    public static void impressao(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        float[] vetor = vetorNumeros();
        float[] vetorCheio = preencheVetor(vetor);
        String msg = maior(vetorCheio);

        impressao(msg);
    }
}