package renan.carpinelli.provab.modelo;

import java.util.List;

/**
 * Created by RananHome on 06/04/2017.
 */

public interface IntefaceDao<E> {

    public boolean insert(E e);

    public E select(E e);

    public List<E> selectAll();

}
