package com.ckuandroid.okienkapowtorka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class OknoActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okno2);
        Intent intentOkno2 = getIntent();
        String odebranaInformacjaStr = intentOkno2.getStringExtra("do_wysylki");
        TextView odebranaInformacja = (TextView) findViewById(R.id.odebrana_informacja);
        odebranaInformacja.setText(odebranaInformacjaStr);
    }

    public void wyslijOdpowiedz(View view) {
        EditText odpowiedz = (EditText) findViewById(R.id.odpowiedz);
        String odpowiedzStr = odpowiedz.getText().toString();
        Intent intentOknoGlowne = new Intent();
        intentOknoGlowne.putExtra("odpowiedz", odpowiedzStr);
        setResult(2, intentOknoGlowne);
        finish();
    }
}