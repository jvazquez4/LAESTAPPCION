/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

public class Evento {
    private int idEvento;
    private String nombre;
    private String fecha;

    public Evento(int idEvento, String nombre, String fecha) {
        this.idEvento = idEvento;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }
}
