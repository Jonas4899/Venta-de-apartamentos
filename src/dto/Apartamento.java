package dto;

import java.io.Serializable;

/**
 * @author Jonas
 */
public class Apartamento implements Serializable {
    public Integer num_piso;
    public Integer num_apartamento;
    public Integer valor_apartamento;
    public Estados estado_compra;
    public Cliente cliente;

    @Override
    public String toString() {
        return "+ Nombre = " + cliente.obtNombre() + "\n+ Num. piso = " + this.num_piso + "\n+ Num. apartamento = " + this.num_apartamento + "\n+ Valor apartamento = " + this.valor_apartamento + "\n+ Valor pagado = " + cliente.obtValor_pagado() + "\n+ Saldo = " + this.cliente.obtSaldo() + "\n+ Estado de la compra = " + this.estado_compra;
    }
}
