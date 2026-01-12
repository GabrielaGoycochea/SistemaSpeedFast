package com.SpeedFast.Sistema.Model;

public class PedidoExpress extends Pedido{

    /**
     * Subclase especificamente para pedidos para envios de compras express, se verifica (solo por texto) al repartidor más cercano.
     * @param idPedido número de pedido que genera la aplicación
     * @param direccion donde se dirige el envío
     */

    public PedidoExpress(int idPedido, String direccion) {
        super(idPedido, direccion, "Compra Express");
    }

    @Override
    public void asignarRepartidor(){
        System.out.println("Solicitud Compra Express.");
        System.out.println("Buscando al repartidor más cercano...");
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor){
        System.out.println("Repartidor disponible encontrado!.");
        System.out.println("Repartidor "+nombreRepartidor+ " asignado a comprar express");
    }
}

