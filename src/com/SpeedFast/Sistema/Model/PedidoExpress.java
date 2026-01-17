package com.SpeedFast.Sistema.Model;

public class PedidoExpress extends Pedido{

    /**
     * Subclase especificamente para pedidos para envios de compras express, se verifica (solo por texto) al repartidor más cercano.
     * @param idPedido número de pedido que genera la aplicación
     * @param direccion donde se dirige el envío
     */

    public PedidoExpress(int idPedido, String direccion,double distaciaPedido) {
        super(idPedido, direccion, distaciaPedido ,"Compra Express");
    }

    @Override
    public int calcularTiempoPedido(){
        int tiempo = 10;
        if (distanciaPedido > 5){tiempo +=5;}
        return tiempo;
    }

    @Override
    public void asignarRepartidor(){
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor){
        this.nombreRepartidor=nombreRepartidor;

    }
}

