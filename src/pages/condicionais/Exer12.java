//Implementar uma função para verificar qual é o maior entre três números. 
//A função deve retornar uma mensagem na formatação: "O número X é maior que Y e Z". 
//Se os números forem iguais, a função deve retornar a mensagem: "Os números são iguais"

package pages.condicionais;
import java.util.Scanner;

class Exer12{
    static Scanner input = new Scanner(System.in);

    public static float[] vetorNumeros(){
        float[] vetor = new float[3];
        return vetor;
    }

    public static float[] preencheVetor(float[] vetor){
        System.out.printf("Informe três números\nNúmero 1");
        vetor[0] = input.nextFloat();

        System.out.printf("Número 2");
        vetor[1] = input.nextFloat();

        System.out.printf("Número 3");
        vetor[2] = input.nextFloat();

        return vetor;
    }

    public static String maior(float[] vetor){
        String msg= "";

        if(vetor[0] == vetor[1] && vetor[0] == vetor[2]){
            msg = "Os números são iguais!";
        }
        else if(vetor[0] > vetor[1] && vetor[0] > vetor[2]){
            msg = "O número X é maior que Y e Z.";
        }
        else if(vetor[1] > vetor[0] && vetor[1] > vetor[2]){
            msg = "O número Y é maior que X e Z.";
        }
        else{
            msg = "O número Z é maior que X e Y.";
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