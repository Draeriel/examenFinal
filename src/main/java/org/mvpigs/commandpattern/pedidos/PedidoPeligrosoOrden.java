package org.mvpigs.commandpattern.pedidos;

import org.mvpigs.commandpattern.interfaces.PedidoPeligroso;

import java.util.UUID;

import static java.util.UUID.randomUUID;

public class PedidoPeligrosoOrden implements PedidoPeligroso{

    private String destino = "";
    private String instrucciones = "";
    private int peso = 0;
    private String id = "";

    public PedidoPeligrosoOrden(String destino, String instrucciones) {
        this.destino = destino;
        this.instrucciones = instrucciones;
        generateUUID();
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

    private void generateUUID(){
        id = randomUUID().toString();
    }

    public String getId() {
        return id;
    }
}
