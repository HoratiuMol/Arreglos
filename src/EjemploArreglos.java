import java.lang.reflect.Array;
import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        String[] productos = new String[7];


        productos[0] = "Kinkston pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook air";
        productos[5] = "ChromeCast 4ta Gen";
        productos[6] = "Bicicleta oxford";

        int totalProductos= productos.length;

        Arrays.sort(productos); //ordenarsiempre antes de mostrar o iterrar lo elementos

        System.out.println("=======usando for=======");
        for (int i = 0; i < totalProductos; i++) {

            System.out.println("para indice " + i + " : " + productos[i]);
        } //for mientras se conozca el inicio y el final

        System.out.println("=======usando foreach=======");
        for (String prod : productos) {

            System.out.println("prod = " + prod);
        }

        System.out.println("=======usando while=======");
        int i=0;
        while (i < totalProductos){
            System.out.println("para indice " + i + " : " + productos[i]);
            i++;
        }//while se usa minetras se cumpla una condicion, no necesariamente se tiene que conocer el final

        System.out.println("=======usando do-while=======");
        int j=0;
        do{
            System.out.println("para indice " + i + " : " + productos[i]);
            i++;
        }while (j < totalProductos);

        int[] numeros = new int[10];

        int totalNumeros=numeros.length;

        for(int k = 0;k<totalNumeros;k++ ){
            numeros[k]=k*3;
        }//for para llenar el array


        for(int k = 0;k<totalNumeros;k++ ){
            System.out.println("totalNumeros = " + numeros[k]);
        }//for para mostrar los numeros



        /*String prod1=productos[0];
        String prod2=productos[1];
        String prod3=productos[2];
        String prod4=productos[3];
        String prod5=productos[4];
        String prod6=productos[5];
        String prod7=productos[6];

        System.out.println("productos[0] = " + prod1);
        System.out.println("productos[0] = " + prod2);
        System.out.println("productos[0] = " + prod3);
        System.out.println("productos[0] = " + prod4);
        System.out.println("productos[0] = " + prod5);
        System.out.println("productos[0] = " + prod6);
        System.out.println("productos[0] = " + prod7);*/
        



       /* numeros[0]=1;
        numeros[1]=Integer.valueOf("2");
        numeros[2]=(int) 3L;
        numeros[3]=-1;
        // no se ha de asignar mas que la cantidad maxima numeros[4]=5;

        int i=numeros[0];
        int j=numeros[1];
        int k=numeros[2];
        int l=numeros[numeros.length-1];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);*/


            }
}
