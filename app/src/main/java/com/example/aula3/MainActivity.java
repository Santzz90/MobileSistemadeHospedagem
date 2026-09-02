package com.example.aula3;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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

    private EditText idTipoAcomodacao;



    //TODO - FALTA O TIPO DE ACOMODAÇÃO.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            //TODO = FALTA DELCARAR CADA UM DOS CAMPOS TEXT VIEW.
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        idTipoAcomodacao = findViewById(R.id.idTipoAcomodacao); // ok
        idNomeHospede = findViewById(R.id.idNomeHospede); // ok

        idQtdDiarias = findViewById(R.id.idQtdDiarias);// ok
        idValorDiaria = findViewById(R.id.idValorDiaria);// ok
        idQtdHospedes = findViewById(R.id.idQtdHospedes); // ok
        // TODO NAO ACERTEI O VINCULO DOS BOTÕES
    }// fim metodo
    public void calcularValorEstadia (View view) {
        try {  int qtdDiarias = Integer.parseInt(idQtdDiarias.getText().toString());
            double valorDiaria = Double.parseDouble(idValorDiaria.getText().toString());
            int qtdHospedes = Integer.parseInt(idQtdHospedes.getText().toString());



            String tipoAcomodacao = idTipoAcomodacao.getText().toString();
            String NomeHospede = idNomeHospede.getText().toString(); //

            Estadia estadia = new Estadia(NomeHospede, qtdDiarias, valorDiaria, tipoAcomodacao, qtdHospedes);
            // tudo que esta salvo num edit tex é texto digite: getText().toString(); sempre

            double valorTotal = estadia.calcularTotalEstadia();

            //TODO = FALTA CAPTURAR O TIPO DE ACOMODAÇÃO, FAZER ISSO COM UM EDITTEXT POR ENQUANTO.
            // TODO = DEPOIS DE CAPTURAR O TIPO DE ACOMODAÇÃO CRIAR O OBJETO ESTADIA
            // TODO = DEPOIS DE CRIAR O OBJETO ESTADIA CALCULAR O VALOR FINAL DE ESTADIA E EXIBI-LO.
            // TODO = DICA ONDE CALCULAR O VALOR FINAL DA ESTADIA???
            // TODO = O cálculo fica no try, tudo que pode dar ruim fica no try.
            String mensagem = "Hóspede: " + estadia.getNomeHospede() + " | Acomodação: " + estadia.getTipoAcomodacao() + " | Valor Total: R$ " + String.format("%.2f", valorTotal);

        }
        catch (NumberFormatException e) {
            Toast.makeText(this, "Preencha todos os campos corretamente!", Toast.LENGTH_SHORT).show();

        }
        // fim  metodo calculo estadia
    }
}// fim classe