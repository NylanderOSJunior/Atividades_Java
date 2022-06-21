import java.util.Scanner;
public class Questao1{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        String nome1, nome2, nome3;
        double valor1, valor2, valor3, calculo, total;

        System.out.println("Nome do corretor 1");
        nome1= sc.next();
        System.out.println("Valor das vendas 1");
        valor1= sc.nextDouble();
        System.out.println("Nome do corretor 2");
        nome2= sc.next();
        System.out.println("Valor das vendas 2");
        valor2= sc.nextDouble();
        System.out.println("Nome do corretor 3");
        nome3= sc.next();
        System.out.println("Valor das vendas 3");
        valor3= sc.nextDouble();

        if (valor1>50000){
            calculo= valor1*0.12;
            valor1= valor1+calculo;
            System.out.println("Comissao e: " +valor1);
        }
         else if ((valor1>=30000)&&(valor1<=50000)){
            calculo= valor1*0.095;
            valor1= valor1+calculo;
            System.out.println("comissao e: " +valor1);
        }
        else if(valor1<30000){
        calculo= valor1*0.07;
            valor1= valor1+calculo;
            System.out.println("comissao e: " +valor1);
        }


        if (valor2>50000){
            calculo= valor2*0.12;
            valor2= valor2+calculo;
            System.out.println("Comissao e: " +valor2);
        }
         else if ((valor2>=30000)&&(valor2<=50000)){
            calculo= valor2*0.095;
            valor2= valor2+calculo;
            System.out.println("comissao e: " +valor2);
        }
        else if(valor2<30000){
        calculo= valor2*0.07;
            valor2= valor2+calculo;
            System.out.println("comissao e: " +valor2);
        }


        if (valor3>50000){
            calculo= valor3*0.12;
            valor3= valor3+calculo;
            System.out.println("Comissao e: " +valor3);
        }
         else if ((valor3>=30000)&&(valor3<=50000)){
            calculo= valor3*0.095;
            valor3= valor3+calculo;
            System.out.println("comissao e: " +valor3);
        }
        else if(valor3<30000){
        calculo= valor3*0.07;
            valor3= valor3+calculo;
            System.out.println("comissao e: " +valor3);
        }
        total= valor1+valor2+valor3;
        System.out.println("Valor total= "+ total);    
    }
}