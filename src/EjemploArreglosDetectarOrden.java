import java.util.Scanner;

public class EjemploArreglosDetectarOrden {
    public static void main(String[] args) {

        int[] a=new int[7];

        Scanner s=new Scanner(System.in);
        System.out.println("Ingrese 7 numerso");
        for(int i=0; i<a.length; i++){
            a[i]=s.nextInt();
        }

        boolean ascendete=false;
        boolean descendente=false;

        for(int i=0;i<a.length-1;i++){

            if(a[i]>a[i+1]){
                descendente=true;
            } else if (a[i]<a[i+1]){
                    ascendete=true;
            }
        }

        if(ascendete==true && descendente==true){
            System.out.println("Arreglo=desordenado");
        } else if (ascendete==false && descendente==true) {
            System.out.println("Arreglo = todos son iguales");
        } else if (ascendete==true && descendente==false) {
            System.out.println("Arreglo ascendente");
        } else if (ascendete==false && descendente==true) {
            System.out.println("arreglo descendte");

        }

    }
}
