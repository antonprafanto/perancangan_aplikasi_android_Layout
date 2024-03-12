package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Mengakses elemen-elemen UI dari layout
        LinearLayout mainLayout = findViewById(R.id.mainLayout);
        TextView textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);

        // Memberikan aksi klik pada button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Aksi yang ingin dilakukan saat tombol diklik
                textView.setText("Tombol telah diklik!");
            }
        });
    }
}