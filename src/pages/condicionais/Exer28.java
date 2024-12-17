//Implementar uma função que represente a lógica do jogo "Jokenpow". A partir da jogada colocada pelo jogador1 e jogador2, a função deve informar quem ganhou o jogo, ou se deu empate.

package pages.condicionais;
import java.util.Scanner;

class Exer28{

    static Scanner input = new Scanner(System.in);

    public static String[] vetorJogadores(){
        String[] jogadores = new String[2];

        return jogadores;
    }

    public static String[] vezJogada(String[] jogadores){
        System.out.printf("Jogador 1 faça sua jogada: ");
        jogadores[0] = input.next();

        System.out.printf("Jogador 2 faça sua jogada: ");
        jogadores[1] = input.next();

        return jogadores;
    }

    public static String validacao(String[] jogadores){

        String msg = "";

        if(jogadores[0].equalsIgnoreCase(jogadores[1])){
            msg = "Empate";
        }
        else if(jogadores[0].equalsIgnoreCase("Pedra") && jogadores[1].equalsIgnoreCase("Tesoura") || jogadores[0].equalsIgnoreCase("Tesoura") && jogadores[1].equalsIgnoreCase("Papel") || jogadores[0].equalsIgnoreCase("Papel") && jogadores[1].equalsIgnoreCase("Pedra")){
            msg = "Jogador 1 ganhou";
        }
        else if(jogadores[1].equalsIgnoreCase("Pedra") && jogadores[0].equalsIgnoreCase("Tesoura") || jogadores[1].equalsIgnoreCase("Tesoura") && jogadores[0].equalsIgnoreCase("Papel") || jogadores[1].equalsIgnoreCase("Papel") && jogadores[0].equalsIgnoreCase("Pedra")){
            msg = "Jogador 2 ganhou";
        }
        else{
            msg = "Jogada Inválida!!";
        }

        return msg;
    }

    public static void impressao(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        String[] jogadores = vetorJogadores();
        vezJogada(jogadores);

        String validacao = validacao(jogadores);

        impressao(validacao);
    }
}