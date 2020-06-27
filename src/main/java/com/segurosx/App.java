package com.segurosx;

import com.segurosx.models.Cliente;
import com.segurosx.models.SeguroTarjeta;
import com.segurosx.models.SeguroVehicular;
import com.segurosx.models.*;

/**
 * HRCS
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Cliente cliente = new Cliente("Juan Perez");
        
        SeguroVehicular seguro = new SeguroVehicular("Toyota","Yaris", 24);
        seguro.calcularRiesgo();
        cliente.setCompraSeguro(seguro);

        SeguroTarjeta seguro2 = new SeguroTarjeta("BCP");
        seguro2.calcularRiesgo();
        cliente.setCompraSeguro(seguro2);

        cliente.getListaSeguroCliente();


        //Pregunta 6:

        Certificado cert = new Certificado();
        Contrato contrato = new Contrato();

        Poliza poliza = new Poliza();

        Seguro seg = new SeguroTarjeta("BBVA");
        
        seg.setDocumento(cert);
        seg.setDocumento(contrato);

        seg.setPoliza(poliza);
   }
}
