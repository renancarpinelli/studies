package ccp.noite.aula7exercicio1.model;

/**
 * Created by RananHome on 04/04/2017.
 */

public class Aluno {
    private String rgm, nome;
    private Float parcial, trabs, regimental;

    public Aluno() {
    }

    public Aluno(String rgm, String nome, Float parcial, Float trabs, Float regimental) {
        this.rgm = rgm;
        this.nome = nome;
        this.parcial = parcial;
        this.trabs = trabs;
        this.regimental = regimental;
    }

    public String getRgm() {
        return rgm;
    }

    public void setRgm(String rgm) {
        this.rgm = rgm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getParcial() {
        return parcial;
    }

    public void setParcial(Float parcial) {
        this.parcial = parcial;
    }

    public Float getTrabs() {
        return trabs;
    }

    public void setTrabs(Float trabs) {
        this.trabs = trabs;
    }

    public Float getRegimental() {
        return regimental;
    }

    public void setRegimental(Float regimental) {
        this.regimental = regimental;
    }
}
