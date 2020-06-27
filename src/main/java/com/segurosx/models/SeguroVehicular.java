package com.segurosx.models;

public abstract class SeguroVehicular extends Seguro implements ISeguroVehicular {

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
    public abstract String coberturaTerminada();


}