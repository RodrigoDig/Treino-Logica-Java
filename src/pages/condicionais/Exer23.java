//Implementar uma função que a partir de duas cores primárias informe a cor resultante. Se as cores informadas não forem primárias, a função deve lançar um erro dizendo que apenas cores primárias são aceitas.

package pages.condicionais;

import java.util.Scanner;

class Exer23{
    
    static Scanner input = new Scanner(System.in);

    public static String[] cores(){

        String[] cores = new String[2];

        return cores;
    } 

    public static String[] cor(String[] cores){

        System.out.println("Informe a primeira cor:");
        cores[0] = input.next();

        System.out.println("Informe a segunda cor:");
        cores[1] = input.next();

        return cores;
    }

    public static String primaria(String[] cores){

        String msg = "";

        if(cores[0].equalsIgnoreCase("Azul") && cores[1].equalsIgnoreCase("Vermelho") || cores[1].equalsIgnoreCase("Azul") && cores[0].equalsIgnoreCase("Vermelho")) {
            msg = "\nCombinação = Roxo";
        }
        else if(cores[0].equalsIgnoreCase("Azul") && cores[1].equalsIgnoreCase("Amarelo") || cores[1].equalsIgnoreCase("Azul") && cores[0].equalsIgnoreCase("Amarelo")){
            msg = "\nCombinação = Verde";
        }
        else if(cores[0].equalsIgnoreCase("Vermelho") && cores[1].equalsIgnoreCase("Amarelo") || cores[1].equalsIgnoreCase("Vermelho") && cores[0].equalsIgnoreCase("Amarelo")){
            msg = "\nCombinação = Laranja";
        }
        else{
            msg = "\nSó é permitido cores primárias";
        }

        return msg;
    }

    public static void impressao(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args){
        String[] cores = cores();
        cor(cores);

        String primaria = primaria(cores);

        impressao(primaria);
    }
}