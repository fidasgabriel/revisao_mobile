package com.example.estudos;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtView = findViewById(R.id.titleMain);

        txtView.setText("Escolha alguma área de estudo:");

    }

    public void abrirTxtView(View view){
        startActivity(new Intent(this, TextViewPage.class));
    }

    public void abrirImg(View view){
        startActivity(new Intent(this, ImgPage.class));
    }

    public void abrirLisView(View view){
        startActivity(new Intent(this, ListViewPage.class));
    }
}