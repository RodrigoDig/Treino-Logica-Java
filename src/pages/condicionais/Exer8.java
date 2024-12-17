//8. Implementar uma função que retorne uma mensagem de boas vindas, a partir de um nome de aluno. Ex. "Seja bem-vindo Bruno!"
package pages.condicionais;
import java.util.Scanner;

class Exer8{
    static Scanner input = new Scanner(System.in);

    public static String nome(){
        System.out.printf("Informe o seu nome:\n");
        String nome = input.nextLine();

        return nome;
    }

    public static void impressao(String nome){
        System.out.printf("Seja bem-vindo(a) %s", nome);
    }

    public static void main(String[] args) {
        String nome = nome();
        impressao(nome);
    }
}
