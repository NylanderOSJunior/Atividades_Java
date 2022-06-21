import java.util. Scanner;
public class Contador{
    public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    int i,total=0;
    for(i=1;i<101;i++){
        total +=i;
        System.out.println("soma dos valores"+total);
    }
    }
}