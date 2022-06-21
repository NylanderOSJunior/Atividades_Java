import java.util.Scanner;
public class Cafe1{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        boolean cafe;
        int temp;
        cafe=false;
        temp=25;
        do{
            temp++;
            if(temp>99){
                cafe= true;
                System.out.println("temperatura"+temp);
                System.out.println("agua pronta");
            }
        }
        while(!cafe);
        System.out.println("coloque po e acucar");
        System.out.println("cafe pronto para beber");
            }
        }