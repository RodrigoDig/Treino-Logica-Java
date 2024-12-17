/*5. Implementar uma função para calcular o salário líquido de um funcionário, a partir de seu salário base, do bônus mensal (em %) e do total de descontos.
Ex: Para os valores:
-> Salário: 1000 reais
-> Bônus: 10 porcento
-> Descontos: 300 reais

O resultado será:
-> 800 */

package pages.condicionais;
import java.util.Scanner;

class Exer5{
    static Scanner input = new Scanner(System.in);

    public static int salario(){
        System.out.printf("=-=-=-PROGRAMA SALÁRIO MINÍMO-=-=-=\n");

        System.out.printf("Informe o salário: ");
        int salario = input.nextInt();

        return salario;
    }

    public static float bonus(int salario){
        System.out.printf("Informe a porcentagem do seu bônus: ");
        float valorBonus = input.nextFloat();

        float bonus = salario * valorBonus /100;

        return bonus;
    }

    public static int desconto(){
        System.out.printf("Informe o valor do desconto de seu salário: ");
        int desconto = input.nextInt();

        return desconto;
    }

    public static float salarioLiquido(int desconto, int salario, float bonus){
        float salarioLiquido = salario + bonus - desconto;

        return salarioLiquido;
    }

    public static void impressao(int desconto, int salario, float bonus, float salarioLiquido){
        System.out.printf("Salário = %d\nBônus = %.2f\nDesconto = %d\nValor do salário a receber = R$%.2f", salario, bonus, desconto, salarioLiquido);
    }

    public static void main(String[] args) {
        int salario = salario();
        float bonus = bonus(salario);
        int desconto = desconto();
        float salarioLiquido = salarioLiquido(desconto, salario, bonus);

        impressao(desconto, salario, bonus, salarioLiquido);
    }
}