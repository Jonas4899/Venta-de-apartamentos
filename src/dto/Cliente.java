package dto;

import java.io.Serializable;

/**
 * @author Jonas
 */
public class Cliente implements Serializable {
    private String nombre;
    private int identificacion;
    private int valor_pagado;
    private int saldo;
    
    public String obtNombre() {
        return this.nombre;
    }
    
    public void modiNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int obtIdentificacion() {
        return this.identificacion;
    }
    
    public void modiIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }
    
    public int obtValor_pagado() {
        return this.valor_pagado;
    }
    
    public void modiValor_pagado(int valor_pagado) {
        this.valor_pagado = valor_pagado;
    }
    
    public int obtSaldo() {
        return this.saldo;
    }
    
    public void calcSaldo(int valor_pagado, int valor_apto) {
        this.saldo = valor_apto - valor_pagado;
    }
}
