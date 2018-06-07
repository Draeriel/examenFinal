package org.mvpigs.commandpattern.tratamientos;

import org.mvpigs.commandpattern.interfaces.Pedido;
import org.mvpigs.commandpattern.interfaces.TratamientoPedido;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TratamientoPedidoMultiple implements TratamientoPedido{

    Map<String, Integer> pedidos = new HashMap<String, Integer>();
    int pesoTotal = 0;
    int bultosTotales = 0;
    ArrayList<String> destinos = new ArrayList<String>();

    public TratamientoPedidoMultiple(Map pedidos) {
        this.pedidos = pedidos;
    }
    public int getPesoTotal(){
        for(int peso : pedidos.values()) {
            this.pesoTotal += peso;
        }
        return this.pesoTotal;
    }

    public int getNumBultos() {
        for(String bulto : pedidos.keySet()) {
            this.bultosTotales += 1;
            destinos.add(bulto);
        }
        return this.bultosTotales;
    }

    public int calcularTotalBultos() {
        return this.bultosTotales;
    }

    public int calcularPesoTotal() {
        return this.pesoTotal;
    }

    public boolean tratar(){
        for (int i = 0; i < destinos.size(); i++) {
            if (destinos.toArray()[i].equals("Mordor")) {
                return false;
            }
        }
        return true;
    }


}
