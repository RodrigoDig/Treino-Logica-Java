/*Implementar uma função que avalie a temperatura corporal de uma pessoa a partir da sua temperatura. A função deve retornar uma classificação seguindo as orientações abaixo:
- Temperatura menor que 37 graus: "Temperatura normal"
- Temperatura até 37,5 graus: "Febrícula"
- Temperatura de 37,6 a 38,5: "Febre moderada"
- Temperatura acima de 38,5: "Febre alta" */

package pages.condicionais;
import java.util.Scanner;

class Exer29{

    static Scanner input = new Scanner(System.in);

    public static float temperatura(){
        System.out.printf("Informe a sua temperatura: ");
        float temperatura = input.nextFloat();

        return temperatura;
    }

    public static String classificacao(float temperatura){
        
        String msg = "";

        if(temperatura < 37){
            msg = "Temperatura normal";
        }
        else if(temperatura >= 37 && temperatura <= 37.5){
            msg = "Febrícula";
        }
        else if(temperatura >= 37.6 && temperatura <= 38.5){
            msg = "Febre moderada";
        }
        else{
            msg = "Febre alta";
        }

        return msg;
    }

    public static void impressao(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        float temp = temperatura();
        String msg = classificacao(temp);

        impressao(msg);
    }
}