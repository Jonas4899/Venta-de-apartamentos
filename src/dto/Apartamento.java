package dto;

import java.io.Serializable;

/**
 * @author Jonas
 */
public class Apartamento implements Serializable {
    public int num_piso;
    public int num_apartamento;
    public int valor_apartamento;
    public Cliente cliente;

    @Override
    public String toString() {
        return "+ Nombre = " + cliente.obtNombre() + "\n+ Num. piso = " + this.num_piso + "\n+ Num. apartamento = " + this.num_apartamento + "\n+ Valor apartamento = " + this.valor_apartamento + "\n+ Valor pagado = " + cliente.obtValor_pagado() + "\n+ Saldo = " + this.cliente.obtSaldo();
    }
}
