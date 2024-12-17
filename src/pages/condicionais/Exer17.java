//Implementar uma função que informe qual semestre é, a partir do número do mês.
package pages.condicionais;
import java.util.Scanner;

class Exer17{

    static Scanner input = new Scanner(System.in);

    public static int mes(){
        System.out.println("Informe o número do mês:");
        int mes = input.nextInt();

        if(mes > 12 || mes < 1){
            System.out.println("Mês inválido! Informe novamente: ");
            mes = input.nextInt();
        }

        return mes;
    }

    public static String semestre(int mes){
        String msg = "";

        if(mes >= 1 && mes <=6){
            msg = "Você está no 1° Semestre";
        }
        else{
            msg = "Você está no 2° Semestre";
        }

        return msg;
    }

    public static void impressao(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        int mes = mes();
        String msg = semestre(mes);

        impressao(msg);
    }
}