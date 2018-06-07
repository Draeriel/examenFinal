package org.mvpigs.commandpattern.pedidos;

import org.mvpigs.commandpattern.interfaces.Pedido;

import static java.util.UUID.randomUUID;

public class PedidoNacional implements Pedido {

    private String destino = "";
    private String instrucciones = "";
    private int peso = 0;
    private String id = "";

    public PedidoNacional(String destino, int peso) {
        this.destino = destino;
        this.peso = peso;
        id = randomUUID().toString();
    }

    public int peso() {
        return peso;
    }

    public String destino() {
        return destino;
    }

    public String getId() {
        return id;
    }
}