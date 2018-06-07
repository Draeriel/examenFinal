import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mvpigs.commandpattern.interfaces.Pedido;
import org.mvpigs.commandpattern.interfaces.PedidoPeligroso;
import org.mvpigs.commandpattern.interfaces.Procesador;
import org.mvpigs.commandpattern.interfaces.TratamientoPedido;
import org.mvpigs.commandpattern.pedidos.PedidoInternacional;
import org.mvpigs.commandpattern.pedidos.PedidoPeligrosoOrden;
import org.mvpigs.commandpattern.tratamientos.TratamientoPedidoInternacional;
import org.mvpigs.commandpattern.tratamientos.TratamientoPedidoPeligroso;

/**
 * NO PUEDES MODIFICAR EL CODIGO DE LOS CASOS TEST 
 */
public class TestPedidos {

    /**
     * Crea una clase TratamientoPedidoInternacional que permita tratar
     * pedidos internacionales.
     * 
     * La clase permite tratar todos los pedidos excepto 
     * los que van a Mordor.
     * 
     * Crea las clases necesarias que se requieren en los casos test
     * respetando los constructores que se exigen.
     */
    @Test
	public void test_Mordor() {

        Pedido pedidoInt = new PedidoInternacional("Mordor", 100);
        assertEquals("Mordor", pedidoInt.destino());

		TratamientoPedido tratamientoKO = new TratamientoPedidoInternacional(
                                                    (PedidoInternacional) pedidoInt);
        assertNotNull(tratamientoKO);
        assertFalse(tratamientoKO.tratar());			
	}

	@Test
	public void test_Comarca() {

        Pedido pedidoInt = new PedidoInternacional("Comarca", 100);
        assertEquals("Comarca", pedidoInt.destino());

		TratamientoPedido tratamientoOK = new TratamientoPedidoInternacional(
                                                    (PedidoInternacional) pedidoInt);
        assertNotNull(tratamientoOK);        
        assertTrue(tratamientoOK.tratar());
    }

    /**
     * Crea una clase TratamientoPedidoPeligroso que permita tratar
     * pedidos peligrosos.
     * 
     * La clase permite tratar todos los pedidos segun sus
     * instrucciones excepto aquellos cuya instruccion sea 
     * "no ponerselo en el dedo". 
     * 
     * Crea las clases necesarias que se requieren en los casos test
     * respetando los constructores que se exigen.
     */
    @Test
    public void test_pedido_peligroso_KO() {

        Pedido pedidoConPeligro = new PedidoPeligrosoOrden("Monte del destino", 
                                                           "no ponerselo en el dedo");
        assertEquals("Monte del destino", pedidoConPeligro.destino());

        TratamientoPedido tratamientoKO = new TratamientoPedidoPeligroso(
                                                    (PedidoPeligroso) pedidoConPeligro);
        assertNotNull(tratamientoKO);
        assertFalse(tratamientoKO.tratar());
    }

    @Test
    public void test_pedido_peligroso_OK() {

        Pedido pedidoConPeligro = new PedidoPeligrosoOrden("Cima de los vientos", 
                                                           "no limpiarse las uñas con este puñal");
        assertEquals("Cima de los vientos", pedidoConPeligro.destino());

        TratamientoPedido tratamientoOK = new TratamientoPedidoPeligroso(
                                                    (PedidoPeligroso) pedidoConPeligro);
        assertTrue(tratamientoOK.tratar());
    }

    /**
     * Añade a las clases PedidoInternacional y PedidoPeligrosoOrden
     * una identificador Id de tipo String
     * autogenerado haciendo uso de la clase UUID de Java
     * https://docs.oracle.com/javase/8/docs/api/java/util/UUID.html
     */
    @Test
    public void test_UUID_generator() {

        PedidoInternacional internacional = new PedidoInternacional("Mordor", 10);
        PedidoPeligrosoOrden peligroso = new PedidoPeligrosoOrden("Cima de los vientos",
                                                                  "no limpiarse las uñas con este puñal");
        assertNotNull(internacional.getId());
        assertNotNull(peligroso.getId());

        assertTrue(internacional.getId() != peligroso.getId());
    }

    /**
     * Añade una clase para los pedidos nacionales.
     */


}