import java.util.Scanner;
public class Matriz1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int veta[][] = new int [6][4];
        int i, j;
        i=0;
        j=0;
        for(i=0;i<6;i++){
            for(j=0;j<4;j++){
                veta[i][j]=sc.nextInt();
                 if(veta[i][j]>30){
                   veta[i][j]=0;
            }
            }
        }
            for(i=0;i<6;i++){
                for(j=0;j<4;j++){
                    System.out.print(veta[i][j]+" ");
                }
                System.out.println(" ");
            }
        }
    
    }
