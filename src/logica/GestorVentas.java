package logica;

import dto.Apartamento;
import dto.Cliente;
import dto.Estados;
import java.util.ArrayList;
import utilidades.GArchivos;

/**
 * @author Jonas
 */
public class GestorVentas {
    
    public ArrayList listaApartamentos = new ArrayList();
    
    public GestorVentas() {
        // Traer ventas guardadas en el archivo
        ArrayList aptosGuardados = (ArrayList)GArchivos.leer("listaApartamentos.ap");
        if (aptosGuardados != null) {
            listaApartamentos = aptosGuardados;
        }
    }
       
    public Cliente crearCliente(String nombre, Integer identificacion, Integer valor_pagado, Integer valor_apto) {
        
        if (nombre == null || identificacion == null || valor_pagado == null || valor_apto == null || nombre.isEmpty()){
            return null;
        } else{
            Cliente cliente = new Cliente();
        
            cliente.modiNombre(nombre);
            cliente.modiIdentificacion(identificacion);
            cliente.modiValor_pagado(valor_pagado);
            cliente.calcSaldo(valor_pagado, valor_apto);

            return cliente;
        }
    }
    
    public Apartamento crearVenta(Cliente cliente, Integer piso, Integer num_apto, Integer valor_apto) {
       
        if (cliente == null || piso == null || num_apto == null || valor_apto == null) {
            return null;
        } else {
            Apartamento apto = new Apartamento();
        
            apto.cliente = cliente;
            apto.num_piso = piso;
            apto.num_apartamento = num_apto;
            apto.valor_apartamento = valor_apto;
            apto.estado_compra = Estados.EN_PROCESO;

            return apto;
        }
    }
    
    public int calcValorApto(int piso) {
        
        if (piso <= 8) {
            return 150_000_000;
        } else if (piso <= 16) {
            return 180_000_000;
        } else {
            return 200_000_000;
        }
    }
    
    public boolean aptoApartado(int piso, int apartamento) {
        Apartamento n = new Apartamento();
        
        for(int i = 0; i < listaApartamentos.size(); i++) {
            n = (Apartamento)listaApartamentos.get(i);
            if (n.num_piso == piso && n.num_apartamento == apartamento) {
                return true;
            }
        }
        return false;
    }
}
