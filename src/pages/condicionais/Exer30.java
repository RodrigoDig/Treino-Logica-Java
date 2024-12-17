/*Implementar uma função que a partir de um dia e mês em formato numérico, informe qual é o signo da pessoa. */

package pages.condicionais;

import java.util.Scanner;

class Exer30{

    static Scanner input = new Scanner(System.in);

    public static int[] diaMes(){
        int[] diaMes = new int[2];

        return diaMes;
    }

    public static int[] inserirDiaMes(int[] diaMes){

        System.out.printf("Informe o dia: ");
        diaMes[0] = input.nextInt();

        if(diaMes[0] > 31 || diaMes[0] < 1){
            System.out.println("Dia inválido. Informe novamente: ");
            diaMes[0] = input.nextInt();
        }

        System.out.printf("Informe o mês: ");
        diaMes[1] = input.nextInt();

        if(diaMes[1] > 12 || diaMes[1] < 1){
            System.out.println("Mês inválido. Informe novamente: ");
            diaMes[1] = input.nextInt();
        }

        return diaMes;
    }

    public static String signo(int[] diaMes){

        String msg = "";

        if ((diaMes[1] == 1 && diaMes[0] >= 20) || (diaMes[1] == 2 && diaMes[0] <= 18)) {
            msg =  "Aquário";
        } else if ((diaMes[1] == 2 && diaMes[0] >= 19) || (diaMes[1] == 3 && diaMes[0] <= 20)) {
            msg =  "Peixes";
        } else if ((diaMes[1] == 3 && diaMes[0] >= 21) || (diaMes[1] == 4 && diaMes[0] <= 19)) {
            msg =  "Áries";
        } else if ((diaMes[1] == 4 && diaMes[0] >= 20) || (diaMes[1] == 5 && diaMes[0] <= 20)) {
            msg =  "Touro";
        } else if ((diaMes[1] == 5 && diaMes[0] >= 21) || (diaMes[1] == 6 && diaMes[0] <= 20)) {
            msg =  "Gêmeos";
        } else if ((diaMes[1] == 6 && diaMes[0] >= 21) || (diaMes[1] == 7 && diaMes[0] <= 22)) {
            msg =  "Câncer";
        } else if ((diaMes[1] == 7 && diaMes[0] >= 23) || (diaMes[1] == 8 && diaMes[0] <= 22)) {
            msg =  "Leão";
        } else if ((diaMes[1] == 8 && diaMes[0] >= 23) || (diaMes[1] == 9 && diaMes[0] <= 22)) {
            msg =  "Virgem";
        } else if ((diaMes[1] == 9 && diaMes[0] >= 23) || (diaMes[1] == 10 && diaMes[0] <= 22)) {
            msg =  "Libra";
        } else if ((diaMes[1] == 10 && diaMes[0] >= 23) || (diaMes[1] == 11 && diaMes[0] <= 21)) {
            msg =  "Escorpião";
        } else if ((diaMes[1] == 11 && diaMes[0] >= 22) || (diaMes[1] == 12 && diaMes[0] <= 21)) {
            msg =  "Sagitário";
        } else if ((diaMes[1] == 12 && diaMes[0] >= 22) || (diaMes[1] == 1 && diaMes[0] <= 19)) {
            msg =  "Capricórnio";
        } else {
            msg =  "Data inválida";
        }

        return msg;
    }

    public static void impressao(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        int[] data = diaMes();
        int[] diaMes = inserirDiaMes(data);

        String msg = signo(diaMes);

        impressao(msg);
    }
}