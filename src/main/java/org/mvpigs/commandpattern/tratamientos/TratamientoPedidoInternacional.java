package org.mvpigs.commandpattern.tratamientos;

import org.mvpigs.commandpattern.interfaces.TratamientoPedido;
import org.mvpigs.commandpattern.pedidos.PedidoInternacional;

public class TratamientoPedidoInternacional implements TratamientoPedido{
    boolean isValid = true;

    public TratamientoPedidoInternacional(PedidoInternacional pedido) {

        if (pedido.destino().equals("Mordor")) {
            isValid = false;
        }
    }

    public boolean tratar() {
        return isValid;
    }

}
