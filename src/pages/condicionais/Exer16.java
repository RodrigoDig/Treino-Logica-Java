//Implementar uma função que informe o nome de um mês por extenso a partir do número do mês.

package pages.condicionais;
import java.util.Scanner;

class Exer16{
    static Scanner input = new Scanner(System.in);

    public static String[] mes(){
        String[] mes = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        return mes;
    }

    public static int numeroMes(){
        System.out.printf("Informe o número do Mês que deseja ver de 0-11(0 = Janeiro e 11 = Dezembro):");
        int numeroMes = input.nextInt();

        return numeroMes;
    }

    public static void validacao(int numeroMes, String[] mes){
        if(numeroMes > 11 || numeroMes < 0){
            System.out.println("Mês inválido");
        }
        else{
            System.out.println(mes[numeroMes]);
        }
    }

    public static void main(String[] args) {
        String[] mes = mes();
        int dia = numeroMes();

        validacao(dia, mes);
    }
}
