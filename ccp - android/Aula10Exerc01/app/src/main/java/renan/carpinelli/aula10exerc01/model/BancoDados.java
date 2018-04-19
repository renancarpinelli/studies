package renan.carpinelli.aula10exerc01.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by RananHome on 19/04/2017.
 */

public class BancoDados extends SQLiteOpenHelper {
    private static final String TAG = "sql";
    // Nome do Banco
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "agenda";
    public static final String TABLE = "contatos";

    public BancoDados(Context ctx) {
        super(ctx, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d(TAG, "Criando tabelas");
        String sql = "CREATE TABLE " + TABLE + "(" +
                "_id integer primary key autoincrement," +
                "nome text," +
                "email text," +
                "celular text," +
                "telefone text," +
                "aniversario text"
                + ");";
        db.execSQL(sql);
        Log.d(TAG, "Tabela Contatos criada");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
