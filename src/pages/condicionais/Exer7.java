//7. Implementar uma função para verificar se deve-se ir ao parque, sim ou não. Para ir ao parque, a temperatura atual deve estar entre 23 e 30 graus (maior igual a 23 e menor igual a 30).

package pages.condicionais;
import java.util.Scanner;

class Exer7{
    private static Scanner input = new Scanner(System.in);

    public static float temperatura(){
        System.out.printf("=-=-=-PROGRAMA TEMPERATURA-=-=-=\n");

        System.out.printf("Informe a temperatura do ambiente: ");
        float temperatura = input.nextFloat();

        return temperatura;
    }

    public static boolean podeSair(float temperatura){
        boolean sair;
        if(temperatura >= 23 && temperatura <=30){
            sair = true;    
        }
        else{
            sair = false;
        }

        return sair;
    }

    public static void impressao(boolean sair){
        if(sair == true){
            System.out.printf("Você pode ir ao parque!");
        }
        else{
            System.out.printf("Você não pode ir ao parque!");
        }
    }

    public static void main(String[] args) {
        float temperatura = temperatura();
        boolean sair = podeSair(temperatura);
        impressao(sair);
    }
}