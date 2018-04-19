package ccp.noite.aula7exercicio1.model;

import java.util.List;

/**
 * Created by RananHome on 04/04/2017.
 */

public interface IntefaceDao<T> {

    public boolean inserir(T objeto);

    public boolean delete(T objeto);

    public boolean update(T objeto);

    public T select(String rmg);

    public List<T> sellectAll();

}
