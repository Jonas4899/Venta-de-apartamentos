/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package logica;

import dto.Apartamento;
import dto.Cliente;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jonas
 */
public class GestorVentasTest {
    
    public GestorVentasTest() {
    }

    @Test
    public void crearClienteNull() {
        String nombre = null;
        Integer identificacion = null;
        Integer valor_pagado = null;
        Integer valor_apto = null;
        GestorVentas i = new GestorVentas();
        Cliente resultado = i.crearCliente(nombre, identificacion, valor_pagado, valor_apto);
        assertNull(resultado);
    }
    
    @Test
    public void crearClienteNombreNull() {
        String nombre = null;
        Integer identificacion = 123456789;
        Integer valor_pagado = 100_000_000;
        Integer valor_apto = 150_000_000;
        GestorVentas i = new GestorVentas();
        Cliente resultado = i.crearCliente(nombre, identificacion, valor_pagado, valor_apto);
        assertNull(resultado);
    }
    
    @Test
    public void crearClienteNombreVacio() {
        String nombre = "";
        Integer identificacion = 123456789;
        Integer valor_pagado = 100_000_000;
        Integer valor_apto = 150_000_000;
        GestorVentas i = new GestorVentas();
        Cliente resultado = i.crearCliente(nombre, identificacion, valor_pagado, valor_apto);
        assertNull(resultado);
    }
    
    @Test
    public void crearClienteIdentificacionNull() {
        String nombre = "Jotaro";
        Integer identificacion = null;
        Integer valor_pagado = 100_000_000;
        Integer valor_apto = 150_000_000;
        GestorVentas i = new GestorVentas();
        Cliente resultado = i.crearCliente(nombre, identificacion, valor_pagado, valor_apto);
        assertNull(resultado);
    }
    
    @Test
    public void crearClientePagadoNull() {
        String nombre = "Jotaro";
        Integer identificacion = 123456789;
        Integer valor_pagado = null;
        Integer valor_apto = 150_000_000;
        GestorVentas i = new GestorVentas();
        Cliente resultado = i.crearCliente(nombre, identificacion, valor_pagado, valor_apto);
        assertNull(resultado);
    }
    
    @Test
    public void crearClienteAptoNull() {
        String nombre = "Jotaro";
        Integer identificacion = 123456789;
        Integer valor_pagado = 150_000_000;
        Integer valor_apto = null;
        GestorVentas i = new GestorVentas();
        Cliente resultado = i.crearCliente(nombre, identificacion, valor_pagado, valor_apto);
        assertNull(resultado);
    }

    @Test
    public void crearVentaNull() {
        Cliente cliente = null;
        Integer piso = null;
        Integer num_apto = null;
        Integer valor_apto = null;
        GestorVentas i = new GestorVentas();
        Apartamento resultado = i.crearVenta(cliente, piso, num_apto, valor_apto);
        assertNull(resultado);
    }
    
    @Test
    public void crearVentaClienteNull() {
        Cliente cliente = null;
        Integer piso = 15;
        Integer num_apto = 10;
        Integer valor_apto = 180_000_000;
        GestorVentas i = new GestorVentas();
        Apartamento resultado = i.crearVenta(cliente, piso, num_apto, valor_apto);
        assertNull(resultado);
    }
    
    @Test
    public void crearVentaPisoNull() {
        Cliente cliente = new Cliente();
        Integer piso = null;
        Integer num_apto = 10;
        Integer valor_apto = 180_000_000;
        GestorVentas i = new GestorVentas();
        Apartamento resultado = i.crearVenta(cliente, piso, num_apto, valor_apto);
        assertNull(resultado);
    }
    
    @Test
    public void crearVentaAptoNull() {
        Cliente cliente = new Cliente();
        Integer piso = 15;
        Integer num_apto = null;
        Integer valor_apto = 180_000_000;
        GestorVentas i = new GestorVentas();
        Apartamento resultado = i.crearVenta(cliente, piso, num_apto, valor_apto);
        assertNull(resultado);
    }
    
    @Test
    public void crearVentaValorNull() {
        Cliente cliente = new Cliente();
        Integer piso = 15;
        Integer num_apto = 10;
        Integer valor_apto = null;
        GestorVentas i = new GestorVentas();
        Apartamento resultado = i.crearVenta(cliente, piso, num_apto, valor_apto);
        assertNull(resultado);
    }

    @Test
    public void calcValorAptoPrimerValor() {
        GestorVentas i = new GestorVentas();
        int valor = i.calcValorApto(8);
        assertThat(valor, is(equalTo(150_000_000)));
    }
    
    @Test
    public void calcValorAptoSegundoValor() {
        GestorVentas i = new GestorVentas();
        int valor = i.calcValorApto(16);
        assertThat(valor, is(equalTo(180_000_000)));
    }
    
    @Test
    public void calcValorAptoTercerValor() {
        GestorVentas i = new GestorVentas();
        int valor = i.calcValorApto(17);
        assertThat(valor, is(equalTo(200_000_000)));
    }
}
