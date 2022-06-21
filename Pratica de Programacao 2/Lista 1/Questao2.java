import java.util.Scanner;
public class Questao2{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n,menor,menorn,maior;
        System.out.println("digite um numero");
        n=sc.nextInt();

        maior=0;
        menor=0;
        menorn=n;
        while(n>0){
            if(n>maior){
                maior=n;
            }
            if(n<maior){
                menor=n;
            }
            if(n<menor){
                menorn=n;
            }
            System.out.println("digite o valor de n");
            n=sc.nextInt();
        }
        System.out.println("maior"+maior+ "menor "+menorn);
    }
}