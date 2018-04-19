package ccp.noite.aula7exercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import ccp.noite.aula7exercicio1.model.Aluno;
import ccp.noite.aula7exercicio1.model.AlunoDao;

public class Consultar extends AppCompatActivity {

    private AlunoDao base = new AlunoDao();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar);
    }

    public void consultarDados(View v){
        Aluno a = base.select(((EditText)findViewById(R.id.etRgm)).getText().toString());
        if (a != null){
            ((EditText)findViewById(R.id.etNome)).setText(a.getNome());
            ((EditText)findViewById(R.id.etNotaParcial)).setText(a.getParcial()+"");
            ((EditText)findViewById(R.id.etTrab)).setText(a.getTrabs()+"");
            ((EditText)findViewById(R.id.etNotaPri)).setText(a.getRegimental()+"");
        }else{
            Toast.makeText(getApplicationContext(), "Rgm inválido", Toast.LENGTH_LONG).show();
        }
    }


}


