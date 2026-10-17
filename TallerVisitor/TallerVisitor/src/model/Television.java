package model;

import visitor.Visitante;

public class Television extends ProductoBase {

    public Television() {
        super("Television", 300, 4000);
    }

    @Override
    public void aceptar(Visitante v) {
        v.visitar(this);
    }
}
