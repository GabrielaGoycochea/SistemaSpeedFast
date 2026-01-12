package com.SpeedFast.Sistema.Model;

public class Pedido {

    /**
     * Clase padre se piden los datos generales que heredaran las subclases principales.
     * Sobrecarga en la asignación de repartidor permitiendo uno por default y otro que pide el dato del repartidor.
     */

    protected int idPedido;
    protected String direccion;
    protected String tipoPedido;


    public Pedido (int idPedido, String direccion, String tipoPedido){
        this.idPedido = idPedido;
        this.direccion = direccion;
        this.tipoPedido = tipoPedido;
    }



    public void asignarRepartidor(){
        System.out.println("Asignando un repartidor al pedido "+ idPedido);
    }


    public void asignarRepartidor(String nombreRepartidor){
        System.out.println("Repartidor "+nombreRepartidor +" asignado al pedido"+ idPedido);
    }
}
