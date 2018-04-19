package ccp.noite.aula7exercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnCad, btnCons, btnAlt, btnApagar, btnListar, btnSobre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCad = (Button) findViewById(R.id.btnCad);
        btnCons = (Button) findViewById(R.id.btnCons);
        btnAlt = (Button) findViewById(R.id.btnAlt);
        btnApagar = (Button) findViewById(R.id.btnApagar);
        btnListar = (Button) findViewById(R.id.btnList);
        btnSobre = (Button) findViewById(R.id.btnSobre);

        btnCad.setOnClickListener(this);
        btnCons.setOnClickListener(this);
        btnAlt.setOnClickListener(this);
        btnApagar.setOnClickListener(this);
        btnListar.setOnClickListener(this);
        btnSobre.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        Class c = null;

        switch (v.getId()) {
            case R.id.btnCad:
                c = Cadastrar.class;
                break;
            case R.id.btnAlt:
                c = Alterar.class;
                break;
            case R.id.btnApagar:
                c = Apagar.class;
                break;
            case R.id.btnList:
                c = ListarTodos.class;
                break;
            case R.id.btnSobre:
                Toast.makeText(this, "Sobre", Toast.LENGTH_LONG).show();
                break;
            case R.id.btnCons:
                c = Consultar.class;
                break;
        }

        Intent i = new Intent(getApplicationContext(), c);
        startActivity(i);

    }
}
