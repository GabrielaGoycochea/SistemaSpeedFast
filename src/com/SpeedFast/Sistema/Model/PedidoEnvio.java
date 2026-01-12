package com.SpeedFast.Sistema.Model;

public class PedidoEnvio extends Pedido {

    /**
     * Subclase especificamente para pedidos para envios de encomienda, se verifica (solo por texto) el peso del paquete enviado.
     * @param idPedido número de pedido que genera la aplicación
     * @param direccion donde se dirige el envío
     */

    private double peso;


    public PedidoEnvio(int idPedido, String direccion, double peso) {
        super(idPedido, direccion, "Encomienda");
        this.peso = peso;
    }

    @Override
    public void asignarRepartidor(){
        System.out.println("Solicitud envío de encomienda.");
        System.out.println("Validando peso y embalaje del envío...");
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor){
        System.out.println("Peso de paquete: "+peso+ " kg, valido.");
        System.out.println("Repartidor "+ nombreRepartidor+ " asignado para el envío");
        System.out.println("\n");
    }

}
