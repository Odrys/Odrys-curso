public class  Tester extends Empleado  {
    //Atributos
    private boolean testerManual;
    private boolean testerAutomatizador;

    //Constructor con parametros
    public Tester(String unNombre, int unTel, float unSueldo, boolean esManual, boolean esAutomatizador) {
        super(unNombre,unTel,unSueldo);

        //Metedos en la clase empleado
        /*this.setNombre(unNombre);
        this.setSueldo(unSueldo);
        this.setTelefono(unTel);*/

        this.testerManual = esManual;
        this.testerAutomatizador = esAutomatizador;
    }

    //Parametros get y set
    public boolean esTesterManual() {
        return this.testerManual;
    }

    public void setTesterManual(boolean esManual) {
        this.testerManual = esManual;
    }

    public boolean esTesterAutomatizador() {
        return this.testerAutomatizador;
    }

    public void setTesterAutomatizador(boolean esAutomatizador) {
        this.testerAutomatizador = esAutomatizador;
    }

    //Método toString con booleanos(q no retorne solo true or false)
    public String toString() {
        String retorno = "";
        retorno += "Nombre del empleado: " + super.getNombre();
        retorno += " Sueldo del empleado: " + super.getSueldo();
        retorno += " Telefono del empleado " + super.getTelefono();
        if (testerManual == true) {
            retorno += " Es tester manual";
        }
        if (testerAutomatizador == true) ;
        {
            retorno += " Es tester automatizador";
        }
        return retorno;
    }
}




