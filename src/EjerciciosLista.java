import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import java.util.ArrayList;
import java.util.Scanner;

public class EjerciciosLista {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(4);
        listaNumeros.add(5);
        imprimirListaEnteros(listaNumeros);

        if (esListaEnterosVacia(listaNumeros) == false) {
            int suma = obtenerSuma(listaNumeros);
            System.out.println("La suma es " + suma);
        } else {
            System.out.println("La lista esta vacia: la suma es 0");
        }

        float promedio = calcularPromedio(listaNumeros);
        System.out.println("El promedio es " + promedio);

        int min = obtenerMenor(listaNumeros);
        System.out.println("El menor numero de la lista es " + min);

        if (esListaEnterosVacia(listaNumeros)== false) {
            int max = obtenerMayor(listaNumeros);
            System.out.println("El mayor numero de la lista es " + max);
        } else {
            System.out.println("No hay numeros para comparar");
        }

        ArrayList<String> listaString = new ArrayList<String>();
        listaString.add("Amarillo");
        listaString.add("Azul");
        listaString.add("Violeta");
        listaString.add("Rojo");
        listaString.add("Blanco");
        imprimirListaString(listaString);

        ArrayList<Boolean>listaBooleanos=new ArrayList<Boolean>();
        listaBooleanos.add(true);
        listaBooleanos.add(true);
        listaBooleanos.add(true);
        imprimirlistaBooleanos(listaBooleanos);

        if(todosVerdaderos(listaBooleanos)== false) {
            System.out.println("No todos los elementos son verdaderos");
        }else{
            System.out.println("Todos los elementos son verdaderos");
        }

        ArrayList<Integer>valoresIngresados=listaLeerValores();
    }


    public static void imprimirListaEnteros(ArrayList<Integer>listaNumeros){
        System.out.println("Cantidad de numeros en la lista = " + listaNumeros.size());
        System.out.println(" La lista esta vacia?" + listaNumeros.isEmpty());
        for (int i = 0; i < listaNumeros.size(); i++) {
            System.out.println(listaNumeros.get(i));
        }
    }
    public static void imprimirListaString(ArrayList<String> listaString) {
        for (int i = 0; i < listaString.size(); i++) {
            System.out.println(listaString.get(i));
        }
    }
    public static void imprimirlistaBooleanos (ArrayList<Boolean>listaBooleanos) {
        for (int i = 0; i < listaBooleanos.size(); i++) {
            System.out.println(listaBooleanos.get(i));
        }
    }
    // Metodo que reciba una lista de enteros, y retorne cant elementos
    public static int cantidadElementos(ArrayList<Integer>listaNumeros){
        return listaNumeros.size();
    }

    // Metodo que reciba una lista de enteros, y retorne verdadero si y solo si la lista esta vacia
        public static boolean esListaEnterosVacia(ArrayList<Integer>listaEnteros){
        if (listaEnteros.isEmpty()==true){
            return true;
        }   else {
            return false;
            }
        }

    // Método que reciba una lista de enteros, y retorne la suma.
    public static int obtenerSuma(ArrayList<Integer>listaEnteros){
        int suma = 0 ;
        for (int i =0; i<listaEnteros.size();i++){
            suma= suma + listaEnteros.get(i);
        }
        return suma;

    }
    //Método que reciba una lista de enteros, y retorne el promedio de los  mismos.
    public static float calcularPromedio(ArrayList<Integer>listaNumeros){
        int sumaTotal= obtenerSuma(listaNumeros);
        float promedio = sumaTotal/ listaNumeros.size();
        return promedio;
    }
    //Método que reciba una lista de enteros, y retorne el menor.
    public static int obtenerMenor (ArrayList<Integer>listaNumeros){
        int min = Integer.MAX_VALUE;
        for (int i=0; i<listaNumeros.size(); i ++) {
            if (listaNumeros.get(i) < min) {
                min = listaNumeros.get(i);
            }
        }
        return min;
    }
    //Método que reciba una lista de enteros, y retorne el mayor.
    public static int obtenerMayor (ArrayList<Integer>listaNumeros) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < listaNumeros.size(); i++) {
            if (listaNumeros.get(i) > max) {
                max = listaNumeros.get(i);
            }
        }
        return max;
    }
        //Método que reciba una lista de booleanos, y verdadero si y sólo si, todos los elementos de
        // la lista son true. De lo contrario se debe retornar false. Sugerencia: utilizar cortocircuito.

    public static boolean todosVerdaderos(ArrayList<Boolean>listaBooleanos){
        for (int i =0 ; i < listaBooleanos.size(); i++) {
            if (listaBooleanos.get(i) == false) {
                return false;
            }
        }   return true;
    }
    //Método leerValores(): pide por teclado los números y los almacena en el ArrayList.
    // La lectura acaba cuando se introduce el valor -99.El método devuelve mediante return el ArrayList con los valores introducidos.

    private static ArrayList<Integer>listaLeerValores() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        System.out.println("Ingrese los numero");
        int num = 0;
        while (num != 99) {
            num = input.nextInt();
            listaNumeros.add(num);
        }return listaNumeros;
    }
}





