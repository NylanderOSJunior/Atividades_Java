import java.util.Scanner;

public class Exerc {
public static void main (String[] args) {

//declarar variaveis
int R;
double Area;

//declaração de entrada de dados
Scanner sc = new Scanner (System.in);

// declarar variaveis
System.out.print("Digite o valor de R");
R = sc.nextInt();

//operações matamaticas
//Area de uma circunferencia
Area = 3.14159 * Math.pow(R,2);

//comando de saida
System.out.println("R=" + R);
System.out.println("Area=" + Area);
}
}