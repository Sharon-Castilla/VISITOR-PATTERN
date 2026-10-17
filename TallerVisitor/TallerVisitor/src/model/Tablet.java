package model;

import visitor.Visitante;

public class Tablet extends ProductoBase {

    public Tablet() {
        super("Tablet", 200, 250);
    }


    @Override
    public void aceptar(Visitante v) {
        v.visitar(this);
    }
}
