package ccp.noite.aula7exercicio1.model;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RananHome on 04/04/2017.
 */

public class AlunoDao implements IntefaceDao<Aluno> {

    public static List<Aluno> alunos = new ArrayList<>();

    @Override
    public boolean inserir(Aluno objeto) {
        Log.e("rgm",objeto.getNome());
        Log.e("Nome",objeto.getRgm());

        try {
            if (select(objeto.getRgm()) == null) {
                alunos.add(objeto);


                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean delete(Aluno objeto) {
        try {
            if (alunos.contains(objeto)) {
                alunos.remove(objeto);
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            return false;
        }


    }

    @Override
    public boolean update(Aluno objeto) {
        try {
            alunos.set(alunos.indexOf(objeto), objeto);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Aluno select(String rmg) {

        for (Aluno aluno : alunos) {
            if (aluno.getRgm().equals(rmg)) {
                return aluno;
            } else {
                return null;
            }
        }
        return null;
    }

    @Override
    public List<Aluno> sellectAll() {
        return alunos;
    }
}
