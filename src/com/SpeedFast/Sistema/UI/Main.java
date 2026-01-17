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


        Pedido pedido1 = new PedidoComida(1,"San pablo 1920, depto 21",2);
        Pedido pedido2 = new PedidoEnvio(2,"Pje Uno 0402",3,8);
        Pedido pedido3 = new PedidoExpress(3,"Av Molina 234",6);

        pedido1.asignarRepartidor("Juan");
        pedido2.asignarRepartidor("Marcelo");
        pedido3.asignarRepartidor("Marcos");


        Pedido[] pedidos ={pedido1,pedido2,pedido3};

        for(Pedido p : pedidos){
            p.mostrarResumen();
            System.out.println("Tiempo estimado de entrega: "+ p.calcularTiempoPedido()+ " minutos");
            System.out.println();
        }


    }
}