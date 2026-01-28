
package com.mycompany.mavenproject2;
import java.util.Scanner;
public class Mavenproject2 {

    public static void main(String[] args) {
int v1[]= new int [11];
        entrada(v1);
        producto(v1);
        
     
    }


    private static void producto(int v1[]) {
int prod=1;
        for (int i = 0; i < 11; i++) {
            prod=prod*v1[i];
        }System.out.println("Producto= "+prod);
        }

   private static int maximo(int v1[], int acum) {
    int mayonesa=0;
       for (int i = 1; i <acum; i++) {
           if (v1[i]>mayonesa) {
               mayonesa=v1[i];
           }
       }
       System.out.println("EL ELEMENTO MAYOR ES IGUAL A "+mayonesa);
       return mayonesa;
    }

    private static void entrada(int v1[]) {
System.out.println("LEE LOCO LEE");
        int acum=0, n=0;
        Scanner LEER= new Scanner(System.in);
        do {
            System.out.println("da -1 para acabar ");
            n=LEER.nextInt();
            if (n!=-1) {
                v1[acum]=n;
                acum++;
            }
        } while (n!=-1 && acum<11);
        for (int j = 0; j < 11; j++) {
            System.out.println("VALOR DE i : "+ v1[j]);
        }System.out.println("NUMEROS LEIDOS: "+acum);  
    maximo(v1,acum);
    }
}
