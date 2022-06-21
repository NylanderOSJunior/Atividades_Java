import java.util.Scanner;
public class Questao10{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        double dias, diaria;
        String cliente;
        System.out.println("Digite o nome do cliente");
        cliente= sc.next();
        System.out.println("Digite o quatantidade de dias no hotel");
        dias= sc.nextDouble();
        if(dias>15){
            diaria= (dias*90)+(dias*5.5);
            System.out.println("Nome do cliente"+ cliente);
            System.out.println("Valor a ser pago pelo cliente: "+ diaria);
        }
        else if(dias==15){
            diaria= (dias*90)+(dias*6);
            System.out.println("Nome do cliente"+ cliente);
            System.out.println("Valor a ser pago pelo cliente: "+ diaria);
        }
        else if(dias<15){
            diaria= (dias*90)+(dias*8);
            System.out.println("Nome do cliente"+ cliente);
            System.out.println("Valor a ser pago pelo cliente: "+ diaria);
        }
    }
}