import java.util.Scanner;

public class Matriz13 {
	public static void main (String args[]) {	
	Scanner sc = new Scanner (System.in);
	Integer veta[][] = new Integer [4][5];
	Integer vetb[][] = new Integer [5][2];
	Integer vetc[][] = new Integer [4][2];
	Integer i,j,k;
		
		for(i = 0 ; i < veta.length ; i++) {
			for (j = 0 ; j < veta[i].length ; j++) {
				veta[i][j] = (int)Math.round(Math.random() * 10);
			}
		}
		System.out.println(" matriz a é: ");
		for (i = 0 ; i < veta.length ; i++){
			for (j = 0 ; j < veta[i].length ; j++) {
				System.out.print(veta[i][j] + "  ");
			}
			System.out.println("  ");
		}
		for(i = 0 ; i < vetb.length ; i++) {
			for (j = 0 ; j < vetb[i].length ; j++) {
				vetb[i][j] = (int)Math.round(Math.random() * 10);
			}
		}
		System.out.println(" matriz b é: ");
		for (i = 0 ; i < vetb.length ; i++){
			for (j = 0 ; j < vetb[i].length ; j++) {
				System.out.print(vetb[i][j] + "  ");
			}
			System.out.println("  ");
		}
		for (i = 0 ; i < vetc.length ; i++) {
			for (j = 0 ; j < vetc[i].length ; j++) {
				vetc[i][j] = ((veta[i][0] * vetb[0][j]) + (veta[i][1] * vetb[1][j]) + (veta[i][2] * vetb[2][j]) + (veta[i][3] * vetb[3][j]) + (veta[i][4] * vetb[4][j]));
			}
		}
		System.out.println(" matriz resultante é: ");
		for (i = 0 ; i < vetc.length ; i++){
			for (j = 0 ; j < vetc[i].length ; j++) {
				System.out.print(vetc[i][j] + "  ");
			}
			System.out.println("  ");
		}
	sc.close();
	}
}