import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class EjemploArreglosForOrdenamientoBurbuja {

    public static void arregloinverso(String[] arreglo){

        System.out.println("====usando ArregloInverso(String)====");
        int total=arreglo.length;
        int total2=arreglo.length;
        for(int i=0;i<total2;i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total - 1 - i];
            arreglo[i] = inverso;
            arreglo[total - 1 - i] = actual;
            total2--;
        }
    }

    public static void sortBurbuja(Object[] arreglo){

        int total = arreglo.length;
        int contador=0;


        for(int i =0;i<arreglo.length ;i++){

            for(int j=0;j< arreglo.length-1-i;j++){
                if( ((Comparable) arreglo[j+1]).compareTo(arreglo[j]) <0 ){
                    Object auxiliar=arreglo[i];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);
    }

    public static void main(String[] args) {

        //String[] productos = new String[7];


        String[] productos={"Kinkston pendrive 64GB","Samsung Galaxy", "Disco Duro SSD"
        ,"Asus Notebook","Macbook air","ChromeCast 4ta Gen","Bicicleta oxford"};

        int total= productos.length;
        sortBurbuja(productos);



        //Arrays.sort(productos); //ordenarsiempre antes de mostrar o iterrar lo elementos
        //arregloinverso(productos);

       // Collections.reverse(Arrays.asList(productos)); //convierte el arreglo en tipo lista y luego nos lo devuelve al revers

        System.out.println("=======usando for=======");

        for (int i = 0; i < total; i++) {

            System.out.println("para indice " + i + " : " + productos[i]);
        }


        Integer[] numeros = new Integer[4];

        numeros[0]=10;
        numeros[1]=Integer.valueOf("7");
        numeros[2]=35;
        numeros[3]=-1;

        sortBurbuja(numeros);

        for(int i=0;i<numeros.length;i++){
            System.out.println("i = " + i + " : " + numeros[i]);
        }
    }
}
