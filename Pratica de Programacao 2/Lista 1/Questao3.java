import java.util.Scanner;
public class Questao3{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int a, b;
        double c,ab;
        a=1;
        b=2;
        ab=0;

        for(a=1;a<99;a++){
            c=a/b;
            System.out.println(+c);
            a=a+2;
            b=b+1;
            ab=ab+c;
        }
        System.out.println("soma "+ab);
    }
}