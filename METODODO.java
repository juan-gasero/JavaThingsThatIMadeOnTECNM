
package metododo;
import java.util.Scanner;
public class METODODO {

    
    public static void main(String[] args) {
        ventas();
    }

    private static void ventas() {
    Scanner Read= new Scanner(System.in);
    int precioleido, cantidad,Suma=0;
    cantidad=Read.nextInt();
        for (int i = 0; i < cantidad; i++) {
            System.out.println("DIME EL PRECIO DEL ARTITRIS "+i);
            precioleido=Read.nextInt();
            Suma=Suma+precioleido;
        }
        System.out.println("El TOTAL ES DE: "+Suma);
    }
    
    
}
