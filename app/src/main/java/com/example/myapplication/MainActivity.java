package com.example.myapplication;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Mengakses elemen UI dari layout
        ConstraintLayout mainLayout = findViewById(R.id.mainLayout);
        TextView judulTextView = findViewById(R.id.judulTextView);
        ImageView ikonImageView = findViewById(R.id.ikonImageView);
        Button tombolButton = findViewById(R.id.tombolButton);
        progressBar = findViewById(R.id.progressBar);

        // Menetapkan aksi klik pada tombol
        tombolButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Menjalankan tugas yang memakan waktu
                lakukanTugas();
            }
        });
    }

    private void lakukanTugas() {
        // Menampilkan ProgressBar
        progressBar.setVisibility(View.VISIBLE);

        // Menunda tugas selama 2 detik
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Menyembunyikan ProgressBar setelah tugas selesai
                progressBar.setVisibility(View.INVISIBLE);
            }
        }, 2000);
    }
}