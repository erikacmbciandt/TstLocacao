package com.mateszbueno.tstlocacao;

/**
 *
 * @author Erika Cristina Matesz Bueno
 */
public class Proprietario {

    private int cpf_Prop;
    private String nome_Prop;
    private Endereco endereco;

    public Proprietario() {
    }

    public Proprietario(int cpf_Prop, String nome_Prop, Endereco endereco) {
        this.cpf_Prop = cpf_Prop;
        this.nome_Prop = nome_Prop;
        this.endereco = endereco;
    }

    /**
     * @return the cpf_Prop
     */
    public int getCpf_Prop() {
        return cpf_Prop;
    }

    /**
     * @param cpf_Prop the cpf_Prop to set
     */
    public void setCpf_Prop(int cpf_Prop) {
        this.cpf_Prop = cpf_Prop;
    }

    /**
     * @return the nome_Prop
     */
    public String getNome_Prop() {
        return nome_Prop;
    }

    /**
     * @param nome_Prop the nome_Prop to set
     */
    public void setNome_Prop(String nome_Prop) {
        this.nome_Prop = nome_Prop;
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
