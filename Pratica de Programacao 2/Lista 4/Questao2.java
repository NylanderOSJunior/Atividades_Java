import java.util.Scanner;
public class Questao2{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int vetora[] = new int[10];
        int vetorb[] = new int[10];
        int uniao[] = new int[20];
        int i,j,n;
        i=0;
        n=0;
        for(i=0;i<10;i++){
            j=0;
            System.out.println("valor no vetor a: ");
            vetora[i]=sc.nextInt();
            while(vetora[i]!=uniao[j]&&j<n){
                j++;
            }
                if(j>=n){
                    uniao[n]=vetora[i];
                    n++;
                }
            }
            for(i=0;i<10;i++){
                j=0;
                System.out.println("valor no vetor b: ");
                vetorb[i]=sc.nextInt();
                while(vetorb[i]!=uniao[j]&&j<n){
                    j++;
                }
                    if(j>=n){
                        uniao[n]=vetorb[i];
                        n++;
                    }
                }
        }
        }
    