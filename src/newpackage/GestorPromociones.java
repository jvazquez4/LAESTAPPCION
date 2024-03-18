/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.util.ArrayList;

public class GestorPromociones {
    private ArrayList<Promocion> promociones;

    public GestorPromociones() {
        promociones = new ArrayList<>();
    }

    public void agregarPromocion(Promocion promocion) {
        promociones.add(promocion);
    }

    public void eliminarPromocion(int idPromocion) {
        promociones.removeIf(p -> p.getIdPromocion() == idPromocion);
    }

    public void listarPromociones() {
        for (Promocion promocion : promociones) {
            System.out.println("ID: " + promocion.getIdPromocion() + ", Nombre: " + promocion.getNombre() + ", Descuento: " + promocion.getDescuento() + "%");
        }
    }
}
