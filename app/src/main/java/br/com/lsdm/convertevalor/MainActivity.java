package br.com.lsdm.convertevalor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Cpnverter(View view) {
        EditText editDolar;
        TextView textResultado;

        editDolar = findViewById(R.id.editDolar);
        textResultado = findViewById(R.id.textResultado);

        Double valorDolar = Double.parseDouble(editDolar.getText().toString());
        Double valorCOnvertido = valorDolar * 4.70;

        textResultado.setText("Valor em R$: " + valorCOnvertido);
    }
}