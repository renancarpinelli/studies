package ccp.noite.aula4exercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etValor1, etValor2;
    TextView tvResult;
    Button btnSoma, btnSub, btnMult, btnDiv;
    Float valor1, valor2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etValor1 = (EditText) findViewById(R.id.etValor1);
        etValor2 = (EditText) findViewById(R.id.etValor2);

        btnSoma = (Button) findViewById(R.id.btnSoma);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMult = (Button) findViewById(R.id.btnMult);
        btnDiv = (Button) findViewById(R.id.btnDiv);

        tvResult = (TextView) findViewById(R.id.tvResult);


        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getValues();
                setResultado(valor1 + valor2);
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getValues();
                setResultado(valor1 - valor2);
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getValues();
                setResultado(valor1 * valor2);
            }
        });


        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getValues();
                setResultado(valor1 / valor2);
            }
        });

    }

    private void getValues() {
        valor1 = Float.parseFloat(etValor1.getText().toString());
        valor2 = Float.parseFloat(etValor2.getText().toString());
    }

    private void setResultado(Float f) {
        tvResult.setText("Resultado: " + f);
    }


}
