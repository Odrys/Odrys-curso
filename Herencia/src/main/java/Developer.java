public class Developer extends Empleado{
    private String lenguaje;
    public Developer(String unNombre, int unTelefono, float unSueldo,String unLenguaje){
        super(unNombre,unTelefono,unSueldo);
        this.lenguaje=unLenguaje;
    }
    public String getLenguaje(){
        return this.lenguaje;
    }

    public void setLenguaje(String unlenguaje) {
        this.lenguaje = lenguaje;
    }
    public String toString(){
        return super.toString() + ",su lenguaje es " + this.getLenguaje();
    }
}


