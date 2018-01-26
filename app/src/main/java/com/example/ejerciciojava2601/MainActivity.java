package com.example.ejerciciojava2601;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1Abs, tv1Sentadilla, tv1Pasos, tv1Bici;
    ImageView iv1Abs, iv1Sentadilla, iv1Pasos, ivBi1ci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    tv1Abs = (TextView)findViewById(R.id.tvAbs);
    tv1Sentadilla = (TextView)findViewById(R.id.tvSentadillas);
    tv1Pasos = (TextView)findViewById(R.id.tvPasos);
    tv1Bici = (TextView)findViewById(R.id.tvBici);

    tv1Abs.setText("Abdominales");
    tv1Sentadilla.setText("Sentadillas");
    tv1Bici.setText("Bicicleta");
    tv1Pasos.setText("Pasos de granjero");





    }
    public void escribirPasos(View view) {
    tv1Pasos.setText(R.string.repPasos);
    }

    public void escribirAbs(View view) {
        tv1Abs.setText(R.string.repAbs);
    }

    public void escribirSentadillas(View view) {
        tv1Sentadilla.setText(R.string.repSentadilla);
    }

    public void escribirBici(View view) {
        tv1Bici.setText(R.string.repBici);
    }

    public void botonReiniciar(View view) {
        tv1Abs.setText("Abdominales");
        tv1Sentadilla.setText("Sentadillas");
        tv1Bici.setText("Bicicleta");
        tv1Pasos.setText("Pasos de granjero");
    }

}
