package cuentas;

public class CCuenta {

    /**
     * Atributos clase CCuenta
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    public CCuenta()
    {
    }

    /**
     * inicializador clase CCuenta
     * @param nom nombre del titular de la cuenta
     * @param cue numero IBAN cuenta
     * @param sal cantidad de dinero que posee la cuenta
     * @param tipo tipo de interes que tiene la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * método que devuelve el estado de la cuenta
     * @return estado cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * método que permite ingresar una cantidad determinada de dinero a la cuenta
     * @param cantidad cantidad de dinero a introducir
     * @throws Exception si la cantidad introducida es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * método que permite retirar una cantidad determinada de dinero de la cuenta
     * @param cantidad
     * @throws Exception la cantidad introducida no puede ser negativa ni superior al saldo de la cuenta
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
