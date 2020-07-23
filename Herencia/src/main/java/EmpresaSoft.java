import java.util.ArrayList;
import java.util.Scanner;

public class EmpresaSoft {
    public static void main(String[] args) {
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
        Scanner input = new Scanner(System.in);

        int opcion = 0;
        System.out.println("****Bienvenido****");
        while (opcion != 4) {
            System.out.println("1- Ingresar tester");
            System.out.println("2- Ingresar Desarrollador");
            System.out.println("3- Ver empleado");
            System.out.println("4- Sair");
            opcion = input.nextInt();
            if (opcion == 1) {
                System.out.println("Ingrese nombre del tester");
                String nombre = input.next();

                Empleado tester = new Tester(nombre, 633, 17263, true, false);
                listaEmpleados.add(tester);
            } else if (opcion == 2) {
                System.out.println("Ingrese nombre del desarrollador");
                String nombreDesarrollador = input.next();
                Empleado dev = new Developer(nombreDesarrollador, 639983, 108263, "C++");
                listaEmpleados.add(dev);
            }else if (opcion == 3) {
                imprimirEmpleados(listaEmpleados);

            } else {
                System.out.println("Chauu");
            }
            System.out.println("********");

        }
       /* // Aqui entraria t2 cuando pongo el nombre
        System.out.println("Ingrese su nombre");
        String nombre = input.nextLine();

        System.out.println("Ingrese 1 si es tester manual, ingrese 2 si no lo es");
        opcion = input.nextInt();

        boolean esTesterManual;
        if(opcion==1)

        {
            esTesterManual = true;
        }else

        {
            esTesterManual = false;
        }
        System.out.println("Ingrese 0 si es tester automatizador, ingrese 1 si no lo es");
        int opcionAutomatizador = input.nextInt();

        boolean esTesterAutomatizador;
        if(opcionAutomatizador==0)

        {
            esTesterAutomatizador = true;
        }else

        {
            esTesterAutomatizador = false;
        }

        //Dos manereas de hacer lo mismo, solo que el nombre en t2 lo mando a pedir por teclado.
        Empleado t1 = new Tester("Carol", 123, 15000, true, false);


        //4Empleado t2= new Tester( nombre,1234, 10000,false,true);
        System.out.println(t2);

        Empleado t3 = new Developer("Daniel", 1212, 18000, "Java");

        listaEmpleados.add(t3);
        imprimirEmpleados(listaEmpleados);
        */

    }

    //Cada empleado q se encuentre en la lista e imprimilo
        private static void imprimirEmpleados(ArrayList<Empleado>listaEmpleados){
            System.out.println("***Lista de Empleados*****");
            if (listaEmpleados.isEmpty()) {
                System.out.println("La lista esta vacia");
            }else{
                for (Empleado e : listaEmpleados) {
                    System.out.println(e);
                }
            }

    }

}
