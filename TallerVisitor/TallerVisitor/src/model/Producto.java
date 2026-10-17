package model;

import visitor.Visitante;

public interface Producto {
    void aceptar(Visitante v);

    String getNombre();
    double getPrecio();
    double getPeso(); // en gramos
}
