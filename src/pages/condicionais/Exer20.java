/*Implementar uma função que represente uma calculadora. 
A função deve receber dois valores numéricos mais o tipo da operação matemática que deve realizar nos valores e retornar o resultado do cálculo. 
As operações suportadas estão listadas abaixo, caso seja enviada uma operação diferente, um erro deve ser lançado com a mensagem: "Operação não suportada".
- Soma
- Subtração
- Multiplicação
- Divisão
- Potência */

package pages.condicionais;

import java.util.Scanner;
import java.lang.Math;

class Exer20{
    
    static Scanner input = new Scanner(System.in);

    public static float[] numeros(){
        float[] numeros = new float[2];

        return numeros;
    }

    public static String escolha(){
        System.out.printf("Informe a operação que deseja:\nSoma\nSubtração\nMultiplicação\nDivisão\nPotência");
        String operacao = input.next();

        return operacao;
    }

    public static float[] preencheNumeros(float[] numeros){
        System.out.println("Informe o primeiro número:");
        numeros[0] = input.nextFloat();

        System.out.println("Informe o segundo número:");
        numeros[1] = input.nextFloat();

        return numeros;
    }

    public static double operacao(float[] numeros, String operacao){
        
        double operador = 0;

        if(operacao.equalsIgnoreCase("Soma")){
            operador = numeros[0] + numeros[1];
        }
        else if(operacao.equalsIgnoreCase("Subtração")){
            operador = numeros[0] - numeros[1];
        }
        else if(operacao.equalsIgnoreCase("Multiplicação")){
            operador = numeros[0] * numeros[1];
        }
        else if(operacao.equalsIgnoreCase("Divisão")){
            operador = numeros[0] / numeros[1];
        }
        else if(operacao.equalsIgnoreCase("Potencia")){
            operador = Math.pow(numeros[0],numeros[1]);
        }
        else{
            System.out.println("Operação não suportada!!");
            return Double.NaN;
        }

        return operador;
    }

    public static void impressao(double operador, String operacao){
        System.out.printf("Operação: %s\nResultado = %.2f", operacao, operador);       
    }

    public static void main(String[] args) {
        float[] numeros = numeros();
        preencheNumeros(numeros);
        String escolha = escolha();

        double operacao = operacao(numeros, escolha);

        impressao(operacao, escolha);
    }
}