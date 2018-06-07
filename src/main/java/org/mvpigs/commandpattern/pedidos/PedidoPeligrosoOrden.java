package org.mvpigs.commandpattern.pedidos;

import org.mvpigs.commandpattern.interfaces.PedidoPeligroso;

public class PedidoPeligrosoOrden implements PedidoPeligroso{

    String destino = "";
    String instrucciones = "";
    int peso = 0;

    public PedidoPeligrosoOrden(String destino, String instrucciones) {
        this.destino = destino;
        this.instrucciones = instrucciones;
    }
    public String instrucciones() {
        return instrucciones;
    }
    public int peso() {
        return peso;
    }
    public String destino() {
        return  destino;
    }
}
