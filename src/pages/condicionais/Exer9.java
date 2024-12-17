/*Implementar uma função que retorne uma mensagem formatada com o valor das parcelas de uma compra, 
a partir do valor total da compra e da quantidade do parcelamento. Exemplo da mensagem de resposta: 
"Sua compra de R$ 1200 em 10x de R$ 120 foi concluída" */

package pages.condicionais;
import java.util.Scanner;

class Exer9{
   static Scanner input = new Scanner(System.in);

   public static int valorCompra(){
      System.out.printf("Informe o valor da sua compra:");
      int compra = input.nextInt();

      return compra;
   }

   public static int parcelas(){
      System.out.printf("Informe em quantas parcelas você quer pagar:");
      int parcelas = input.nextInt();

      return parcelas;
   }

   public static float valorParcelas(int parcelas, int compra){
      float valorParcela = compra / parcelas;

      return valorParcela;
   }

   public static void impressao(int compra, int parcela, float valorParcela){
      System.out.printf("Sua compra de R$ %d em %dx de R$ %.2f foi concluída", compra, parcela, valorParcela);
   }

   public static void main(String[] args) {
      int compra = valorCompra();
      int parcela = parcelas();
      float valorParcela = valorParcelas(parcela, compra);

      impressao(compra, parcela, valorParcela);
   }
}
