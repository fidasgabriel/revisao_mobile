package com.example.estudos;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class TextViewPage extends AppCompatActivity {

    private EditText edt;

    private TextView txtExplicacao;

    private Button btnConverter;

    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view_page);

        edt = findViewById(R.id.digiteTxt);
        txtExplicacao = findViewById(R.id.explicacaoTxtView);
        btnConverter = findViewById(R.id.btnConvertTxt);
        txtResultado = findViewById(R.id.resultadoTxt);

        txtExplicacao.setText("Ao digitar no Plain Text acima, no código ele estará fazendo a captura desse elemento por meio do id. Quando clicar no botão de converter, será usado o método getText() (é presente nos PlainText's e TextView's), e em seguida utilizando o método setText() (também presente nos dois elementos já antes citados), para deixar o texto desejado no resultado.");

    }

    public void converterEdtText(View view){
        String valorEditText = edt.getText().toString();
        txtResultado.setText(valorEditText);
    }
}