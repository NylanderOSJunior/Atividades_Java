import java.util.Scanner;
public class Ativislide {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int veta[]={45,56,12,43,95,19,8,67};
        int vetb[]={8,12,19,43,45,56,67,95};
        int vetc[]={95,67,56,45,19,12,8};
        int vetd[]={19,12,8,45,43,56,67,95};
        final int k=3;
        int j, i, c, h=1, value, comph, compi;
        c=0;
        comph=0;
        compi=0;
        do{
            h=k*h+1;
        }
        while(h<veta.length);

        do{
            h=h/k;
            comph= comph+1;
            for(i=h; i<veta.length;i++){
                value=veta[i];
                j=i-h;
                while((j>=0) && (value<veta[j])){
                    veta[j+h]=veta[j];
                    compi= compi+1;
                    j=j-h;
                }
                veta[j+h]= value;
                
            }
            System.out.println("compi"+compi);
            System.out.println("comph"+comph);
        }
        while(h != 1);
            for( c=0;c<veta.length;c++){
                System.out.println("\t" + veta[c]);
            }

            while(h<vetb.length);

        do{
            h=h/k;
            comph= comph+1;
            for(i=h; i<vetb.length;i++){
                value=vetb[i];
                
                j=i-h;
                while((j>=0) && (value<vetb[j])){
                    vetb[j+h]=vetb[j];
                    compi= compi+1;
                    j=j-h;
                }
                vetb[j+h]= value;
                
            }
            System.out.println("compi"+compi);
            System.out.println("comph"+comph);
        }
        while(h != 1);
            for( c=0;c<vetb.length;c++){
                System.out.println("\t" + vetb[c]);
            }

            while(h<vetc.length);

        do{
            h=h/k;
            comph= comph+1;
            for(i=h; i<vetc.length;i++){
                value=vetc[i];
                
                j=i-h;
                while((j>=0) && (value<vetc[j])){
                    vetc[j+h]=vetc[j];
                    compi= compi+1;
                    j=j-h;
                }
                vetc[j+h]= value;
                
            }
            System.out.println("compi"+compi);
            System.out.println("comph"+comph);
        }
        while(h != 1);
            for( c=0;c<vetc.length;c++){
                System.out.println("\t" + vetc[c]);
            }

            while(h<vetd.length);

        do{
            h=h/k;
            comph= comph+1;
            for(i=h; i<vetd.length;i++){
                value=vetd[i];
                compi= compi+1;
                j=i-h;
                while((j>=0) && (value<vetd[j])){
                    vetd[j+h]=vetd[j];
                    j=j-h;
                }
                vetd[j+h]= value;
                
            }
            System.out.println("compi"+compi);
            System.out.println("comph"+comph);
        }

        while(h != 1);
            for( c=0;c<vetd.length;c++){
                System.out.println("\t" + vetd[c]);
            }
        }
    
    }
