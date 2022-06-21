import java.util.Scanner;
public class Questao4{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int dia,noite,p,i,tempo;
        dia=3;
        noite=1;
        i=0;
        p=0;
        System.out.println("digite o tempo em dias");
        tempo=sc.nextInt();
        for(i=0;i<tempo;i++){
            p=dia-noite;
            i+=p;
        }
        System.out.println("a minhoca subiu " +p+ "dias");
    }
}
