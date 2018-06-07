package org.mvpigs.commandpattern.pedidos;

import org.mvpigs.commandpattern.interfaces.Pedido;

public class PedidoInternacional implements Pedido {
    private String destino = "";
    private int peso = 0;

    public PedidoInternacional(String destino, int peso) {
        this.destino = destino;
        this.peso = peso;
    }

    public int peso() {
        System.out.println("El peso del pedido es de " + peso + " onzas.");
        return peso;
    }

    public String destino() {
        System.out.println("El destino del pedido es a " + destino + ".");
        return destino;
    }
}
