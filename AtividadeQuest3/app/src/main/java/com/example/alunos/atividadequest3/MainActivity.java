package com.example.alunos.atividadequest3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import java.util.Random;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Random gerador = new Random();
    private int num = gerador.nextInt(10);
    private int tentativas = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AtividadeQuest3(View v) {

        TextView txt = (TextView) findViewById(R.id.txt1);
        EditText label = findViewById(R.id.editText);
        String sorteado = label.getText().toString();
        int n = Integer.parseInt(sorteado);
        if (n == this.num) {
            txt.setText(getResources().getString(R.string.lblGanhou));
        } else if (this.tentativas > 0) {
            txt.setText(getResources().getString(R.string.lblPerdeu));
            this.tentativas--;
        } else if (this.tentativas == 0) {
            txt.setText(getResources().getString(R.string.lblTerminou));
        }

    }
}