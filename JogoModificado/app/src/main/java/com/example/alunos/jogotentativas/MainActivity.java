package com.example.alunos.jogotentativas;
import android.content.Intent;
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
    int[] vetor = new int[5];
    int[] vetor2 = new int[6];
    int certo, i, maior = 0, c;
    int var = 0;
    EditText label = findViewById(R.id.editText);
    TextView M = (TextView) findViewById(R.id.txt1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(i = 0; i<5; i++){
            vetor[i] = 0;
        }
        for(i = 0; i<6; i++){
            vetor2[i] = 0;
        }
    }
    public void JogoTentativas(View v) {
        String usuario = label.getText().toString();
        int n;
        n = Integer.parseInt(usuario);
        String msg;
        if (certo == 0) {
            if (n == num) {
                msg = "Parabéns! Você acertou! ";
                M.setText(msg);
                certo = 1;
                for(i = 0; i<5; i++){
                    if(i == 0){
                        var = vetor[i];
                        vetor[i] = c;
                    } else {
                        c = vetor[i];
                        vetor[i] = var;
                    }
                }
                for(i = 0; i<4; i++){
                    if(vetor[i] >= vetor[i+1]){
                        maior = vetor[i+1];
                    } else {
                        maior = vetor[i];
                    }
                }
            } else {
                ++c;
                msg = "Você errou!";
                if (n > num) {
                    msg += " O palpite foi maior";
                    M.setText(msg);
                } else {
                    msg += " O palpite foi menor";
                    M.setText(msg);
                }
            }
        } else {
            msg = "Você já acertou o número, clique no botão 'Jogar novamente'! ";
            M.setText(msg);
        }
    }
    public void Recomecar(View v){
        tentativas = 1;
        certo = 0;
        num = gerador.nextInt(1000);
        M.setText(getResources().getString(R.string.lblRecomecar));
    }
    public void carregarRecorde(View v){
        vetor2[0] = maior;
        vetor2[1] = vetor[0];
        vetor2[2] = vetor[1];
        vetor2[3] = vetor[2];
        vetor2[4] = vetor[3];
        vetor2[5] = vetor[4];
        Intent j = new Intent(MainActivity.this, Placar.class);
        Bundle bundle = new Bundle();
        bundle.putIntArray("vetor", vetor2);
        j.putExtras(bundle);
        startActivity(j);
    }
}