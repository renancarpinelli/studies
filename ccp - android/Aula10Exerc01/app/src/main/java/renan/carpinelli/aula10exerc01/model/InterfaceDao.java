package renan.carpinelli.aula10exerc01.model;

import java.util.List;

/**
 * Created by RananHome on 19/04/2017.
 */

public interface InterfaceDao<E> {
    public boolean insert(E obj);

    public boolean update(E obj);

    public boolean delete(String s);

    public E select(String s);

    public List<E> selectAll();
}
