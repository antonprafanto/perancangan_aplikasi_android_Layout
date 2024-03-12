package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Mengakses elemen-elemen UI dari layout
        RelativeLayout mainLayout = findViewById(R.id.mainLayout);
        TextView textView = findViewById(R.id.textView);
        ImageView imageView = findViewById(R.id.imageView);
        Button button = findViewById(R.id.button);
        EditText editText = findViewById(R.id.editText);

        // Memberikan aksi klik pada button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Aksi yang ingin dilakukan saat tombol diklik
                String userInput = editText.getText().toString();
                textView.setText("Anda memasukkan: " + userInput);
            }
        });
    }
}