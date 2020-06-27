package com.segurosx.models;

import java.util.Random;

public abstract class Seguro {

    protected Integer numero;
    protected IDoc doc;
    protected IPoliza poliza;
    protected String nivelRiesgo = "NINGUNO";

    public Seguro() {
        this.numero = new Integer(new Random().nextInt());
    }

    public IDoc getDocumento() {
        return doc;
    }

    /*
    public void setCertificado(Certificado certificado) { // No cumple con inversión de dependencias
        this.certificado = certificado;
    }
    */

    public void setDocumento(IDoc doc) { // No cumple con inversión de dependencias
        this.doc = doc;
    }

    public IPoliza getPoliza() {
        return poliza;
    }
/*
    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }
*/
    public void setPoliza(IPoliza poliza) {
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

}
