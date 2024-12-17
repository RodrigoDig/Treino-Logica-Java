/*Implementar uma função que informe a classificação de um aluno a partir de 3 notas, seguindo as regras abaixo:
- Se média maior que 8        = Aprovado com sucesso
- Se média entre 5 e 8        = Aprovado
- Se média entre 3 e 5        = Recuperação
- Se média menor que 3        = Reprovado
- Se média igual a zero        = Desistente
 */

package pages.condicionais;
import java.util.Scanner;

class Exer24{

    static Scanner input = new Scanner(System.in);

    public static float[] vetorNotas(){
        float[] vetorNotas = new float[3];

        return vetorNotas;
    }

    public static float[] notas(float[] vetorNotas){
        System.out.printf("Informe a nota 1: ");
        vetorNotas[0] = input.nextFloat();

        System.out.printf("Informe a nota 2: ");
        vetorNotas[1] = input.nextFloat();

        System.out.printf("Informe a nota 3: ");
        vetorNotas[2] = input.nextFloat();

        return vetorNotas;
    }

    public static float media(float[] vetorNotas){

        float media = (vetorNotas[0] + vetorNotas[1] + vetorNotas[2]) / 3; 
        return media;
    }

    public static String conceitoFinal(float media){
        String msg = "";

        if(media > 8){
            msg = "Aprovado com sucesso!";
        }
        else if(media >= 5){
            msg = "Aprovado";
        }
        else if(media >= 3){
            msg = "Recuperação";
        }
        else if(media < 3){
            msg = "Reprovado";
        }
        else{
            msg = "Desistente";
        }

        return msg;
    }

    public static void impressao(String msg, float media){
        System.out.printf("\nMédia final: %.2f\nResultado = %s", media, msg);
    }

    public static void main(String[] args) {
        float[] vetorNotas = vetorNotas();
        notas(vetorNotas);
        float media = media(vetorNotas);

        String msg = conceitoFinal(media);

        impressao(msg, media);
    }
}