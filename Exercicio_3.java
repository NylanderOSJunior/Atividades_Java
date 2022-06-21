//improtar um biblioteca
import java.util.Scanner;

public class Exercicio_3 {
public static void main (String[] args) {
	
//declarar variaveis
int A, B, C, D, E;

//declaração de entrada de dados
Scanner sc = new Scanner (System.in);

// declararção de variaveis
System.out.print("Digite o valor de A");
A = sc.nextInt();
System.out.print("Digite o valor de B");
B = sc.nextInt();
System.out.print("Digite o valor de C");
C = sc.nextInt();
System.out.print("Digite o valor de E");
E = sc.nextInt();
System.out.print("Digite o valor de D");
D = sc.nextInt();

//comando de saida
System.out.println("A=" + A);
System.out.println("B=" + B);
System.out.println("C=" + C);
System.out.println("D=" +D);
System.out.println("E=" +E);
System.out.println("Resultado=" +(A+B+C));
System.out.println("Resultado=" +(D/E));
}
}