package com.mateszbueno.tstlocacao;

/**
 *
 * @author Erika Cristina Matesz Bueno
 */
public abstract class Imovel {

    private String tipoMaterial;
    private int valorAluguel;
    private Endereco endereco;

    public Imovel() {
    }
    
    public Imovel(String tipoMaterial, int valorAluguel, Endereco endereco) { 
        this.tipoMaterial = tipoMaterial;
        this.valorAluguel = valorAluguel;
        this.endereco = endereco;
    }

    /**
     * @return the tipoMaterial
     */
    public String getTipoMaterial() {
        return tipoMaterial;
    }

    /**
     * @param tipoMaterial the tipoMaterial to set
     */
    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    /**
     * @return the valorAluguel
     */
    public int getValorAluguel() {
        return valorAluguel;
    }

    /**
     * @param valorAluguel the valorAluguel to set
     */
    public void setValorAluguel(int valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    /**
     * @return the endereco
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    

}
