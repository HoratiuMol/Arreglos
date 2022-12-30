import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        //String[] productos = new String[7];


        String[] productos={"Kinkston pendrive 64GB","Samsung Galaxy", "Disco Duro SSD"
        ,"Asus Notebook","Macbook air","ChromeCast 4ta Gen","Bicicleta oxford"};

        /*productos[0] = "Kinkston pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook air";
        productos[5] = "ChromeCast 4ta Gen";
        productos[6] = "Bicicleta oxford";*/

        int total= productos.length;

        Arrays.sort(productos); //ordenarsiempre antes de mostrar o iterrar lo elementos

        System.out.println("=======usando for=======");
        for (int i = 0; i < total; i++) {

            System.out.println("para indice " + i + " : " + productos[i]);
        }

        System.out.println("Usando for inverso");
        for(int i=0;i<total;i++){
            System.out.println("para i = " + (total-1-i) + " valor: " + productos[total-1-i]);
        }

        System.out.println("===usando for inverso 2===");
        for(int i=total - 1; i>=0;i--){
            System.out.println("Para i = " + i + " valor" + productos[i]);
        }

    }
}
