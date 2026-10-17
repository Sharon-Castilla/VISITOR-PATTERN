package visitor;

import model.ComputadoraTorre;
import model.Portatil;
import model.Producto;
import model.Tablet;
import model.Television;

public class CalculadorEnvioVisitor implements Visitante {
    private double envio = 0;

    @Override
    public void visitar(Tablet tablet) { sumarEnvio(tablet); }

    @Override
    public void visitar(Portatil portatil) { sumarEnvio(portatil); }

    @Override
    public void visitar(ComputadoraTorre torre) { sumarEnvio(torre); }

    @Override
    public void visitar(Television tv) { sumarEnvio(tv); }


    private void sumarEnvio(Producto p) {
        double porcentaje = (p.getPeso() / 100) * 2;
        envio += p.getPrecio() * porcentaje / 100;
    }

    @Override
    public double getResultado() {
        return envio;
    }
}
