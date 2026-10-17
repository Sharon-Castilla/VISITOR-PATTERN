package model;

import visitor.Visitante;

public class ComputadoraTorre extends ProductoBase {

    public ComputadoraTorre() {
        super("Computadora de torre", 600, 6000);
    }


    @Override
    public void aceptar(Visitante v) {
        v.visitar(this);
    }
}
