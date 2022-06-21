import java.util.Scanner;
public class Questao1{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int i,a,b,n,codigo;
        double modulo;
        i=0;
        System.out.println("digite o codigo: 1a,2b,3c,4d");
        codigo=sc.nextInt();
        switch (codigo){
            case 1:
            for(i=0;i<10;i++){
            System.out.println("digite o valor de a");
            a=sc.nextInt();
            System.out.println("digite o valor de b");
            b=sc.nextInt();
            modulo= a % b;
            System.out.println("a mod de b e"+modulo);
            }
            break;

            case 2:
            System.out.println("fim do programa");
            break;

            case 3:
            while(i<100){
                for(i=0;i<100;i++){
                    System.out.println("digite o valor de a");
                    a=sc.nextInt();
                    System.out.println("digite o valor de b");
                    b=sc.nextInt();
                    modulo=a % b;
                    System.out.println("a mod de b e"+modulo);
                    }
            }
            break;

            case 4:
            System.out.println("diggite o valor de N");
            n=sc.nextInt();
            for(i=0;i<n;i++){
                System.out.println("digite o valor de a");
                a=sc.nextInt();
                System.out.println("digite o valor de b");
                b=sc.nextInt();
                modulo=a % b;
                System.out.println("a mod de b e"+modulo);
                }
        }

        }
    }