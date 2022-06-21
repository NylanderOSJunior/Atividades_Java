//improtar um biblioteca
import java.util.Scanner;

public class Exercicio_5 {
public static void main (String[] args) {

//declarar variaveis
int N1, N2, N3, N4, N5, N6;

//declaração de cadeia de caracteres e atrbuir um valor
String nome1, nome2;


//declaração de entrada de dados
Scanner sc = new Scanner (System.in);

//declararção de variaveis
System.out.println("digite um nome1: ");
nome1 = sc.nextLine();
System.out.print("Digite o valor de N1: ");
N1 = sc.nextInt();
System.out.print("Digite o valor de N2: ");
N2 = sc.nextInt();
System.out.print("Digite o valor de N3: ");
N3 = sc.nextInt();
System.out.print("digite um nome2: ");
nome2 = sc.next();
System.out.print("Digite o valor de N4: ");
N4 = sc.nextInt();
System.out.print("Digite o valor de N5: ");
N5 = sc.nextInt();
System.out.print("Digite o valor de N6: ");
N6 = sc.nextInt();

//comando de saida
System.out.println("nome1=" + nome1);
System.out.println("N1=" + N1);
System.out.println("N2=" + N2);
System.out.println("N3=" +N3);
System.out.println("media=" +((N1+N2+N3)/10));
System.out.println("nome2=" + nome2);
System.out.println("N4=" + N4);
System.out.println("N5=" + N5);
System.out.println("N6=" +N6);
System.out.println("media=" +((N4+N5+N6)/10));
}
}