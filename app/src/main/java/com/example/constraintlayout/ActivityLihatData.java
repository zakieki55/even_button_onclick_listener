package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity {


    TextView tvnama, tvnomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);

        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("x");

        switch (nama){
            case "Inayah":
                tvnama.setText("Inayah M");
                tvnomor.setText("082132546453");
                break;
            case "Ilham":
                tvnama.setText("Ilham R");
                tvnomor.setText("082132546453");
                break;
            case "Eris":
                tvnama.setText("Eris J");
                tvnomor.setText("082132546453");
                break;
            case "Fikri":
                tvnama.setText("Fikri B");
                tvnomor.setText("082132546453");
                break;
            case "Maul":
                tvnama.setText("Maul A");
                tvnomor.setText("082132546453");
                break;
            case "Intan":
                tvnama.setText("Intan P");
                tvnomor.setText("082132546453");
                break;
            case "Vina":
                tvnama.setText("Vina P");
                tvnomor.setText("082132546453");
                break;
            case "Gita":
                tvnama.setText("Gita S");
                tvnomor.setText("082132546453");
                break;
            case "Lutfi":
                tvnama.setText("Lutfi M");
                tvnomor.setText("082132546453");
                break;
            case "Vian":
                tvnama.setText("Vian V");
                tvnomor.setText("082132546453");
                break;
        }
    }
}