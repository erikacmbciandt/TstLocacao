package com.mateszbueno.tstlocacao;

/**
 *
 * @author Erika Cristina Matesz Bueno
 */
public class Apartamento extends Imovel {

    private String nomeEdificio;
    private int areaInterna;

    public Apartamento() {
    }

    public Apartamento(String nomeEdificio, int areaInterna, String tipoMaterial, int valorAluguel) {
        super(tipoMaterial, valorAluguel, endereco);
        this.nomeEdificio = nomeEdificio;
        this.areaInterna = areaInterna;
    }

    /**
     * @return the nomeEdificio
     */
    public String getNomeEdificio() {
        return nomeEdificio;
    }

    /**
     * @param nomeEdificio the nomeEdificio to set
     */
    public void setNomeEdificio(String nomeEdificio) {
        this.nomeEdificio = nomeEdificio;
    }

    /**
     * @return the areaInterna
     */
    public int getAreaInterna() {
        return areaInterna;
    }

    /**
     * @param areaInterna the areaInterna to set
     */
    public void setAreaInterna(int areaInterna) {
        this.areaInterna = areaInterna;
    }
    
}
