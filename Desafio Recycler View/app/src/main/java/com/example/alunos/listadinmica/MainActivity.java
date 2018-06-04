package com.example.alunos.listadinmica;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;

import com.example.alunos.listadinmica.adapter.LivroAdapter;
import com.example.alunos.listadinmica.model.Livro;
import com.example.alunos.listadinmica.model.Pessoa;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Pessoa> lista = new ArrayList<>();
    private ArrayList<Livro> listaLivros;
    RecyclerView rview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listaLivros = new ArrayList<>();

        listaLivros.add(new Livro("O Senhor dos Anéis", "J. R. R. Tolkien",
                "Fantasia épica onde elfos, anões, hobbits e homens enfrentam os poderes do mal."));
        listaLivros.add(new Livro ("Uma breve história do Tempo", "Stephen W. Hawking",
                "Uma introdução a alhguns conceitos mais profundos da Física."));
        listaLivros.add(new Livro ("A espada da galáxia", "Marcelos Cassaro",
                "A premiada ficção científica onde alienígenas rivais resolvem suas disputas na Terra."));

        rview.setAdapter(new LivroAdapter(listaLivros,this));
        RecyclerView.LayoutManager layout = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);
        rview.setLayoutManager(layout);
    }

    public void mostrarLista(View v) {
        Intent it = new Intent(this, mostrarListaDinamica.class);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("livros",lista);
        it.putExtras(bundle);
        startActivity(it);
    }
    public void salvar(View v){
        EditText titulo = (EditText) findViewById(R.id.titulo);
        EditText autor = (EditText) findViewById(R.id.autor);
        EditText descricao = (EditText) findViewById(R.id.descricao);
        String titulo = titulo.getText().toString();
        String autor = autor.getText().toString();
        String descricao = descricao.getText().toString();
        lista.add(new Livro(titulo,autor,descricao,R.mipmap.ic_launcher_round));
    }
}
