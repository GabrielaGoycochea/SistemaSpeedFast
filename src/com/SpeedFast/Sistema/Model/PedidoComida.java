package com.SpeedFast.Sistema.Model;

public class PedidoComida extends Pedido {
    /**
     * Subclase especificamente para pedidos de comida, se verifica (solo por texto) una mochila termica para el transporte.
     * @param idPedido corresponde al número de pedido dentro de la aplicación
     * @param direccion es la información correspondiente de hacia donde va el envio.
     */


    public PedidoComida(int idPedido, String direccion) {
        super(idPedido, direccion, "comida");
    }

    @Override
    public void asignarRepartidor(){
        System.out.println("\nPedido de comida.");
        System.out.println("Buscando repartidor con mochila térmica...");
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor){
        System.out.println("Validando que posea mochila términa...");
        System.out.println("Confirmado.");
        System.out.println("Repartidor "+nombreRepartidor+ " asignado al pedido de comida");
        System.out.println("\n");

    }


}
