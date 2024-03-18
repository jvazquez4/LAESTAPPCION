/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

public class Promocion {
    private int idPromocion;
    private String nombre;
    private double descuento;

    public Promocion(int idPromocion, String nombre, double descuento) {
        this.idPromocion = idPromocion;
        this.nombre = nombre;
        this.descuento = descuento;
    }

    public int getIdPromocion() {
        return idPromocion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getDescuento() {
        return descuento;
    }
}
