package com.ckuandroid.okienkapowtorka;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void wyslij(View view) {
        Intent intentOkno2 = new Intent(this, OknoActivity2.class);
        EditText doWysylki = (EditText) findViewById(R.id.do_wysylki);
        String doWysylkiStr = doWysylki.getText().toString();
        intentOkno2.putExtra("do_wysylki", doWysylkiStr);
        //startActivity(intentOkno2);
        startActivityForResult(intentOkno2, 2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 2){
            String odpowiedzStr = data.getStringExtra("odpowiedz");
            TextView informacjaZwrotna = (TextView) findViewById(R.id.informacja_zwrotna);
            informacjaZwrotna.setText(odpowiedzStr);
        }
    }
}