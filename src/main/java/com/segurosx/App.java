package com.segurosx;
import java.util.*;
import java.util.ArrayList;

import com.segurosx.models.*;

/**
 * HRCS
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        List<SeguroVehicular> lista = new ArrayList<SeguroVehicular>();
        Cliente cliente = new Cliente("Juan Perez");
        
        SeguroVehicular seguroVChoque = new SeguroVChoque("Toyota","Yaris", 24, 90);
        seguroVChoque.calcularRiesgo();
        cliente.setCompraSeguro(seguroVChoque);
        lista.add(seguroVChoque);

        SeguroVehicular seguroVSoat = new SeguroVSoat("Toyota","Yaris", 24, 100);
        seguroVSoat.calcularRiesgo();
        cliente.setCompraSeguro(seguroVSoat);
        lista.add(seguroVSoat);

        for( SeguroVehicular item : lista ) {
            System.out.println( item.getDetalleSeguro() + "Cobertura terminada: " + item.coberturaTerminada());
        }
   }
}
