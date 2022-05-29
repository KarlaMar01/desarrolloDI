package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView editTextTextPersonName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextTextPersonName = findViewById( R.id.TextPersonName2 );
        editTextTextPersonName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PrincipalActivity.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Diste clic en *Forgot Password?*", Toast.LENGTH_SHORT).show();

            }
        });

        editTextTextPersonName = findViewById( R.id.textView4 );
        editTextTextPersonName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent2);

                Toast.makeText(MainActivity.this, "Diste clic en *Register Now*", Toast.LENGTH_SHORT).show();
            }
        });

        editTextTextPersonName = findViewById( R.id.textView5 );
        editTextTextPersonName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent3 = new Intent(MainActivity.this, TermsActivity.class);
                startActivity(intent3);

                Toast.makeText(MainActivity.this, "Diste clic en *Terms and Conditions*", Toast.LENGTH_SHORT).show();
            }
        });

    }
}