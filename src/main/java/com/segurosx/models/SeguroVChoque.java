package com.segurosx.models;

public class SeguroVChoque extends SeguroVehicular implements ISeguroVChoque {

    private Integer cantidadChoques;

    public SeguroVChoque(String marca, String modelo, Integer mesesDeUso, Integer cantidadChoques) {
        super(marca, modelo, mesesDeUso);
        this.cantidadChoques = cantidadChoques;
    };

    @Override
    public String coberturaTerminada() {
        if(this.cantidadChoques == 100) {
            return "SI";
        }
        return "NO";
    }

    @Override
    public String nivelDanio() {
        return "ALTO";
    }
}