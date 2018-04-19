package renan.carpinelli.aula10exerc01.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.List;

/**
 * Created by RananHome on 19/04/2017.
 */

public class ContatoDao implements InterfaceDao<Contato> {

    private Context ctx;

    public ContatoDao(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public boolean insert(Contato obj) {
        SQLiteDatabase db = new BancoDados(ctx).getWritableDatabase();
        try {
            ContentValues values = new ContentValues();
            values.put("nome", obj.getNome());
            values.put("email", obj.getEmail());
            values.put("telefone", obj.getTelefone());
            values.put("celular", obj.getCelular());
            values.put("aniversario", obj.getAniversario());
            return (db.insert(BancoDados.TABLE, null, values) > 0);
        } finally {
            db.close();
        }
    }

    @Override
    public boolean update(Contato obj) {
        SQLiteDatabase db = new BancoDados(ctx).getWritableDatabase();

        try {
            ContentValues values = new ContentValues();
            values.put("nome", obj.getNome());
            values.put("email", obj.getEmail());
            values.put("telefone", obj.getTelefone());
            values.put("celular", obj.getCelular());
            values.put("aniversario", obj.getAniversario());

            if (obj.getId() != 0) {
                String _id = String.valueOf(obj.getId());
                String[] whereArgs = new String[]{_id};
            }

        } finally {
            db.close();
        }

        return false;
    }

    @Override
    public boolean delete(String s) {
        SQLiteDatabase db = new BancoDados(ctx).getWritableDatabase();

        return false;
    }

    @Override
    public Contato select(String s) {
        return null;
    }

    @Override
    public List<Contato> selectAll() {
        return null;
    }
}
