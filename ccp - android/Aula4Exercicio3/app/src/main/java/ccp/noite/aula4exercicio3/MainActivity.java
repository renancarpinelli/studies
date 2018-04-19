package ccp.noite.aula4exercicio3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton btnAuto;
    Button btnPrin;
    ImageButton btnPort;
    ImageButton btnEmpre;
    ImageButton btnResi;
    ImageButton btnViag;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAuto = (ImageButton) findViewById(R.id.btnCar);
        btnPrin = (Button) findViewById(R.id.btnPrincipal);
        btnPort = (ImageButton) findViewById(R.id.btnPort);
        btnEmpre = (ImageButton) findViewById(R.id.btnEmpre);
        btnResi = (ImageButton) findViewById(R.id.btnRes);
        btnViag = (ImageButton) findViewById(R.id.btnViagem);

        btnAuto.setOnClickListener(this);
        btnPrin.setOnClickListener(this);
        btnPort.setOnClickListener(this);
        btnEmpre.setOnClickListener(this);
        btnResi.setOnClickListener(this);
        btnViag.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnPrincipal:
                setContentView(R.layout.activity_main);
                break;
            case R.id.btnCar:
                setContentView(R.layout.auto);
                break;
            case R.id.btnPort:
                setContentView(R.layout.port);
                break;
            case R.id.btnEmpre:
                setContentView(R.layout.empre);
                break;
            case R.id.btnRes:
                setContentView(R.layout.res);
                break;
            case R.id.btnViagem:
                setContentView(R.layout.viag);
                break;


        }

    }
}
