//improtar um biblioteca
import java.util.Scanner;

public class Exercico_6 {
public static void main (String[] args) {

//declarar variaveis
float C, F;

//declaração de entrada de dados
Scanner sc = new Scanner (System.in);

// declarar variaveis
System.out.print("Digite o valor de C");
C = sc.nextInt();

//operações matamaticas
//Converção de temperatura
F = ((9*C+160)/5);

//comando de saida
System.out.println("C=" + C);
System.out.println("F=" + F);
}
}