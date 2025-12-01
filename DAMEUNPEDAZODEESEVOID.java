
package dameunpedazodeesevoid;
import java.util.Scanner;
public class DAMEUNPEDAZODEESEVOID {     
    int val1, val2, sum, res;
    public static void main(String[] args) {

    DAMEUNPEDAZODEESEVOID CHINGADERA= new DAMEUNPEDAZODEESEVOID();
               CHINGADERA.LEER();
               CHINGADERA.SUMAR();
               CHINGADERA.RESTAR();
               CHINGADERA.IMPRIMIR();
    }

    private void LEER() {
 Scanner READNIGGA= new Scanner(System.in);
        System.out.println("LEE PRIMER NUMERO");
 val1=READNIGGA.nextInt();
        System.out.println("LEE SEGUNDO NUMERO");
 val2=READNIGGA.nextInt();
    }


    private void RESTAR() {
     res=val1-val2;
    }

    private void IMPRIMIR() {
        System.out.println("RESULTANDO DE SUMA "+sum);
        System.out.println("RESULTANDO DE RESTA "+res);
    }

    private void SUMAR() {
        sum=val1+val2;
    }
    
}
