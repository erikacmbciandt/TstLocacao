package com.mateszbueno.tstlocacao;

/**
 *
 * @author Erika Cristina Matesz Bueno
 */
public class Endereco {
    
    private String rua;
    private int numero;
    private Cidade cidade;

    public Endereco() {
    }

    public Endereco(String rua, int numero, Cidade cidade) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
    }

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the cidade
     */
    public Cidade getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
}
