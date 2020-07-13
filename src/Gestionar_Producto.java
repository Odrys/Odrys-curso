import kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider;
class GestionProductos {
    public static void main (String args[]){
        Producto p1 = new Producto();
        p1.setNombre("leche");
        p1.setCodigo(1);
        p1.setImportado(true);
        p1.setNroLote("primero");
        p1.setNroProducto(11);
        System.out.println("El nombre de p1 es " + p1.getNombre());
        System.out.println("El codigo de p1 es " + p1.getCodigo());
        System.out.println("p1 es importado " + p1.getImportado());
        System.out.println("El NroLote de p1 es " + p1.getNroLote());
        System.out.println("El Nro de p1 es " + p1.getNroProducto());

        /*Producto p2 = new Producto();
        p2.setNombre("Arroz");
        p2.setCodigo(2);
        p2.setImportado(false);
        p2.setNroLote("segundo");
        p2.setNroProducto(22);
        System.out.println("El nombre de p2 es " + p2.getNombre());
        System.out.println("El codigo de p2 es " + p2.getCodigo());
        System.out.println("El p2 es importado " + p2.getImportado());
        System.out.println("El NroLote de p2 es " + p2.getNroLote());
        System.out.println("El Nro de p2 es " + p2.getNroProducto());*/

        /*Producto p3 = new Producto();
        p3.setNombre("Yogurt");
        p3.setCodigo(3);
        p3.setImportado(false);
        p3.setNroLote("tercero");
        p3.setNroProducto(33);
        System.out.println("El nombre de p3 es " + p3.getNombre());
        System.out.println("El codigo de p3 es " + p3.getCodigo());
        System.out.println("El p3 es importado " + p3.getImportado());
        System.out.println("El NroLote de p3 es " + p3.getNroLote());
        System.out.println("El Nro de p3 es " + p3.getNroProducto());*/


        Producto p4= new Producto("Papa", 4, false,"Cuarto", 44);
        System.out.println(p4);

        Producto p5= new Producto("Queso", 5, true,"Quinto", 55);
        System.out.println(p5);


    }
}
