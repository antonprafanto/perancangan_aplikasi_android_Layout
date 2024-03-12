package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Mengakses elemen-elemen UI dari layout
        TableLayout mainTableLayout = findViewById(R.id.mainTableLayout);
        EditText editTextNama = findViewById(R.id.editTextNama);
        EditText editTextUsia = findViewById(R.id.editTextUsia);
        Button buttonSubmit = findViewById(R.id.buttonSubmit);

        // Menetapkan aksi klik pada tombol
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Mendapatkan nilai dari EditText
                String nama = editTextNama.getText().toString();
                String usia = editTextUsia.getText().toString();

                // Menampilkan pesan Toast dengan nilai yang diinputkan
                Toast.makeText(MainActivity.this, "Nama: " + nama + ", Usia: " + usia, Toast.LENGTH_SHORT).show();
            }
        });
    }
}