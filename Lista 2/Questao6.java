import java.util.Scanner;

public class Questao6 {
public static void main(String[] args){
    //Declarar variaveis
    float Altura, Tamanhododegrau, Quantidadedegraus;
    //Declarar entrada de dados
    Scanner sc =new Scanner(System.in);
    //Declarar entrada
    System.out.print("Altura desejada em metros = ");
    Altura= sc.nextFloat();
    System.out.print("Tamanho do degral em mertos = ");
    Tamanhododegrau= sc.nextFloat();

    //calculos matematicos
    Quantidadedegraus= Altura/Tamanhododegrau;

    //saida
    System.out.println("Altura desejada = " + Altura);
    System.out.println("Tamanho do degrau = " + Tamanhododegrau);
    System.out.println("Quantidade de degraus = " + Quantidadedegraus);
}
}



