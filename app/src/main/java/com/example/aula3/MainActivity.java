package com.example.aula3;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {
    private EditText idNomeHospede;
    private EditText idQtdDiarias;
    private EditText idValorDiaria;
    private EditText idQtdHospedes;

    //TODO - FALTA O TIPO DE ACOMODAÇÃO.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        idNomeHospede = findViewById(R.id.idNomeHospede);
        idQtdDiarias = findViewById(R.id.editTextNumber);
        idValorDiaria = findViewById(R.id.editTextNumberDecimal);
        idQtdHospedes = findViewById(R.id.editTextNumber2);

    }// fim metodo

    public void calcularValorEstadia (View view){

        String NomeHospede = idNomeHospede.getText().toString(); //
        // tudo que esta salvo num edit tex é texto digite: getText().toString(); sempre
        int qtdDiarias = Integer.parseInt(idQtdDiarias.getText().toString());
        double valorDiaria = Double.parseDouble(idValorDiaria.getText().toString());
        int qtdHospedes = Integer.parseInt(idQtdHospedes.getText().toString());
        //TODO = FALTA CAPTURAR O TIPO DE ACOMODAÇÃO, FAZER ISSO COM UM EDITTEXT POR ENQUANTO.
        // TODO = DEPOIS DE CAPTURAR O TIPO DE ACOMODAÇÃO CRIAR O OBJETO ESTADIA
        // TODO = DEPOIS DE CRIAR O OBJETO ESTADIA CALCULAR O VALOR FINAL DE ESTADIA E EXIBI-LO.
        // TODO = DICA ONDE CALCULAR O VALOR FINAL DA ESTADIA???
    }// fim  metodo calculo estadia

}// fim classe