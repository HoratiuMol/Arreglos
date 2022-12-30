import java.util.Arrays;
import java.util.Collections;

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

    public static void main(String[] args) {

        //String[] productos = new String[7];


        String[] productos={"Kinkston pendrive 64GB","Samsung Galaxy", "Disco Duro SSD"
        ,"Asus Notebook","Macbook air","ChromeCast 4ta Gen","Bicicleta oxford"};

        int total= productos.length;
        int contador=0;
        
        for(int i =0;i<total;i++){
            for(int j=0;j<total;j++){
                if(productos[i].compareTo(productos[j]) <0 ){
                    String auxiliar=productos[i];
                    productos[i]=productos[j];
                    productos[j]=auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);

        

        //Arrays.sort(productos); //ordenarsiempre antes de mostrar o iterrar lo elementos
        //arregloinverso(productos);

       // Collections.reverse(Arrays.asList(productos)); //convierte el arreglo en tipo lista y luego nos lo devuelve al revers

        System.out.println("=======usando for=======");

        for (int i = 0; i < total; i++) {

            System.out.println("para indice " + i + " : " + productos[i]);
        }

    }
}
