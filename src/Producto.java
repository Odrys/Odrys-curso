public class Producto {
        // Atributos
        private String Nombre;
        private int Codigo;
        private boolean Importado;
        private String NroLote;
        private int NroProducto;
        private static int Identificador = 0;

        // Constructores sin parametros
        public Producto (){
            this.Nombre = "Desconocido";
            this.Codigo = 0;
            this.Importado = false;
            this.NroLote = "Desconocido";
            this.NroProducto = 0;
            Identificador ++;
        }
        // Constructores con parametros
        public Producto (String unNombre, int unCodigo, boolean esImportado, String unNroLote, int unNroProducto) {
            this.Nombre = unNombre;
            this.Codigo = unCodigo;
            this.Importado = esImportado;
            this.NroLote = unNroLote;
            this.NroProducto = unNroProducto;
            Identificador ++;
        }

        // Metodos de acceso y modificacion

        public String getNombre() {
            return this.Nombre;
        }

        public void setNombre(String unNombre) {
            this.Nombre = unNombre;
        }

        public int getCodigo() {
            return Codigo;
        }
        public void setCodigo ( int unCodigo){
            this.Codigo = unCodigo;
        }
        public boolean getImportado(){
            return this.Importado;
        }
        public void setImportado (boolean esImportado){this.Importado=esImportado;}
        public String getNroLote(){ return this.NroLote; }
        public void setNroLote (String unNroLote){ this.NroLote= unNroLote;}
        public int getNroProducto(){ return this.NroProducto; }
        public void setNroProducto(int unNroProducto){ this.NroProducto= unNroProducto; }

    public String toString () {
        Boolean Importado = this.getImportado();
        if (this.Importado == true) {
            System.out.println("Este producto es importado" );
        } else{ System.out.println("Este producto es nacional ");
        }
        return "El nombre del producto es  " + this.getNombre() + " , con un codigo " + this.getCodigo() +
                " , con numero de lote " + this.getNroLote() + " y el numero del producto es " + this.getNroProducto();
        }
}
