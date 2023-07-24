package com.example.estudos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MeuAdapter extends BaseAdapter {

//    Oi, minha gata :)
//    Vou comentar só essa classe pq é meio confusa...


    // esse aq é o contexto, se vc olhar na classe da lista personalizada, na instanciação
    // do MeuAdapter vai ser passado como "this", isso indica que onde sua ListView personalizada
    // vai aparecer na classe que faz referencia ao "this".
    // (se a classe q coloquei o this foi ListViewPersonalizadaPage, ent a lista vai aparecer lá).
    private Context context;


    // aq estão as listas das informações que serão utilizadas na lista, raça e quantidade
    private List<String> listaCachorrosRaca;

    private List<Integer> listCachorrosQnt;


    // o inflater é uma propriedade que possibilita estilização e outras propriedades do arquivo xml
    private LayoutInflater inflater;



    // aq nós temos o método construtor da classe, que recebe SOMENTE o contexto (vai ser o this, provavelmente)
    // e as listas de informações
    public MeuAdapter(Context context, List<String> listaCachorrosRaca, List<Integer> listCachorrosQnt){
        this.context = context; // atribuindo valor do contexto passado para a classe
        this.listaCachorrosRaca = listaCachorrosRaca; // atribuindo valor da lista
        this.listCachorrosQnt = listCachorrosQnt; // atribuindo valor da lista

        // aqui não é passado um valor diretamente para o inflater, pois ele consegue adquirir valor sozinho por
        // por meio do contexto.
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        // esse método é herdado da Interface BaseAdapter (todos os que tem o "@Override" são herdados tbm)
        // aq vc coloca a quantia de itens q vc quer q apareçam na lista, no meu caso estou colocando a lista inteira.
        return listaCachorrosRaca.size();
    }


    // nos 2 métodos abaixo eu n mexi pq n precisa, mas é possível configura-los futuramente.
    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


    // aq é o método q renderiza os ITENS da lista, os parametros já vem por padrão, só temos q usa-los corretamente
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        // essa view q tá aq indica o item como um inteiro (tudo junto, nome da raça e quantidade)
        // aq eu atribuo view apartir do inflater (que já pegou o contexto q eu quero) e pego o layout do arquivo
        // lista_perso_style (arquivo de personalização de cada item da lista), e esse null faz referência a um elemento
        // raiz.
        view = inflater.inflate(R.layout.lista_perso_style, null);

        // aq eu estou pegando os TextView's do arquivo da lista_perso_style e salvando em uma variável
        // ATENÇÃO: observe q tem o "view" antes do findViewById, isso significa q ele está pegando o valor de view
        // atribuído acima (sem o view antes ele não encontraria os id's).
        TextView raca = (TextView) view.findViewById(R.id.txtRaca);
        TextView qnt = (TextView) view.findViewById(R.id.txtQnt);

        // aq estou usando o método setText e passsando os textos q desejo para cada TextView, o médoto get(i)
        // retorna somente 1 item com o id "i" da lista, se vc olhar nos parametros da função o "i" já é passado automaticamente
        // ou seja ele vai retornar todos os itens pedidos (o valor de i pode mudar conforme o getCount(), q tá lá em cima,
        // se o getCount() retornar 5, ent o valor de "i" vai pegar somente os 5 primeiros itens).
        raca.setText("Raça: " + listaCachorrosRaca.get(i));
        qnt.setText("Qnt: " + listCachorrosQnt.get(i));

        // aq estou retornando a view como um inteiro, cada item da lista está sendo retormado.
        return view;
    }
}
