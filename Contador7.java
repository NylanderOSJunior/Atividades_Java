import java.util. Scanner;
public class Contador7{
    public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    int i,j=0;
    System.out.println("multiplos: %N");
    for(i=7;i<1000;i+=7){
        System.out.println(i+"%N");
        j++;
    }
    System.out.println("repeticoes:" +j);
}
}