package renan.carpinelli.provab.modelo;

import android.os.Build;


/**
 * Created by RananHome on 06/04/2017.
 */

public class Serie  {
    private int cod, nota;
    private String nome;

    public Serie() {

    }

    public Serie(int cod, int nota, String nome) {
        this.cod = cod;
        this.nota = nota;
        this.nome = nome;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "cod=" + cod +
                ", nota=" + nota +
                ", nome='" + nome + '\'' +
                '}';
    }
}
