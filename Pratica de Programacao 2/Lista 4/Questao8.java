import java.util.Scanner;
    public class Questao10 {
        public static void main (String[] args){     
Scanner sc= new Scanner (System.in);
int veta[][]= new vet [8][8];
int i,j;
i=0;
j=0;
for (i=0;i<8;i++){
    for(j=0;j<8;j++){
        veta[i][j]=sc.nextInt();
    }
}
if(veta[i][j]==veta[j][i]){
    system.out.println(" Matriz Simentrica");
}
else{
    system.out.println(" Matriz não Simetrica");
}
        }
    }