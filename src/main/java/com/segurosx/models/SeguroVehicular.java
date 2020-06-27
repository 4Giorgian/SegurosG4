package com.segurosx.models;

public class SeguroVehicular extends Seguro implements ISeguroVehicular {

    public String marca;
    public String modelo;
    public Integer  mesesDeUso;
    
    public SeguroVehicular(String marca, String modelo, Integer mesesDeUso)    {
        super();
        this.marca = marca;
        this.modelo = modelo;
        this.mesesDeUso = mesesDeUso;
    }

    @Override
    public void calcularRiesgo()   {

        if (this.marca.equals("Toyota") && this.modelo.equals("Yaris")) {
            this.nivelRiesgo = "ALTO";
        }
        else {
            this.nivelRiesgo = "BAJO";
        } 
    }

    @Override
    public String getDetalleSeguro()    {

        return "Seg. Vehicular Numero: " + this.numero + " con riesgo: " + this.nivelRiesgo + "cobertura terminada: " + this.coberturaTerminada();

    }
    
    @Override
    public String coberturaTerminada() {

        if( this.mesesDeUso.equals(23)) {
            return "Si";
        }
        return "No";
    }

    @Override
    public void distribucionMensualidadPrima() {
           /*
       HOT FIX
       Distribuir la prima en 12 meses
       */
    }

    @Override
    public float getPrima() {
        return (float)20.01;
    }

}