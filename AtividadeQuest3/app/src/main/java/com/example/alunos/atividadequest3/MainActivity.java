package com.example.alunos.atividadequest3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Scanner;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public class AtividadeQuest3{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            Random r = new Random();
            int num = r.nextInt(10) + 1;
            int tent = 3;
            do{
                System.out.println("Digite um numero inteiro:");
                int n = Integer.parseInt(input.next());
                if(n == num){
                    System.out.println("Vc acertou!!");
                }else{
                    System.out.println("Vc errou!!");
                    tent--;
                }
            }while(tent !=0);
        }
    }
}
