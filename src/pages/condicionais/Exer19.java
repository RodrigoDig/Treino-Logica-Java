/*
-Implementar uma função que informe qual é o tipo do triângulo: Isóceles, Escaleno ou Equilátero baseado em seus três lados.
-Implementar uma função que verifique, sim ou não, se uma data informada é válida. As informações da data devem vir separadas por dia, mês e ano no formato numérico. */
package pages.condicionais;

import java.util.Scanner;

class Exer19{
    
    static Scanner input = new Scanner(System.in);

    public static float[] triangulo(){
        float[] triangulo = new float[3];

        return triangulo;
    }

    public static float[] ladosTriangulo(float[] triangulo){

        System.out.printf("Informe o lado1 do triângulo: ");
        triangulo[0] = input.nextFloat();

        System.out.printf("Informe o lado2 do triângulo: ");
        triangulo[1] = input.nextFloat();

        System.out.printf("Informe o lado3 do triângulo: ");
        triangulo[2] = input.nextFloat();

        return triangulo;
    }

    public static String qualTriangulo(float[] triangulo){
        String msg = "";

        if(triangulo[0] == triangulo[1] && triangulo[0] != triangulo[2] || triangulo[0] == triangulo[2] && triangulo[0] != triangulo[1] || triangulo[1] == triangulo[2] && triangulo[1] != triangulo[2] ){
            msg = "Triângulo ISÓCELES";
        }
        else if (triangulo[0] != triangulo[1] && triangulo[0] != triangulo[2] || triangulo[0] != triangulo[2] && triangulo[0] != triangulo[1] || triangulo[1] != triangulo[2] && triangulo[1] != triangulo[2] ) {
            msg = "Triângulo ESCALENO";
        }
        else{
            msg = "Triângulo EQUILÁTERO";
        }

        return msg;
    }

    public static void impressao(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        float[] triangulo = triangulo();
        ladosTriangulo(triangulo);
        String msg = qualTriangulo(triangulo);

        impressao(msg);
    }
}  

class Data{

    static Scanner input = new Scanner(System.in);

    public static int[] calendario(){
        int[] calendario = new int[3];

        return calendario;
    }

    public static int[] diaMesAno(int[] calendario){

        System.out.printf("Informe o dia:");
        calendario[0] = input.nextInt();

        System.out.printf("Informe o mês:");
        calendario[1] = input.nextInt();

        System.out.printf("Informe o ano:");
        calendario[2] = input.nextInt();

        return calendario;
    }

    public static boolean validacao(int[] calendario){
        boolean valido = true;

        if(calendario[0] < 0 || calendario[0] > 31 || calendario[1] < 0 || calendario[1] > 12 || calendario[2] < 0){
            valido = false;
        }
        else{
            valido = true;
        }

        return valido;
    }

    public static void impressao(boolean validacao, int[] calendario) {
        if(validacao == true){
            System.out.println("\n" + validacao + "\nA data é válida\n"+ calendario[0] + "/" + calendario[1] + "/" + calendario[2]);
        }
        else{
            System.out.println("\n" + validacao + "\nA data é inválida"+ calendario[0] + "/" + calendario[1] + "/" + calendario[2]);
        }
    }

    public static void main(String[] args) {
        int[] calendario = calendario();
        diaMesAno(calendario);

        boolean validacao = validacao(calendario);
        impressao(validacao, calendario);
    }
}