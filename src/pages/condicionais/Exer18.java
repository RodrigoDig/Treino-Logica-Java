/*Implementar uma função que represente a lógica do jogo "Par ou Ímpar". A partir do número colocado pelo jogador1 e jogador2, a função deve informar quem ganhou o jogo.
 */
package pages.condicionais;

import java.util.Scanner;

class Exer18{
    static Scanner input = new Scanner(System.in);

    public static int[] jogadores(){
        int[] jogadores = new int[2];

        return jogadores;
    }

    public static int[] vezJogador(int[] jogadores){
        System.out.println("Jogador 1 informe um número:");
        jogadores[0] = input.nextInt();

        System.out.println("Jogador 2 informe um número:");
        jogadores[1] = input.nextInt();

        return jogadores;
    }

    public static int jogada(int[] jogadores){
        int jogada = jogadores[0] + jogadores[1];

        return jogada;
    }

    public static String vencedor(int jogada){
        String msg = "";

        if(jogada % 2 == 0){
            msg = "Resultado: " + jogada + " Par\nJogador 1 ganhou" ;
        }
        else{
            msg = "Resultado: " + jogada + " Ímpar\nJogador 2 ganhou" ;
        }

        return msg;
    }

    public static void impressao(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        int[] jogadores = jogadores();
        vezJogador(jogadores);
        int jogada = jogada(jogadores);

        String vencedor = vencedor(jogada);

        impressao(vencedor);
    }
}
