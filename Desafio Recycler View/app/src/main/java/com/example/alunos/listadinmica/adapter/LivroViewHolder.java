package com.example.alunos.listadinmica.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.alunos.listadinmica.R;

public class LivroViewHolder extends RecyclerView.ViewHolder {
    final TextView titulo;
    final TextView autor;
    final TextView descricao;

    public LivroViewHolder(View itemView){
        super(itemView);
        titulo = itemView.findViewById(R.id.txtTitulo);
        autor = itemView.findViewById(R.id.txtAutor);
        descricao = itemView.findViewById(R.id.txtDesc);
    }
}
