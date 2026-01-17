package com.SpeedFast.Sistema.Model;

public abstract class Pedido {

    /**
     * Clase padre se piden los datos generales que heredaran las subclases principales.
     * Sistema permite saber nombre de repartidor , distancia y tiempo de pedido
     */

    protected int idPedido;
    protected String direccion;
    protected String tipoPedido;
    protected double distanciaPedido;
    protected String nombreRepartidor;

    public Pedido (int idPedido, String direccion, double distanciaPedido,String tipoPedido){
        this.idPedido = idPedido;
        this.direccion = direccion;
        this.distanciaPedido= distanciaPedido;
        this.tipoPedido = tipoPedido;
    }

    public void asignarRepartidor(){
    }


    public void asignarRepartidor(String nombreRepartidor){
        this.nombreRepartidor = nombreRepartidor;
    }

    public void mostrarResumen(){
        System.out.println("..:::RESUMEN DE PEDIDO:::..");
        System.out.println("ID Pedido: "+ idPedido);
        System.out.println("Tipo: "+ tipoPedido);
        System.out.println("Dirección: "+direccion);
        System.out.println("Repartidor: "+(nombreRepartidor != null ? nombreRepartidor : "No asignado"));
        System.out.println("Distancia: "+distanciaPedido+ " km.");
    }
    public abstract int calcularTiempoPedido();
}
