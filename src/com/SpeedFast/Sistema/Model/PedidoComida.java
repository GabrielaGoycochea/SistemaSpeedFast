package com.SpeedFast.Sistema.Model;

public class PedidoComida extends Pedido {
    /**
     * Subclase especificamente para pedidos de comida, se verifica (solo por texto) una mochila termica para el transporte.
     * @param idPedido corresponde al número de pedido dentro de la aplicación
     * @param direccion es la información correspondiente de hacia donde va el envio.
     */


    public PedidoComida(int idPedido, String direccion,double distaciaPedido) {
        super(idPedido, direccion,distaciaPedido,"comida");
    }

    @Override
    public int calcularTiempoPedido(){
        return (int)(15 +(2*distanciaPedido));

    }

    @Override
    public void asignarRepartidor(){
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor){
        this.nombreRepartidor=nombreRepartidor;

    }


}
