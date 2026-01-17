package com.SpeedFast.Sistema.Model;

public abstract class Pedido {

    /**
     * Clase padre se piden los datos generales que heredaran las subclases principales.
     * Sobrecarga en la asignación de repartidor permitiendo uno por default y otro que pide el dato del repartidor.
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
        /*System.out.println("Repartidor disponible encontrado!");
        System.out.println("Repartidor "+nombreRepartidor +" asignado al pedido"+ idPedido);
    */}

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
