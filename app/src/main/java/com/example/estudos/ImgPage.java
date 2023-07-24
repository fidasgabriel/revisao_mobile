package com.example.estudos;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.Random;

public class ImgPage extends AppCompatActivity {

    private TextView imgTitulo;

    private ImageView imgTrocar;

    private TextView txtExplicarImg;

    private Button btnTrocarImg;

    private int ultimaImgIndicie = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img_page);

        imgTitulo = findViewById(R.id.titleImage);
        txtExplicarImg = findViewById(R.id.explicacaoImg);
        imgTrocar = findViewById(R.id.trocarImg);
        imgTitulo.setText("Imagens:");
        txtExplicarImg.setText("Ao clicar no botão, será acionado um método que escolhe uma imagem aleatória dentro de uma lista. Para que a imagem escolhida aleatoriamente seja mostrada na tela, nós capturamos o elemento pelo seu id e usamos o método setImageResource() que passamos como parâmetro o arquivo drawable da imagem (drawable é onde está localizada a sua imagem).");
        imgTrocar.setImageResource(R.drawable.ic_launcher_background);
    }

    public void trocarImg(View view){
        int[] imagens = {
                R.drawable.panda1,
                R.drawable.panda2,
                R.drawable.panda3,
                R.drawable.panda4,
                R.drawable.panda5
        };
        Random numAleatorio = new Random();
        int indicieAleatorio;
        do {
            indicieAleatorio = numAleatorio.nextInt(imagens.length);
        } while (indicieAleatorio == ultimaImgIndicie);

        ultimaImgIndicie = indicieAleatorio;

        int imagemAleatoria = imagens[indicieAleatorio];

        imgTrocar.setImageResource(imagemAleatoria);
    }
}