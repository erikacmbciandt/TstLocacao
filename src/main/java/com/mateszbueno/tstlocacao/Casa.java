package com.mateszbueno.tstlocacao;

/**
 *
 * @author Erika Cristina Matesz Bueno
 */
public class Casa extends Imovel {
    
    private String estilo;
    private int qtdComodos;

    public Casa() { 
    }
    
    public Casa(String estilo, int qtdComodos) {
        super(tipoMaterial, valorAluguel, endereco);
        this.estilo = estilo;
        this.qtdComodos = qtdComodos;
    }

    /**
     * @return the estilo
     */
    public String getEstilo() {
        return estilo;
    }

    /**
     * @param estilo the estilo to set
     */
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    /**
     * @return the qtdComodos
     */
    public int getQtdComodos() {
        return qtdComodos;
    }

    /**
     * @param qtdComodos the qtdComodos to set
     */
    public void setQtdComodos(int qtdComodos) {
        this.qtdComodos = qtdComodos;
    }
    
}
