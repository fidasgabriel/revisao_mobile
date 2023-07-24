package com.example.estudos;

import android.content.Intent;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class ListViewPage extends AppCompatActivity {

    private TextView txtTitleListViewSimple;

    private ListView listView;

    private TextView txtExplicacaoListViewSimples;

    private ArrayList<String> listaItens = new ArrayList<>();

    private ArrayAdapter<String> adapter;

    private Button btnNextList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_page);

        listaItens.add("Border Collie");
        listaItens.add("Chow-chow");
        listaItens.add("Dobermann");
        txtTitleListViewSimple = findViewById(R.id.titleSimpleListView);
        listView = findViewById(R.id.listinha);
        txtExplicacaoListViewSimples = findViewById(R.id.explicacaoListViewSimples);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaItens);
        btnNextList = findViewById(R.id.btnNextList);

        txtTitleListViewSimple.setText("ListView Simples: ");
        txtExplicacaoListViewSimples.setText("A ListView acima já vem por padrão do modelo android, seu nome é simple_list_item_1, existem outros tipos de ListView padrões. Para que as informações apareçam na lista é necessário armazenar a ListView pelo seu id e criar um ArrayAdapter (o adapter é um 'controlador', ele é o cara que configura toda a lista). Nele colocamos o contexto (this, indica que vai ser na tela atual), o tipo da lista (android.R.layout.simple_list_item_1, indica que será a lista simples padrão do android) e sua lista de informações (no nosso caso um Array<String>, indica que teremos informações de texto em cada linha da lista). Após criar o adapter, usaremos o método setAdapter() na lista para que ela recebas as configurações desejadas.");
        btnNextList.setText("ListView Personalizada ->");
        listView.setAdapter(adapter);
    }

    public void proximaListView(View view){
        startActivity(new Intent(this, ListViewPersonalizadaPage.class));
    }

}