package ccp.noite.aula5exercico1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etAltura, etPeso;
    Float altura, peso;
    Double imc;
    TextView tvIMC;
    RadioGroup rbSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        etAltura = (EditText) findViewById(R.id.etAltura);
//        etPeso = (EditText) findViewById(R.id.etAltura);
        tvIMC = (TextView) findViewById(R.id.tvImc);

    }

    public void calcularImc(View view) {

        altura = Float.parseFloat(((EditText) findViewById(R.id.etAltura)).getText().toString());
        peso = Float.parseFloat(((EditText) findViewById(R.id.etPeso)).getText().toString());
        imc = peso / Math.pow(altura, 2);
        tvIMC.setText(imc + "");

    }

    public void abrirCalculador(View view) {
        Intent i = new Intent(getApplicationContext(),Calculadora.class);
        startActivity(i);
    }


    public void Finalizar(View view) {
        finish();
    }
}
