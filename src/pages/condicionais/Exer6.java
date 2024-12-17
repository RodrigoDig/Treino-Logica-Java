//6. Implementar uma função para verificar se uma pessoa está com febre, sabendo que é considerado febre a partir de 37 graus.

package pages.condicionais;
import java.util.Scanner;

class Exer6{
    private static Scanner input = new Scanner(System.in);

    public static float temperatura(){
        System.out.printf("=-=-=-FEBRE-=-=-=\n");

        System.out.printf("Informe a sua temperatura: ");
        float temperatura = input.nextFloat();

        return temperatura;
    }

    public static void febre(float temperatura){
        if(temperatura >= 37){
            System.out.println("Você está com febre!");
        }
        else{
            System.out.println("Você não está com febre!");
        }
    }

    public static void main(String[] args) {
        float temperatura = temperatura();
        febre(temperatura);
    }
}