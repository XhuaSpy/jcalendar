/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jcalendar.modelo;


import java.util.Calendar;

/**
 *Permite crear una instacia de tipo Fecha con los siguientes datos:
 * dd,mm,aa
 * @author Juan Rodriguez
 */
public class Fecha {
     /**
     * Atributo de Fecha que almacena el dia.
     */
    private int dd;
     /**
     * Atributo de Fecha que almacena el mes.
     */
    private int mm;
     /**
     * Atributo de Fecha que almacena el año.
     */
    private int aa;

    /**
     *Constructor basico que crea una instacia del la Fecha con datos  de una variable 
     *tipo calendar la cual extrae la fecha actual del sistema.
     */
    public Fecha() {
      Calendar Fecha=Calendar.getInstance();
        this.dd =Fecha.get(Calendar.DAY_OF_MONTH);
        this.mm =(Fecha.get(Calendar.MONTH)+1) ;
        this.aa =Fecha.get(Calendar.YEAR);
    }

    /**
     *Constructor parametrico que crea una instacia del la Fecha a partir de los siguientes datos:
     * @param dd representa el respectivo dia de la fecha
     * @param mm representa el respectivo mes de la fecha
     * @param aa representa el respectivo año de la fecha
     */
    public Fecha(int dd, int mm, int aa) {
        this.dd = dd;
        this.mm = mm;
        this.aa = aa;
    }

    /**
     *Retorna el dia de la fecha
     * @return int valor del dia
     */
    public int getDd() {
        return dd;
    }

    /**
     *Retorna el mes de la fecha
     * @return int valor del mes
     */
    public int getMm() {
        return mm;
    }

    /**
     *Retorna el año de la fecha
     * @return int valor del año 
     */
    public int getAa() {
        return aa;
    }

    /**
     *Asigna el dia de la fecha
     * @param dd  representa el respectivo dia de la fecha
     */
    public void setDd(int dd) {
        this.dd = dd;
    }

    /**
     *Asigna el mes de la fecha
     * @param mm representa el respectivo mes de la fecha
     */
    public void setMm(int mm) {
        this.mm = mm;
    }

    /**
     *Asigna el año de la fecha
     * @param aa representa el respectivo año de la fecha
     */
    public void setAa(int aa) {
        this.aa = aa;
    }

    /**
     *Retorna los datos del la Fecha en una cadena de caracteres
     * @return String Datos de la fecha
     */
    @Override
    public String toString() {
        return dd + "/" + mm + "/" + aa;
    }
    
    
}