package ccp.noite.aula7exercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import ccp.noite.aula7exercicio1.model.Aluno;
import ccp.noite.aula7exercicio1.model.AlunoDao;

public class ListarTodos extends AppCompatActivity {

    private AlunoDao base = new AlunoDao();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_todos);
        listarTodos();
    }

    public void listarTodos(){
        List<Aluno> lista = new ArrayList<Aluno>();
        String saida="";
        lista = base.sellectAll();
        for (int i=0;i < lista.size();i++){
            saida +=(lista.get(i)).getRgm()      + " - " +
                    (lista.get(i)).getNome()     + "\n"  +
                    (lista.get(i)).getParcial()+ ", "  +
                    (lista.get(i)).getTrabs()   + ", "  +
                    (lista.get(i)).getRegimental()    + " \n\n ";
        }
        ((TextView)findViewById(R.id.todos)).setText(saida);
    }

}
