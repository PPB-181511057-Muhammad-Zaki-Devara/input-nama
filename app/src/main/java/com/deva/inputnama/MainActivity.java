package com.deva.inputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Deklarasi Variabel
    EditText textNama;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //panggil variabel berdasarkan id
        textNama = (EditText) findViewById(R.id.textNama);
        hasil = (TextView) findViewById(R.id.labelNama);
    }

    public void tampilNama(View v){
        hasil.setText("Nama anda : " + textNama.getText());
    }
}
