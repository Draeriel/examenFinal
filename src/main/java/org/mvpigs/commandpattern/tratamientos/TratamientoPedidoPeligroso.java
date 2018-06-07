package org.mvpigs.commandpattern.tratamientos;

import org.mvpigs.commandpattern.interfaces.PedidoPeligroso;
import org.mvpigs.commandpattern.interfaces.TratamientoPedido;

public class TratamientoPedidoPeligroso implements TratamientoPedido{
    boolean isValid = true;

    public TratamientoPedidoPeligroso(PedidoPeligroso pedido) {
        if (pedido.instrucciones().equals("no ponerselo en el dedo")) {
            isValid = false;
        }
    }

    public boolean tratar() {
        return isValid;
    }
}
