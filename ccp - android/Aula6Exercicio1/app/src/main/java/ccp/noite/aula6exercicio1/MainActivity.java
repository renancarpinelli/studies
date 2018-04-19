package ccp.noite.aula6exercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnTempo, btnVolume, btnPeso, btnArea, btnComprimento, btnTemperatura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTempo = (Button) findViewById(R.id.btnTempo);
        btnVolume = (Button) findViewById(R.id.btnVolume);
        btnPeso = (Button) findViewById(R.id.btnPeso);
        btnArea = (Button) findViewById(R.id.btnArea);
        btnComprimento = (Button) findViewById(R.id.btnComprimento);
        btnTemperatura = (Button) findViewById(R.id.btnTemperatura);

        btnTempo.setOnClickListener(this);
        btnVolume.setOnClickListener(this);
        btnPeso.setOnClickListener(this);
        btnArea.setOnClickListener(this);
        btnComprimento.setOnClickListener(this);
        btnTemperatura.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Class c = null;

        switch (v.getId()) {
            case R.id.btnTempo:
                c = Tempo.class;
                break;
            case R.id.btnVolume:
                c = Volume.class;
                break;
            case R.id.btnPeso:
                c = Peso.class;
                break;
            case R.id.btnArea:
                c = Area.class;
                break;
            case R.id.btnComprimento:
                c = Comprimento.class;
                break;
            case R.id.btnTemperatura:
                c = Temperatura.class;
                break;
        }

        Intent i = new Intent(getApplicationContext(), c);
        startActivity(i);
    }
}
