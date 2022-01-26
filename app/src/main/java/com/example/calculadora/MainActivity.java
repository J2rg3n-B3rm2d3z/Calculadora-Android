package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView Resultado;
    private EditText Num1;
    private EditText Num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resultado = findViewById(R.id.Respuesta);
        Num1 = findViewById(R.id.Numero_1);
        Num2 = findViewById(R.id.Numero_2);
    }

    private boolean Validar()
    {
        try{
            Double.parseDouble(Num1.getText().toString());
            Double.parseDouble(Num2.getText().toString());

        }catch (Exception exception){
            Resultado.setTextSize(20);
            Resultado.setText("Error inesperado :(");
            return false;
        }

        Resultado.setTextSize(40);
        return true;
    }

    public void Suma (View view)
    {
        if(Validar()) {
            double Respuesta = Double.parseDouble(Num1.getText().toString()) +  Double.parseDouble(Num2.getText().toString());
            Resultado.setText(Respuesta + "");
        }
    }

    public void Resta (View view)
    {
        if(Validar()) {
            double Respuesta = Double.parseDouble(Num1.getText().toString()) - Double.parseDouble(Num2.getText().toString());
            Resultado.setText(Respuesta + "");
        }
    }

    public void Multiplicacion (View view)
    {
        if(Validar()) {
            double Respuesta = Double.parseDouble(Num1.getText().toString()) * Double.parseDouble(Num2.getText().toString());
            Resultado.setText(Respuesta + "");
        }
    }

    public void Division (View view)
    {
        if(Validar()) {
            double Respuesta = Double.parseDouble(Num1.getText().toString()) / Double.parseDouble(Num2.getText().toString());
            Resultado.setText(Respuesta + "");
        }
    }


}