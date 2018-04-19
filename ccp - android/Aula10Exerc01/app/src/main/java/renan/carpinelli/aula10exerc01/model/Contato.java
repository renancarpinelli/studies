package renan.carpinelli.aula10exerc01.model;

/**
 * Created by RananHome on 19/04/2017.
 */

public class Contato {
    private long id;
    private String nome;
    private String email;
    private String celular;
    private String telefone;
    private String aniversario;


    public Contato() {
    }

    public Contato(int id, String nome, String email, String celular, String telefone, String aniversario) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.celular = celular;
        this.telefone = telefone;
        this.aniversario = aniversario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }
}
