package com.segurosx.models;

import java.util.Random;

public abstract class Seguro implements ICalculoPrima {

    protected Integer numero;
    protected Certificado certificado;
    protected Poliza poliza;
    protected String nivelRiesgo = "NINGUNO";

    public Seguro() {
        this.numero = new Integer(new Random().nextInt());
    }

    public Certificado getCertificado() {
        return certificado;
    }

    public void setCertificado(Certificado certificado) {
        this.certificado = certificado;
    }

    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNivelRiesgo()  {
        return this.nivelRiesgo;
    }

    public abstract String getDetalleSeguro();

    public abstract void calcularRiesgo();

    public abstract void distribucionMensualidadPrima();

    public float calcularPrima(ICalculoPrima calculador){
        float prima = calculador.getPrima();
        return prima;
    }
}
