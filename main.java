package proyecto.final1;

import java.util.Scanner;

/**
 *
 * @author Alex Gallardo
 */
public class ProyectoFinal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);        
        int vector[]=new int [100];
        int i=0,j,aux;
        System.out.println("Vector aleatorio:");
            vector[i]=(int)(Math.random()*10);
                for(i=1;i<100;i++){
                    vector[i]=(int)(Math.random()*10);}
                        for(i=0;i<100;i++){
                        System.out.print(" "+vector[i]);}
                           for (i=0;i<100;i++){
                            for(j=0;j<99;j++)
                                {
                            if (vector[j]>vector[j+1])
                                {
                aux=vector[j];
                vector[j]=vector[j+1];
                vector[j+1]=aux;
            }
            
        }
                           }
        System.out.println();
        System.out.println();
        System.out.println("Vector Ordenado:");
        
        for(i=0;i<100;i++)
        {
        System.out.print(" "+vector[i]);    
        
        }
        System.out.println();
        System.out.println("Dame el numero a buscar:");
        int x,t=0,p;
        x=leer.nextInt();
        
        for(i=0;i<100;i++)
            if (x==vector[i]){
            t++;
            }
        System.out.println("Encontrado:"+t); }
        }
