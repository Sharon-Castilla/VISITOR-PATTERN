package model;

import visitor.Visitante;

public class Portatil extends ProductoBase {

    public Portatil() {
        super("Computadora portatil", 400, 1000);
    }


    @Override
    public void aceptar(Visitante v) {
        v.visitar(this);
    }
}
