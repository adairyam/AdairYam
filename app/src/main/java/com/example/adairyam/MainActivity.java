package com.example.adairyam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnsuma;
    Button btnresta;
    Button btndivision;
    Button btnMultiplicacion;

    TextView Resultado;

    EditText num1;
    EditText num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resultado = findViewById(R.id.resultado);

        num1 = findViewById(R.id.numero1);
        num2 = findViewById(R.id.numero2);

        btnsuma = findViewById(R.id.button_suma);
        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resultado.setText(Suma(Integer.parseInt(num1.getText().toString()), Integer.parseInt(num2.getText().toString())) + "");

            }
        });
        btndivision = findViewById(R.id.button_division);
        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resultado.setText(Divicion(Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString()))+"");

            }
        });
        btnresta =findViewById(R.id.button_resta);
        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resultado.setText(Resta(Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString()))+"");
            }
        });
        btnMultiplicacion =findViewById(R.id.button_multiplicacion);
        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resultado.setText(Multiplicacion(Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString()))+"");

            }
        });


    }

    public double Suma(int a, int b) {
        return a + b;
    }
    public  double Divicion(int a , int b){
        return a/b;
    }
    public double Resta(int a ,int b){
        return a-b;

    }
    public double Multiplicacion(int a, int b){
        return a*b;
    }
}