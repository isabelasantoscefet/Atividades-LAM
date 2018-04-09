package com.example.alunos.jogotentativas;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import java.util.Arrays;
public class Placar extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.placar);
        Intent intencao = getIntent();
        Bundle pacote = intencao.getExtras();
        SharedPreferences arquivo;
        String r1 = "", r2 = "", r3 = "", r4 = "", r5 = "", Maior = "", m = "";
        int[] vetor = new int[6];
        vetor = pacote.getIntArray("vetor");
        int maior = vetor[0], R1 = vetor[1], R2 = vetor[2], R3 = vetor[3], R4 = vetor[4], R5 = vetor[5];
        TextView txtR1 = (TextView) findViewById(R.id.textR1);
        TextView txtR2 = (TextView) findViewById(R.id.textR2);
        TextView txtR3 = (TextView) findViewById(R.id.textR3);
        TextView txtR4 = (TextView) findViewById(R.id.textR4);
        TextView txtR5 = (TextView) findViewById(R.id.textR5);
        TextView txtmaior = (TextView) findViewById(R.id.textMaior);
        Maior = Integer.toString(maior);
        if (Maior.matches("0")){
            arquivo = getPreferences(Context.MODE_PRIVATE);
            Maior = arquivo.getString("valor", m);
            Log.i("Maior", m);
        } else {
            m = Maior;
            r1 = Integer.toString(R1);
            r2 = Integer.toString(R2);
            r3 = Integer.toString(R3);
            r4 = Integer.toString(R4);
            r5 = Integer.toString(R5);
            arquivo = getPreferences(Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = arquivo.edit();
            editor.putString("maior", m);
            editor.commit();
        }
        txtR1.setText(r1);
        txtR2.setText(r2);
        txtR3.setText(r3);
        txtR4.setText(r4);
        txtR5.setText(r5);
        txtmaior.setText(Maior);
    }
}