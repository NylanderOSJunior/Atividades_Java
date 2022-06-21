import java.util.Scanner;

public class Questao8 {
public static void main(String[] args){
    //Declarar variaveis
    int A, B, A1, B1;
    //Declarar entrada de dados
    Scanner sc =new Scanner(System.in);
    //Entrada
    System.out.print("Digite o valor de A = ");
    A= sc.nextInt();
    System.out.print("Digite o valor de B = ");
    B= sc.nextInt();
    //calculo matematicos
    A1= B;
    B1= A;
    //Saida
    System.out.println("Valor de A = " + A);
    System.out.println("Valor de B = " + B);
    System.out.println("Valor da A trocado = " + A1);
    System.out.println("Valor de B trocado = " + B1);
}
}
