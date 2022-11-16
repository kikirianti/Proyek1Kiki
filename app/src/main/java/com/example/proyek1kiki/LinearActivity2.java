package com.example.proyek1kiki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LinearActivity2 extends AppCompatActivity {
    Button button;
    EditText ekepada,subyek,pesan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear2);
        button = findViewById(R.id.kirim);
        ekepada = findViewById(R.id.kepada);
        pesan = findViewById(R.id.pesan);
        subyek = findViewById(R.id.subyek);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LinearActivity2.this,LinearActivity3.class);
                intent.putExtra("kepada",ekepada.getText().toString());
                intent.putExtra("subyek",subyek.getText().toString());
                intent.putExtra("pesan",pesan.getText().toString());
                startActivity(intent);

            }
        });
    }
}