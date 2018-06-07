package org.mvpigs.commandpattern.procesadores;

import org.mvpigs.commandpattern.interfaces.Procesador;
import org.mvpigs.commandpattern.interfaces.TratamientoPedido;

public class Oficina implements Procesador {

    public Oficina() {

    }
    public boolean procesa(TratamientoPedido pedido) {
        return pedido.tratar();
    }


}
