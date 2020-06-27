package com.segurosx.models;

public class SeguroVSoat extends SeguroVehicular implements ISeguroVSoat {

    private Integer numeroAsientos;

    public SeguroVSoat(String marca, String modelo, Integer mesesDeUso, Integer numeroAsientos) {
        super(marca, modelo, mesesDeUso);
        this.numeroAsientos = numeroAsientos;
    };

    @Override
     public String coberturaTerminada() {
         if( this.numeroAsientos == 100 ){
             return "SI";
         } else {
             return "NO";
         }
     } 
}