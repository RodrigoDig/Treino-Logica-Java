//Implementar uma função que calcule o IMC de uma pessoa e informe a classificação.

package pages.condicionais;
import java.util.Scanner;

class Exer26{

    static Scanner input = new Scanner(System.in);

    public static float[] vetorImc(){
        float[] imc = new float[2];

        return imc;
    }

    public static float[] pesoAltura(float[] imc){
        System.out.printf("Informe o seu peso: ");
        imc[0] = input.nextFloat();

        System.out.printf("Informe a sua altura: ");
        imc[1] = input.nextFloat();

        return imc;
    }

    public static float calculoImc(float[] imc){
        float calculoImc = imc[0] / (imc[1] * imc[1]);

        return calculoImc;
    }

    public static String imc(float calculoImc){
        String msg  = "";
        
        if(calculoImc < 16.9){
            msg = "Muito abaixo do peso!";
        }
        else if(calculoImc >= 17 && calculoImc <= 18.4){
            msg = "Abaixo do peso";
        }
        else if(calculoImc >= 18.5 && calculoImc <= 24.9){
            msg = "Peso normal";
        }
        else if(calculoImc >= 25 && calculoImc <= 29.9){
            msg = "Acima do peso";
        }
        else if(calculoImc >= 30 && calculoImc <= 34.9){
            msg = "Obesidade grau I";
        }
        else if(calculoImc >= 35 && calculoImc <= 40){
            msg = "Obesidade grau II";
        }
        else{
            msg = "Obesidade grau III";
        }

        return msg;
    }

    public static void impressao(String msg, float calculoImc){
        System.out.printf("IMC: %.2f\nVocê está %s", calculoImc, msg);
    }

    public static void main(String[] args) {
        float[] vetorImc = vetorImc();
        pesoAltura(vetorImc);
        float calculo = calculoImc(vetorImc);

        String msg = imc(calculo);

        impressao(msg, calculo);
    }
}

