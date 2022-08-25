package com.mateszbueno.tstlocacao;

/**
 *
 * @author Erika Cristina Matesz Bueno
 */
public class Cidade {

    private int codCid;
    private int nomeCid;

    public Cidade() {
    }

    public Cidade(int codCid, int nomeCid) {
        this.codCid = codCid;
        this.nomeCid = nomeCid;
    }

    /**
     * @return the codCid
     */
    public int getCodCid() {
        return codCid;
    }

    /**
     * @param codCid the codCid to set
     */
    public void setCodCid(int codCid) {
        this.codCid = codCid;
    }

    /**
     * @return the nomeCid
     */
    public int getNomeCid() {
        return nomeCid;
    }

    /**
     * @param nomeCid the nomeCid to set
     */
    public void setNomeCid(int nomeCid) {
        this.nomeCid = nomeCid;
    }
    
}
