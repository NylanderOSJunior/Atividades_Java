import java.util.Scanner;

public class Matriz6 {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		int veta[][] = new int [5][7];
		int i,j,maior,menor,linha,coluna;
		maior = 0;
		menor = 51;
		linha = 0;
		coluna = 0;
		for(i = 0 ; i < 5 ; i++) {
			for (j = 0 ; j < 7 ; j++) {
				veta[i][j] = (int)Math.round(Math.random() * 50);
			}
		}
		System.out.println("matriz: ");
		for (i = 0 ; i < 5 ; i++){
			for (j = 0 ; j <7; j++) {
				System.out.print(veta[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		for (i = 0 ; i < 5 ; i++) {
			menor = 51;
			for (j = 0 ; j < veta[i].length ; j++) {
				if (veta[i][j] < menor) {
					menor = veta[i][j];
					linha = i;
				}
			}
			System.out.println("menor da linha " + (i + 1) + "é :");
			System.out.println(menor);
		}
		
		for (j = 0 ; j < (7 + 2) ; j++) {
			maior = 0;
			for (i = 0 ; i < 5 ; i++) {
				if(veta[i][j] > maior) {
					maior = veta[i][j];
					coluna = j;
				}
				
			}
			System.out.println("maior da coluna " + (j + 1) + "é :");
			System.out.println(maior);
		}
		
		
		if (menor == maior) {
			System.out.println(" ponto de sela " + maior + " encontra-se na linha " + linha + "coluna " + coluna + ", ");  
		}
		else {
			System.out.println("a matriz não possui ponto de sela");
		}
		
		
		
	}
}