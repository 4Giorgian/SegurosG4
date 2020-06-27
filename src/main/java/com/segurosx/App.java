package com.segurosx;

import java.util.*;

import com.segurosx.models.*;

/**
 * HRCS
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        List<Seguro> listaSeguros = new ArrayList<Seguro>();
        Cliente cliente = new Cliente("Juan Perez");
        
        SeguroVehicular seguro = new SeguroVehicular("Toyota","Yaris", 24);
        seguro.calcularRiesgo();
        cliente.setCompraSeguro(seguro);
        listaSeguros.add(seguro);

        SeguroTarjeta seguro2 = new SeguroTarjeta("BCP");
        seguro2.calcularRiesgo();
        cliente.setCompraSeguro(seguro2);
        listaSeguros.add(seguro2);


        cliente.getListaSeguroCliente();

   }
}
