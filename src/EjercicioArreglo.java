import java.util.Random;
import java.util.Scanner;

public class EjercicioArreglo {
    public static void main (String []args){
        Scanner input =new Scanner(System.in);

        //Definir un arreglo de Double de 16 posiciones. Imprimir todos los valores del mismo.
        double[] arregloDoubles= new double[16];
        for(int i=0; i< arregloDoubles.length;i++){
            System.out.println(arregloDoubles[i]);
        }
        //Definir un arreglo de Booleanos con 9 posiciones. Imprimir todos los valores del arreglo.
        boolean[] arregloBoo= new boolean[9];
        for(int i=0; i< arregloBoo.length;i++){
            System.out.println(arregloBoo[i]);
        }
        //Crear un array de números de 100 posiciones, que contendrá los números del 1 al 100.
        // Obtener la suma de todos ellos y el promedio.
        Integer[] arregloNum= new Integer[2];
        int suma = 0;
        float promedio= suma /arregloNum.length ;

        for(int i=0; i< arregloNum.length;i++){
            System.out.println("Ingrese un numero ");
             int num =input.nextInt();
             suma= suma + num ;
        }
        System.out.println("La suma es " + suma);
        System.out.println("El promedio es " +  promedio );
        //Crear un array de booleanos con 10 posiciones llamado asientosLibres y colocar todos sus elementos en true.
        Boolean[]asientosLibres = new Boolean[10];
        for(int i=0; i< asientosLibres.length;i++) {
            asientosLibres[i] = true;
            System.out.println("Estan los asientos libres? " + asientosLibres[i]);
        }


    }
}
