package ccp.noite.aula6exercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Tempo extends AppCompatActivity {

    Spinner spinner;
    EditText etValor;
    TextView txt1, txt2, txt3, txt4, txt5;
    private float valor, ms, seg, min, hora, dia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempo);


        txt1 = (TextView) findViewById(R.id.txt1);
        txt2 = (TextView) findViewById(R.id.txt2);
        txt3 = (TextView) findViewById(R.id.txt3);
        txt4 = (TextView) findViewById(R.id.txt4);
        txt5 = (TextView) findViewById(R.id.txt5);

        spinner = (Spinner) findViewById(R.id.spinner);
        etValor = (EditText) findViewById(R.id.etValor);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (etValor.getText().length() != 0) {
                    calcular(spinner.getSelectedItem().toString());
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }


    private void calcular(String s) {
        valor = Float.parseFloat(etValor.getEditableText().toString());

        switch (s) {
            case "ms":
                ms = valor;
                seg = valor / 1000;
                min = seg / 60;
                hora = min / 60;
                dia = hora / 24;
                break;
            case "seg":
                seg = valor;
                ms = seg * 1000;
                min = seg / 60;
                hora = min / 60;
                dia = hora / 24;
                break;
            case "min":
                ms = valor * 1000;
                seg = valor / 60;
                min = valor;
                hora = min / 60;
                dia = hora / 24;
                break;
            case "hora":
                hora = valor;
                min = hora / 60;
                seg = min / 60;
                ms = seg * 1000;
                dia = hora * 24;
                break;
            case "dia":
                dia = valor;
                hora = dia * 24;
                min = hora / 60;
                seg = min / 60;
                ms = seg * 1000;
                break;
        }

        txt1.setText(ms + "");
        txt2.setText(seg + "");
        txt3.setText(min + "");
        txt4.setText(hora + "");
        txt5.setText(dia + "");;
    }

}
