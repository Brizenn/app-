package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNome;
    private Button buttonSaudacao;
    private TextView textViewSaudacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNome = findViewById(R.id.editTextNome);
        buttonSaudacao = findViewById(R.id.buttonSaudacao);
        textViewSaudacao = findViewById(R.id.textViewSaudacao);

        buttonSaudacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //pegar a informação do edittext
                String nome = editTextNome.getText().toString();
                String saudacao = "Olá " + nome;
                textViewSaudacao.setText(saudacao);
            }
        });
    }
}
