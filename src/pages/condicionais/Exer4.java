//4. Implementar uma função para verificar se um aluno REPROVOU baseado em 3 notas, considerando que a média para passar é a partir de 5.

package pages.condicionais;
import java.util.Scanner;

class Exer4{

    static Scanner input = new Scanner(System.in);

    public static float[] notas(){
        System.out.printf("=-=-=-NOTAS-=-=-=\n");
        float[] notas = new float[3];
        
        System.out.printf("Informe a nota 1: ");
        notas[0] = input.nextFloat();

        
        System.out.printf("Informe a nota 2: ");
        notas[1] = input.nextFloat();

        System.out.printf("Informe a nota 3: ");
        notas[2] = input.nextFloat();

        return notas;
    }

    public static float media(float[] notas){
        float media = (notas[0] + notas[1] + notas[2]) /3;
        return media;
    }

    public static void checagem(float media){
        if(media >= 5){
            System.out.printf("Nota = %.2f\nResultado = Aprovado!", media);
        }
        else{
            System.out.printf("Nota = %.2f\nResultado = Reprovado!", media);
        }
    }

    public static void main(String[] args) {
        float[] notas = notas();
        float media = media(notas);
        checagem(media);
    }
}