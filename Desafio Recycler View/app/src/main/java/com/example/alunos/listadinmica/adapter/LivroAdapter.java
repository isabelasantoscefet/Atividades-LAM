package com.example.alunos.listadinmica.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.alunos.listadinmica.R;
import com.example.alunos.listadinmica.model.Livro;

import java.util.ArrayList;
import java.util.List;

public class LivroAdapter extends RecyclerView.Adapter {

    private List<Livro> lista;
    private Context context;

    public LivroAdapter(ArrayList<Livro> l, Context c){
        this.lista = l;
        this.context = c;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(context)
                .inflate(R.layout.item_lista, parent, false);
        return new LivroViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(
            @NonNull RecyclerView.ViewHolder holder, int position){
        LivroViewHolder theHolder = (LivroViewHolder) holder;
        Livro livro = lista.get(position);
        theHolder.titulo.setText(livro.getTitulo());
        theHolder.autor.setText(livro.getAutor());
        theHolder.descricao.setText(livro.getDescricao());
    }

    @Override
    public int getItemCount(){
        return lista.size();
    }
}
