//Implementar uma função que informe o dia da semana por extenso a partir do número do dia, sabendo que a semana começa no Domingo como dia zero. Se o número do dia não estiver entre 0 e 6, um erro deve ser lançado com a mensagem: "Dia da semana inválido".
package pages.condicionais;
import java.util.Scanner;

class Exer15{

    static Scanner input = new Scanner(System.in);

    public static String[] semana() {
        String[] semana = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};

        return semana;
    }

    public static int dia() {

        System.out.println("Informe um número de 0-6 ");
        int dia = input.nextInt();

        return dia;
    }

    public static void validacao(int dia, String[] semana) {
        if (dia < 0 || dia > 6) {
            System.out.println("Dia inválido");
        }
        else{
            System.out.println(semana[dia]);
        }
    }

    public static void main(String[] args) {
        String[] semana = semana();
        int dia = dia();

        validacao(dia, semana);
    }
}


