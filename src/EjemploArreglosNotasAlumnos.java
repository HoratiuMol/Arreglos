    import java.sql.SQLOutput;
    import java.util.Scanner;

    public class EjemploArreglosNotasAlumnos {

        public static void main(String[] args) {

            double[] claseMatematicas, claseHistoria, claseLenguaje;
            double sumNotasMatematicas=0, sumNotasHistoria=0, sumNotasLengua=0;
            claseMatematicas = new double[7];
            claseLenguaje = new double[7];
            claseHistoria = new double[7];

            Scanner s=new Scanner(System.in);

            System.out.println("Ingrese las notas de matemáticas");
    for(int i=0; i<claseMatematicas.length;i++){
        claseMatematicas[i]=s.nextDouble();
    }

            System.out.println("Ingrese las notas de lenguaje");

            for(int i=0; i<claseLenguaje.length;i++){
                claseLenguaje[i]=s.nextDouble();
            }

            System.out.println("Ingrese las notas de Historia");

            for(int i=0; i<claseHistoria.length;i++){
                claseHistoria[i]=s.nextDouble();
            }

            for(int i=0; i<7;i++){
                sumNotasMatematicas +=claseMatematicas[i];
                sumNotasLengua += claseLenguaje[i];
                sumNotasHistoria += claseHistoria[i];
            }


            double promedioMatematicas=(sumNotasMatematicas/claseMatematicas.length);
            double promedioLengua=(sumNotasLengua/claseLenguaje.length);
            double promedioHistoria=(sumNotasHistoria/claseHistoria.length);

            System.out.println("Promedio clase matematcias " + promedioMatematicas);
            System.out.println("Promedio clase lengua " + promedioLengua);
            System.out.println("Promedio clase historia " + promedioHistoria);
            System.out.println("El promedio de la clase es: " + (promedioHistoria+promedioMatematicas+promedioLengua)/3);

            System.out.println("Ingrese el indentificador del alumno (d de 0 a 6) : ");

            int id=s.nextInt();
            double promedioAlumno = (claseHistoria[id]+claseMatematicas[id]+claseHistoria[id])/3;
            System.out.println("promedioAlumno " + id + " = " + promedioAlumno);

        }
    }
