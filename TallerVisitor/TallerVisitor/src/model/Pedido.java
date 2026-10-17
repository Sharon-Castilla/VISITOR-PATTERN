package model;

import java.util.ArrayList;
import java.util.List;

import visitor.CalculadorEnvioVisitor;
import visitor.CalculadorSubtotalVisitor;
import visitor.Visitante;

public class Pedido {
    private List<Producto> productos = new ArrayList<>();

    public void agregar(Producto p, int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor que 0");
        }
        for (int i = 0; i < cantidad; i++) {
            productos.add(p);
        }
    }


    public void aceptar(Visitante v) {
        for (Producto p : productos) {
            p.aceptar(v);
        }
    }


    public double calcularSubtotal() {
        Visitante v = new CalculadorSubtotalVisitor();
        aceptar(v);
        return v.getResultado();
    }

    public double calcularEnvio() {
        Visitante v = new CalculadorEnvioVisitor();
        aceptar(v);
        return v.getResultado();
    }

    public double calcularTotal() {
        return calcularSubtotal() + calcularEnvio();
    }
}
