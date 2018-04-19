package ccp.noite.aula7exercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import ccp.noite.aula7exercicio1.R;
import ccp.noite.aula7exercicio1.model.Aluno;
import ccp.noite.aula7exercicio1.model.AlunoDao;

public class Apagar extends AppCompatActivity {

    private AlunoDao base = new AlunoDao();
    private Aluno a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apagar);
    }

    public void consultarDados(View v){
         a = base.select(((EditText)findViewById(R.id.etRgm)).getText().toString());
        if (a != null){
            ((EditText)findViewById(R.id.etNome)).setText(a.getNome());
            ((EditText)findViewById(R.id.etNotaParcial)).setText(a.getParcial()+"");
            ((EditText)findViewById(R.id.etTrab)).setText(a.getTrabs()+"");
            ((EditText)findViewById(R.id.etNotaPri)).setText(a.getRegimental()+"");
        }else{
            Toast.makeText(getApplicationContext(), "Rgm inválido", Toast.LENGTH_LONG).show();
        }
    }

    public void apagarDados(View v){
        if (a != null) {
            a.setNome(((EditText) findViewById(R.id.etNome)).getText().toString());
            a.setParcial(Float.parseFloat(((EditText) findViewById(R.id.etNotaParcial)).getText().toString()));
            a.setTrabs(Float.parseFloat(((EditText) findViewById(R.id.etTrab)).getText().toString()));
            a.setRegimental(Float.parseFloat(((EditText) findViewById(R.id.etNotaPri)).getText().toString()));
            if (base.delete(a)) {
                Toast.makeText(getApplicationContext(), "Registro apagado", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(getApplicationContext(), "ERRO", Toast.LENGTH_LONG).show();
            }
        }else{
            Toast.makeText(getApplicationContext(), "Pesquise primeiro o aluno", Toast.LENGTH_LONG).show();
        }
    }
}
