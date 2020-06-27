package com.segurosx.models;

public class SeguroTarjeta extends Seguro implements ISeguroTarjeta {

    private String bancoTarjeta;
  
    public SeguroTarjeta(String bancoTarjeta)    {

        super();
        this.bancoTarjeta = bancoTarjeta;
    }

    @Override
    public void calcularRiesgo()   {

        if (this.bancoTarjeta.equals("AZTECA")) {
            this.nivelRiesgo = "ALTO";
        }
        else {
            this.nivelRiesgo = "BAJO";
        } 
    }

    @Override
    public String getDetalleSeguro() {
        
        return "Seg. Tarjeta Numero: " + this.numero + " con riesgo: " + this.nivelRiesgo;
    }

    @Override
    public Double getMontoCobertura() {
        if( this.bancoTarjeta.equals("AZTECA")) {
            return 10000.0;
        } else {
            return 5000.0;
        }
    }

}