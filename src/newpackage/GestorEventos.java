/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.util.ArrayList;

public class GestorEventos {
    private ArrayList<Evento> eventos;

    public GestorEventos() {
        eventos = new ArrayList<>();
    }

    public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    public void eliminarEvento(int idEvento) {
        eventos.removeIf(e -> e.getIdEvento() == idEvento);
    }

    public void listarEventos() {
        for (Evento evento : eventos) {
            System.out.println("ID: " + evento.getIdEvento() + ", Nombre: " + evento.getNombre() + ", Fecha: " + evento.getFecha());
        }
    }
}
