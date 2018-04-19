package renan.carpinelli.provab.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RananHome on 06/04/2017.
 */

public class SerieDao implements IntefaceDao<Serie> {

    public static List<Serie> series = new ArrayList<>();

    @Override
    public boolean insert(Serie e) {
        try {
            if (select(e).getCod() != e.getCod()) {
                series.add(e);
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            return false;
        }

    }

    @Override
    public Serie select(Serie obj) {
        return ;
    }

    @Override
    public List<Serie> selectAll() {
        return null;
    }
}
