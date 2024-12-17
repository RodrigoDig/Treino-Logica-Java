/*Implementar uma função que retorne uma mensagem com a ação que um pedestre deve realizar ao ver seu semáforo. 
As possíveis ações estão listadas abaixo. Se a cor for diferente, a função deve retornar um Erro com a informação: "Farol inoperante"
- Vermelho -> Espere
- Verde -> Atravasse */

package pages.condicionais;
import java.util.Scanner;

class Exer13{
    static Scanner input = new Scanner(System.in);

    public static String corFarol(){
        System.out.printf("Informe a cor do farol:");
        String corFarol = input.nextLine();

        return corFarol;
    }

    public static String validacao(String corFarol){
        String msg = "";

        if(corFarol.equalsIgnoreCase("Vermelho")){
            msg = "Espere";
        }
        else if(corFarol.equalsIgnoreCase("Amarelo")){
            msg = "Cuidado";
        }
        else if(corFarol.equalsIgnoreCase("Verde")){
            msg = "Atravesse!";
        }
        else{
            msg = "Farol Inoperante";
        }

        return msg;
    }

    public static void impressao(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        String corFarol = corFarol();
        String validacao = validacao(corFarol);

        impressao(validacao);
    }
}
