package com.example.alunos.jogotentativas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random gerador = new Random();
    int num = gerador.nextInt(1000);
    int tentativas = 0;
    EditText label;
    int vetor[] = new int[5];
    int partidas, certo;
    TextView txt = (TextView) findViewById(R.id.txt1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        certo = 0;
    }

    public void JogoTentativas(View v) {

        label = findViewById(R.id.editText);
        String sorteado = label.getText().toString();
        int n = Integer.parseInt(sorteado);

        if(certo == 0) {
            if (n == this.num) {
                txt.setText(getResources().getString(R.string.lblGanhou));
            } else if (n < this.num) {
                txt.setText(getResources().getString(R.string.lblMaior));
                this.tentativas++;
            } else if (n > this.num) {
                txt.setText(getResources().getString(R.string.lblMenor));
                this.tentativas++;
            } else {
                txt.setText(getResources().getString(R.string.lblTerminou));
                this.tentativas++;
            }
        }else{
            txt.setText(getResources().getString(R.string.lblFim));
        }
    }

    public void Recomecar(View v){
        tentativas = 1;
        certo = 0;
        num = gerador.nextInt(1000);
        txt.setText(getResources().getString(R.string.lblRecomecar));
    }
}
