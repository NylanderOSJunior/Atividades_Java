import java.util.Scanner;

public class Matriz14{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int vet[][] = new int[4][4];
		int i, j, linha, coluna , d_principal, d_secundaria;
		 linha = 0;
		 coluna = 0;
		 d_principal = 0;
		 d_secundaria = 0;

		for(i = 0; i < 4; i++) {
			for(j = 0; j < 4; j++) {
				vet[i][j] = sc.nextInt();
			}
		}
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 4; j++) {
			linha += vet[0][i];
			coluna += vet[i][0];
			if(i == j) {
				d_principal += vet[i][j];
			}
			d_secundaria += vet[i][3 - i];
			}
		}
		if((linha == coluna) && (linha == d_principal) && (linha == d_secundaria)) {
			System.out.println(" matriz é um cubo mágico");
        } 
        else {
			System.out.println(" matriz não é um cubo mágico");
		}
		
	sc.close();
	}
}