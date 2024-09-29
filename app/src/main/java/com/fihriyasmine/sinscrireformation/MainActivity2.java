package com.fihriyasmine.sinscrireformation;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);

            TextView tvName = findViewById(R.id.tv_name);
            TextView tvEmail = findViewById(R.id.tv_email);
            TextView tvPhone = findViewById(R.id.tv_phone);
            TextView tvAddress = findViewById(R.id.tv_address);
            TextView tvVille = findViewById(R.id.tv_ville);

            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                String name = extras.getString("name");
                String email = extras.getString("email");
                String phone = extras.getString("phone");
                String address = extras.getString("address");
                String ville = extras.getString("ville");

                tvName.setText("Nom & Prénom: " + name);
                tvEmail.setText("Email: " + email);
                tvPhone.setText("Téléphone: " + phone);
                tvAddress.setText("Adresse: " + address);
                tvVille.setText("Ville: " + ville);
            }

            Button quitter=findViewById(R.id.quitter);
            quitter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(MainActivity2.this,firstActivity.class);
                    startActivity(intent);
                }
            });
        }
}