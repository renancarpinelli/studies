package ccp.noite.aula7exercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import ccp.noite.aula7exercicio1.R;
import ccp.noite.aula7exercicio1.model.Aluno;
import ccp.noite.aula7exercicio1.model.AlunoDao;

public class Cadastrar extends AppCompatActivity {

    private AlunoDao alunoDao = new AlunoDao();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar);
    }

    public void salvarDados(View view) {

        try {
            String rgm = ((EditText) findViewById(R.id.etRgm)).getText().toString();
            String nome = ((EditText) findViewById(R.id.etNome)).getText().toString();
            Float np = Float.parseFloat(((EditText) findViewById(R.id.etNotaParcial)).getText().toString());
            Float trab = Float.parseFloat(((EditText) findViewById(R.id.etTrab)).getText().toString());
            Float npri = Float.parseFloat(((EditText) findViewById(R.id.etNotaPri)).getText().toString());

            if (alunoDao.inserir(new Aluno(rgm, nome, np, trab, npri))) {
                Toast.makeText(getApplicationContext(), "Gravou", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "Erro", Toast.LENGTH_SHORT).show();
            }


        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Preencha todos os campos", Toast.LENGTH_SHORT).show();

        }
    }

}
