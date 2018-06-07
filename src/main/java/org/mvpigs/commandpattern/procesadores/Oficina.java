package org.mvpigs.commandpattern.procesadores;

import org.mvpigs.commandpattern.interfaces.Pedido;
import org.mvpigs.commandpattern.interfaces.Procesador;
import org.mvpigs.commandpattern.interfaces.TratamientoPedido;

public class Oficina implements Procesador {

    public Oficina() {

    }
    public boolean procesa(TratamientoPedido pedido) {
        return pedido.tratar();
    }
    public String printarStatus( boolean status, Pedido pedido) {

        int estado = (status)?1:0;
        int result = 0;
        return (pedido.destino() + " " + ((estado == 0)?"RECHAZADO":"ACEPTADO"));
    }




    private enum Status {
        RECHAZADO (0),
        ACEPTADO (1);

        private final int numero;

        Status(int numero){
            this.numero = numero;
        }

        public int getNumero(){
            return this.numero;
        }


}}
