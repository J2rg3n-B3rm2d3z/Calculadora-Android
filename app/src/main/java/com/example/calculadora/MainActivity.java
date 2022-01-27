package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView Resultado;
    private EditText Num1;
    private EditText Num2;

    //Metodos de control de activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"OnStart",Toast.LENGTH_SHORT).show();
        //La actividad esta creada

        Resultado = findViewById(R.id.Respuesta);
        Num1 = findViewById(R.id.Numero_1);
        Num2 = findViewById(R.id.Numero_2);
    }

    protected void onStart(){
        super.onStart();
        Toast.makeText(this,"OnStart",Toast.LENGTH_SHORT).show();
        //La actividad esta a punto de hacerse visible
    }

    protected void onResume(){
        super.onResume();
        Toast.makeText(this,"OnResume",Toast.LENGTH_SHORT).show();
        //La actividad se ha vuelto visible (ahora se "reanuda")
    }

    protected void onPause(){
        super.onPause();
        Toast.makeText(this,"OnPause",Toast.LENGTH_SHORT).show();
        //Enfocarse en otra actividad (esta actividad esta a punto de ser detenida)
    }

    protected void onStop(){
        super.onStop();
        Toast.makeText(this,"OnStop",Toast.LENGTH_SHORT).show();
        //La actividad ya no es visible
    }

    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this,"OnDestroy",Toast.LENGTH_SHORT).show();
        //La actividad esta a punto de ser destruida
    }

    //Metodos de validacion

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

    //Operaciones matematicas para la calculadora

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

    //Metodos para cambios de Activity

    public void Acercade (View view)
    {
        Intent i = new Intent(this, Politicas.class);
        startActivity(i);
    }
}