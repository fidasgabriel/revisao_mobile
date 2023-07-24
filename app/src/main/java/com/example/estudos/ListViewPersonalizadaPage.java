package com.example.estudos;

import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.view.menu.MenuAdapter;

import java.util.ArrayList;
import java.util.List;

public class ListViewPersonalizadaPage extends AppCompatActivity {

    private ListView listView;

    private TextView explicacaoPersoListView;


    // instansiação nulla do MeuAdapter
    MeuAdapter adapter;


    // Criando duas listas VAZIAS com as informações que usaremos na ListView
    private List<String> listaRacas = new ArrayList<>();

    private List<Integer> listaQnt = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_personalizada_page);

        explicacaoPersoListView = findViewById(R.id.txtExplicacaoListViewPerso);

        // Atribuindo valor a lista
        listView = findViewById(R.id.listinhaPerso);



        // adicionando informações nas listas já criadas
        listaRacas.add("Border Collie");
        listaQnt.add(1);
        listaRacas.add("Chow-chow");
        listaQnt.add(1);
        listaRacas.add("Dobermann");
        listaQnt.add(1);

        explicacaoPersoListView.setText("A ListView Personalizada funciona de maneira parecida com a padrão, mas com algumas funcionalidades diferentes. Para uma ListView personalizada nós precisamos de uma classe de configuração (MeuAdapter), essa classe extende uma outra Interface chamada BaseAdapter (ela possibilita a estilização e outras funcionalidades de maneira personalizada). Nessa classe temos alguns atributos, o Context (contexto da aplicação no nosso caso vai ser instanciado como this), o LayoutInflater (é o cara que possibilita as alterações no layout), e alguns outros atributos que são as listas de informações (no nosso caso é uma lista de nomes de raças e outra lista com a quantidade das raças). Nós precisamos criar um arquivo de estilização para representar 1 e somente 1 item da lista (ele será referenciado no método getView, na classe MeuAdapter). Agora que temos a classe MeuAdapter e o arquivo de estilização prontos, na classe que a ListView será apresentada precisamos instanciar um MeuAdapter e passar os atributos na seguinte ordem (this (Context), listas (tanto a de raças quanto a de quantidades)). Assim ao iniciar a tela o design da lista com os itens estaram renderizados.");


        // atribuindo valor ao adapter (passando o contexto this, que indica que será renderizado NESSA tela, e passando as listas)
        adapter = new MeuAdapter(this, listaRacas, listaQnt);


        // usando o método setAdapter que configura o adapter da lista como o atribuído acima.
        listView.setAdapter(adapter);
    }
}