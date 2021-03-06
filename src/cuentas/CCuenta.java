/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**
 * Clase CCuenta con métodos get/set para los datos de cuenta y métodos para conocer
 * el saldo actual, el tipo de interés, realizar ingresos o retirar dinero.
 *
 * @author carme
 */
public class CCuenta {

    /**
     * Devuelve el nombre
     * 
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el nombre 
     * 
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la cuenta
     * 
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Asigna la cuenta 
     * 
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el saldo de la cuenta
     * 
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Asigna el saldo de la cuenta
     * 
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el tipo de interés
     * 
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Asigna el tipo de interés
     * 
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Método constructor por defecto
     */
    public CCuenta() {
    }

    /**
     * Método que inicia las variables
     * 
     * @param nom nombre
     * @param cue cuenta
     * @param sal saldo
     * @param tipo tipo interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Devuelve el estado
     * 
     * @return 
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Ante un ingreso, comprueba que la cantidad a ingresar sea mayor a 0,
     * si no devuelve una excepción. Si cumple la condición, se actualiza el saldo.
     * 
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Ante una retirada de saldo, comprueba que no se intente retirar una cantidad superior
     * al saldo actual y que no sea una cantidad negativa, si no devuelve excepción.
     * Si cumple las condiciones y se retira saldo, se actualiza el saldo.
     * 
     * @param cantidad
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }
}
