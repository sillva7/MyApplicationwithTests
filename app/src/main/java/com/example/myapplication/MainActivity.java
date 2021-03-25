package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvPhrase, tvResult;
    private EditText etPhrase, etIgnore;
    private Button btnReverse;
    private String TAG = "123123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViewElements();





        btnReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phrase = etPhrase.getText().toString();
                String ignore = etIgnore.getText().toString();
                Log.d(TAG, "onClick: " + phrase + "   " + ignore);
                tvPhrase.setText(phrase);
                tvResult.setText(StringRotation.reversePhrase(phrase, ignore));
            }
        });

    }

    private void initViewElements() {
        tvPhrase = findViewById(R.id.tvPhrase);
        tvResult = findViewById(R.id.tvResult);
        btnReverse = findViewById(R.id.btnReverse);
        etPhrase = findViewById(R.id.etPhrase);
        etIgnore = findViewById(R.id.etIgnore);
    }


}
