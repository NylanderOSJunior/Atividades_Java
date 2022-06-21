//improtar um biblioteca
import java.util.Scanner;

public class Exercicio_7 {
	public static void main (String[] args) {
		//declaração de entrada de dados
		Scanner sc = new Scanner (System.in);

		//declarar variaveis
		float N, Calculo, Calculo1, Raiz, Raiz1;

		// declarar variaveis
		System.out.print("Digite o valor de N sendo ele positivo e maior que zero");
		N = (float)sc.nextFloat();

		//operações matamaticas

		//Exponenciação
		Calculo = (float)Math.pow(N,2);
		Calculo1 = (float)Math.pow(N,3);

		//Raiz 
		Raiz = (float) Math.sqrt(N);
		Raiz1 = (float) Math.cbrt(N);

		// saida de variaveis
		System.out.println("O valor Calculo é" + Calculo);
		System.out.println("O valor Calculo1 é" + Calculo1);
		System.out.println("O valor Raiz é" + Raiz);
		System.out.println("O valor Raiz1 é" + Raiz1);
	}
}