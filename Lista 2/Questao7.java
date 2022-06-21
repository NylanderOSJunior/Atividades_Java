import java.util.Scanner;

public class Questao7 {
public static void main(String[] args){
    //Declarar variaveis
    float Salariominimo, Quantidadequilowats, Valorquilowats, Valorpago, Valorcomdesconto, Pagamentocomdesconto;
    //Declarar entrada de dados
    Scanner sc =new Scanner(System.in);
    // Entrada
    System.out.print("Valor salario minimo = ");
    Salariominimo= sc.nextFloat();
    System.out.print("quantidade de quilowats = ");
    Quantidadequilowats= sc.nextFloat();
    //claculos
    Valorquilowats= Salariominimo/5;
    Valorpago= Valorquilowats*Quantidadequilowats;
    Valorcomdesconto= (float) ((Valorpago / 100) * 0.15);
    Pagamentocomdesconto= Valorpago-Valorcomdesconto;
    //saida
    System.out.println("Valor do salario minimo = " + Salariominimo);
    System.out.println("Quantidade de quilowats = " + Quantidadequilowats);
    System.out.println("Valor por quilowats = " + Valorquilowats);
    System.out.println("Valor a ser pago = " + Valorpago);
    System.out.println("Valor do desconto = " + Valorcomdesconto);
    System.out.println("Valor pago com desconto = " + Pagamentocomdesconto);
}
}