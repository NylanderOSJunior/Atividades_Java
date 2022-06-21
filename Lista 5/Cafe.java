import java.util.Scanner;
public class Cafe{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int temp;
        boolean cafe;
        temp=25;
        cafe=false;
        while(!cafe){
            temp++;
            if(temp>99){
                cafe=true;
                System.out.println("Agua pronta");
            }
        }
        System.out.println("coloque o po e o acucar");
        System.out.println("cafe pronto para beber");
    }
}