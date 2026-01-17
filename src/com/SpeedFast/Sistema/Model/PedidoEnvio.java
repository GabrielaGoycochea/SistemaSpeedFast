package com.SpeedFast.Sistema.Model;

public class PedidoEnvio extends Pedido {

    /**
     * Subclase especificamente para pedidos para envios de encomienda, se verifica (solo por texto) el peso del paquete enviado.
     * @param idPedido número de pedido que genera la aplicación
     * @param direccion donde se dirige el envío
     */

    private double peso;


    public PedidoEnvio(int idPedido, String direccion, double distaciaPedido ,double peso) {
        super(idPedido, direccion, distaciaPedido ,"Encomienda");
        this.peso = peso;
    }

    @Override
    public int calcularTiempoPedido(){
        return (int)(20+(1.5*distanciaPedido));
    }

    @Override
    public void asignarRepartidor(){
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor){
        this.nombreRepartidor=nombreRepartidor;

    }

}
