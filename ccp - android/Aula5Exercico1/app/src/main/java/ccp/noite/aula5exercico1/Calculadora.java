package ccp.noite.aula5exercico1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity implements View.OnClickListener {

    EditText etValor1, etValor2;
    RadioGroup rgOperacao;
    Button btnExec, btnVoltar;
    TextView tvResultado;
    Float valor1, valor2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        etValor1 = (EditText) findViewById(R.id.etValor1);
        etValor2 = (EditText) findViewById(R.id.etValor2);

        btnExec = (Button) findViewById(R.id.btnExec);
        btnVoltar = (Button) findViewById(R.id.btnVoltar);

        tvResultado = (TextView) findViewById(R.id.tvResult);

        rgOperacao = (RadioGroup) findViewById(R.id.rgOperacao);
        btnExec.setOnClickListener(this);
        btnVoltar.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btnExec) {
            getValues();
            switch (rgOperacao.getCheckedRadioButtonId()) {
                case R.id.rbSoma:
                    setResultado(valor1 + valor2);
                    break;
                case R.id.rbSub:
                    setResultado(valor1 - valor2);
                    break;
                case R.id.rbMult:
                    setResultado(valor1 * valor2);
                    break;
                case R.id.rbDiv:
                    setResultado(valor1 / valor2);
                    break;
            }
        }else{
            finish();
        }

    }


    private void getValues() {
        valor1 = Float.parseFloat(etValor1.getText().toString());
        valor2 = Float.parseFloat(etValor2.getText().toString());
    }

    private void setResultado(Float f) {
        tvResultado.setText("Resultado: " + f);
    }


}
