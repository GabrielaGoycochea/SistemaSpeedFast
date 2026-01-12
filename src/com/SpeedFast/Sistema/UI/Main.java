package com.SpeedFast.Sistema.UI;

import com.SpeedFast.Sistema.Model.Pedido;
import com.SpeedFast.Sistema.Model.PedidoComida;
import com.SpeedFast.Sistema.Model.PedidoEnvio;
import com.SpeedFast.Sistema.Model.PedidoExpress;

/**
 * Se genera la información según los datos de prueba ingresados,
 * De requerir agregar más pedidos debe realizarse de manera manual.
 */

public class Main {
    public static void main(String[] args) {

        Pedido pedido1 = new PedidoComida(01,"San pablo 1920, depto 21");
        Pedido pedido2 = new PedidoEnvio(02,"Pje Uno 0402",2);
        Pedido pedido3 = new PedidoExpress(03,"Av Molina 234");

        pedido1.asignarRepartidor();
        pedido1.asignarRepartidor("Juan");

        pedido2.asignarRepartidor();
        pedido2.asignarRepartidor("Marcelo");

        pedido3.asignarRepartidor();
        pedido3.asignarRepartidor("Marcos");

    }
}