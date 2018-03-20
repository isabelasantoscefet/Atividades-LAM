package com.example.alunos.jogotentativas;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random gerador = new Random();
    private int num = gerador.nextInt(1000);
    private int tentativas = 10;
    EditText label;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void JogoTentativas(View v) {

        TextView txt = (TextView) findViewById(R.id.txt1);
        label = findViewById(R.id.editText);
        String sorteado = label.getText().toString();
        int n = Integer.parseInt(sorteado);
        if (n == this.num) {
            label.setText(getResources().getString(R.string.lblGanhou));
            SharedPreferences arquivo = getPreferences(Context.MODE_PRIVATE);
        } else if(n < this.num){
            label.setText(getResources().getString(R.string.lblMaior));
        } else if(n < this.num){
        label.setText(getResources().getString(R.string.lblMenor));
        }
        else{
            label.setText(getResources().getString(R.string.lblPerdeu));
            this.tentativas++;
        }


    }
}
