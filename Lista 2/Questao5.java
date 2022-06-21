import java.util.Scanner;

public class Questao5 {
public static void main(String[] args){
    //Declarar variaveis
    float Kilos, Grama1, Grama2, Totaldia, Acincodias;
    //Declarar entrada de dados
    Scanner sc =new Scanner(System.in);
    //Entrada
    System.out.print("insira um valor em Kilos");
    Kilos= sc.nextFloat();
    System.out.print("Gramas do gato 1= ");
    Grama1= sc.nextFloat();
    System.out.print("Grams do gato 2= ");
    Grama2= sc.nextFloat();
    //calculos
    Kilos= Kilos*1000;
    Totaldia= Grama1+Grama2;
    Acincodias= (Kilos-(Totaldia*5));

 System.out.println("O total de kilos é = "+ Kilos);
 System.out.println("Grama para o gato 1 é = "+ Grama1);
 System.out.println("Grama para o gato 2 é = "+ Grama2);
 System.out.println("O total de grama por dia é = "+ Totaldia);
 System.out.println("O total depois de 5 dias é = "+ Acincodias);
}
}